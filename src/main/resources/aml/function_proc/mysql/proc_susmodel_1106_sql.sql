﻿CREATE DEFINER=`aml`@`%` PROCEDURE `proc_susmodel_1106`(in dt_date varchar(20))
BEGIN
    /*
  可疑模型代码：1106
  可疑模型描述：外国政要交易检测
  可疑模型参数引用：
  */  
	declare v_suspcs_code varchar(8); -- 可疑事件识别码
 	declare v_trans_code  varchar(32); -- 可疑交易编号
 	declare v_dt_date     varchar(20); -- 数据日期
 	declare v_tosc        varchar(4000); -- 涉嫌犯罪类型
 	declare v_stcr        varchar(4000); -- 可疑特征码
	declare v_stcb        varchar(4000); -- 资金交易及客户行为情况
	declare v_aosp        varchar(4000); -- 疑点分析
	declare null_flag        varchar(10); -- 空标识
	declare ret_cur_suspcs_black int DEFAULT 0;
	
		drop table if exists aml_foreign_dignitaries_trans;
	  create table aml_foreign_dignitaries_trans
    (
    trans_code  varchar(200),
    v_stcr      varchar(2000),
    v_tosc      varchar(2000),
    v_stcb      varchar(2000),
    v_aosp      varchar(2000)
    );
			
	
  select cast(dt_date as date) into v_dt_date from dual;
	 -- 加载基础数据到中间表
	 set @v_sql = 'truncate table aml_transaction_run';
   PREPARE stmt1 FROM @v_sql;
	 EXECUTE stmt1;
	 DEALLOCATE PREPARE stmt1;
  insert into aml_transaction_run
    select *
      from aml_transaction
     where suspcs_flag = '1'
       and date_id = v_dt_date;

  -- 检索获取可疑模型识别码
  select case when count(1) = 0 then 
	(select func_suspcs_code(max(suspcs_cdoe))
    from aml_suspcs_case
   where date_id = v_dt_date and suspcs_model_code <> '1106')
	 else suspcs_cdoe end
    into v_suspcs_code
    from aml_suspcs_case
   where date_id = v_dt_date and suspcs_model_code = '1106';
	 
	 
	 
	 -- 对私客户证件
	 insert into aml_foreign_dignitaries_trans
	 select atr.trans_code trans_code, -- 交易流水编号
			'80501' stcr,
			ams.TOSCs tosc, -- 犯罪类型
			concat('交易金额',trans_amount_cny,'元') stcb,
			'对私客户证件涉嫌外国政要记录' aosp 
        from aml_transaction_run atr
        left join aml_customer_personal_run acps
          on atr.customer_no = acps.customer_no
         and acps.date_id = v_dt_date
		    left join aml_stcr ams on ams.featureCode = '80501'
				inner join (select * from aml_foreign_dignitaries where dign_user_crtft_number is not null or dign_user_crtft_number <> '') afd on concat(afd.dign_user_crtft_type , afd.dign_user_crtft_number) =
             concat(acps.crtft_type , acps.crtft_number)
       where 1 = (select enable from aml_stcr where featurecode = '80501');
						 		 
			 
      -- 对公法人证件
			insert into aml_foreign_dignitaries_trans
	 select atr.trans_code trans_code, -- 交易流水编号
			'80502' stcr,
			ams.TOSCs tosc, -- 犯罪类型
			concat('交易金额',trans_amount_cny,'元') stcb,
			'对公客户法人证件涉嫌外国政要记录' aosp 
        from aml_transaction_run atr
        left join aml_customer_public_run acpg
          on atr.customer_no = acpg.customer_no
         and acpg.date_id = v_dt_date
		    left join aml_stcr ams on ams.featureCode = '80502'
				inner join (select * from aml_foreign_dignitaries where dign_user_crtft_number is not null or dign_user_crtft_number <> '') afd on concat(afd.dign_user_crtft_type , afd.dign_user_crtft_number) =
             concat(acpg.legal_crtft_type ,  acpg.legal_crtft_number)
       where 1 = (select enable from aml_stcr where featurecode = '80502');
			 
			 
      -- 对公股东证件
			 insert into aml_foreign_dignitaries_trans
    	 select atr.trans_code trans_code, -- 交易流水编号
			'80503' stcr,
			ams.TOSCs tosc, -- 犯罪类型
			concat('交易金额',trans_amount_cny,'元') stcb,
			'对公客户股东证件涉嫌外国政要记录' aosp 
        from aml_transaction_run atr
        left join aml_customer_public_run acpg
          on atr.customer_no = acpg.customer_no
         and acpg.date_id = v_dt_date
				left join aml_stcr ams on ams.featureCode = '80503'
				inner join (select * from aml_foreign_dignitaries where dign_user_crtft_number is not null or dign_user_crtft_number <> '') afd on concat(afd.dign_user_crtft_type , afd.dign_user_crtft_number) =
             concat(acpg.controller_crtft_type , acpg.controller_crtft_number)
        where 1 = (select enable from aml_stcr where featurecode = '80503');
				
				
				
      -- 对公受益人证件
      insert into aml_foreign_dignitaries_trans
    	 select atr.trans_code trans_code, -- 交易流水编号
			'80504' stcr,
			ams.TOSCs tosc, -- 犯罪类型
			concat('交易金额',trans_amount_cny,'元') stcb,
			'对公客户受益人证件涉嫌外国政要记录' aosp 
        from aml_transaction_run atr
        left join aml_customer_beneficiary_run acb
          on atr.customer_no = acb.customer_no
         and acb.date_id = v_dt_date
				 left join aml_stcr ams on ams.featureCode = '80504'
				 inner join (select * from aml_foreign_dignitaries where dign_user_crtft_number is not null or dign_user_crtft_number <> '') afd on concat(afd.dign_user_crtft_type , afd.dign_user_crtft_number) =
             concat(acb.profit_crtft_type , acb.profit_crtft_no)
        where 1 = (select enable from aml_stcr where featurecode = '80504');
			 
      -- 交易对手证件
     insert into aml_foreign_dignitaries_trans
    	 select atr.trans_code trans_code, -- 交易流水编号
			'80505' stcr,
			ams.TOSCs tosc, -- 犯罪类型
			concat('交易金额',trans_amount_cny,'元') stcb,
			'交易对手证件涉嫌外国政要记录' aosp 
        from aml_transaction_run atr
         left join aml_stcr ams on ams.featureCode = '80505'
				 inner join (select * from aml_foreign_dignitaries where dign_user_crtft_number is not null or dign_user_crtft_number <> '') afd on concat(afd.dign_user_crtft_type , afd.dign_user_crtft_number) =
             concat(atr.other_customer_crtft_type ,atr.other_customer_crtft_number)
        where 1 = (select enable from aml_stcr where featurecode = '80505');
			
      -- 交易代办人证件
      insert into aml_foreign_dignitaries_trans
    	 select atr.trans_code trans_code, -- 交易流水编号
			'80506' stcr,
			ams.TOSCs tosc, -- 犯罪类型
			concat('交易金额',trans_amount_cny,'元') stcb,
			'交易代办人证件涉嫌外国政要记录' aosp 
        from aml_transaction_run atr
	      left join aml_stcr ams on ams.featureCode = '80506'
				inner join (select * from aml_foreign_dignitaries where dign_user_crtft_number is not null or dign_user_crtft_number <> '') afd on concat(afd.dign_user_crtft_type , afd.dign_user_crtft_number) =
             concat(atr.agent_user_crtft_type , atr.agent_user_crtft_number)
        where 1 = (select enable from aml_stcr where featurecode = '80506');
			
			 
			 -- 对私客户姓名
			 insert into aml_foreign_dignitaries_trans
    	 select atr.trans_code trans_code, -- 交易流水编号
			'80507' stcr,
			ams.TOSCs tosc, -- 犯罪类型
			concat('交易金额',trans_amount_cny,'元') stcb,
			'对私客户姓名涉嫌外国政要记录' aosp 
        from aml_transaction_run atr
        left join aml_customer_personal_run acps
          on atr.customer_no = acps.customer_no
         and acps.date_id = v_dt_date
	      left join aml_stcr ams on ams.featureCode = '80507'
        inner join (select * from aml_foreign_dignitaries where dign_user_name is not null or dign_user_name <> '') afd 
          on acps.customer_name = afd.dign_user_name
       where 1 = (select enable from aml_stcr where featurecode = '80507');
			
			
      -- 对公法人姓名
			 insert into aml_foreign_dignitaries_trans
			 select atr.trans_code trans_code, -- 交易流水编号
			'80508' stcr,
			ams.TOSCs tosc, -- 犯罪类型
			concat('交易金额',trans_amount_cny,'元') stcb,
			'对公客户法人姓名涉嫌外国政要记录' aosp 
        from aml_transaction_run atr
       left join aml_customer_public_run acpg
          on atr.customer_no = acpg.customer_no
         and acpg.date_id = v_dt_date
	      left join aml_stcr ams on ams.featureCode = '80508'
			 inner join (select * from aml_foreign_dignitaries where dign_user_name is not null or dign_user_name <> '') afd 
          on acpg.legal_name = afd.dign_user_name
       where 1 = (select enable from aml_stcr where featurecode = '80508');
					
			
      -- 对公股东姓名
			 insert into aml_foreign_dignitaries_trans
			 select atr.trans_code trans_code, -- 交易流水编号
			'80509' stcr,
			ams.TOSCs tosc, -- 犯罪类型
			concat('交易金额',trans_amount_cny,'元') stcb,
			'对公客户股东姓名涉嫌外国政要记录' aosp 
        from aml_transaction_run atr
       left join aml_customer_public_run acpg
          on atr.customer_no = acpg.customer_no
         and acpg.date_id = v_dt_date
	      left join aml_stcr ams on ams.featureCode = '80509'
			 inner join (select * from aml_foreign_dignitaries where dign_user_name is not null or dign_user_name <> '') afd 
          on acpg.controller_name = afd.dign_user_name
       where 1 = (select enable from aml_stcr where featurecode = '80509');	
			
			
      -- 对公受益人姓名
			 insert into aml_foreign_dignitaries_trans
			 select atr.trans_code trans_code, -- 交易流水编号
			'80510' stcr,
			ams.TOSCs tosc, -- 犯罪类型
			concat('交易金额',trans_amount_cny,'元') stcb,
			'对公客户受益人姓名涉嫌外国政要记录' aosp 
        from aml_transaction_run atr
				left join aml_customer_beneficiary_run acb
          on atr.customer_no = acb.customer_no
         and acb.date_id = v_dt_date
	      left join aml_stcr ams on ams.featureCode = '80510'
			 inner join (select * from aml_foreign_dignitaries where dign_user_name is not null or dign_user_name <> '') afd 
          on acb.profit_name = afd.dign_user_name
       where 1 = (select enable from aml_stcr where featurecode = '80510');	
			
			 
      -- 交易对手姓名
			insert into aml_foreign_dignitaries_trans
      select atr.trans_code trans_code, -- 交易流水编号
			'80511' stcr,
			ams.TOSCs tosc, -- 犯罪类型
			concat('交易金额',trans_amount_cny,'元') stcb,
			'交易对手姓名涉嫌外国政要记录' aosp 
        from aml_transaction_run atr
	      left join aml_stcr ams on ams.featureCode = '80511'
			inner join (select * from aml_foreign_dignitaries where dign_user_name is not null or dign_user_name <> '') afd
          on atr.other_customer_name = afd.dign_user_name
        where 1 = (select enable from aml_stcr where featurecode = '80511');
			
			
      -- 交易代办人姓名
			insert into aml_foreign_dignitaries_trans
      select atr.trans_code trans_code, -- 交易流水编号
			'80512' stcr,
			ams.TOSCs tosc, -- 犯罪类型
			concat('交易金额',trans_amount_cny,'元') stcb,
			'交易代办人姓名涉嫌外国政要记录' aosp 
        from aml_transaction_run atr
	      left join aml_stcr ams on ams.featureCode = '80512'
			 inner join (select * from aml_foreign_dignitaries where dign_user_name is not null or dign_user_name <> '') afd
          on atr.agent_user_name = afd.dign_user_name
        where 1 = (select enable from aml_stcr where featurecode = '80512');
		
									  DROP table if exists aml_func_dist_str_tmp01;
	                  create table aml_func_dist_str_tmp01(str1 varchar(2000));
		
	BEGIN
		declare cur_suspcs_black_ cursor for
		SELECT t.trans_code,func_dist_str(GROUP_CONCAT(t.v_stcr),','),func_dist_str(GROUP_CONCAT(t.v_tosc),','),func_dist_str(GROUP_CONCAT(t.v_stcb),','),func_dist_str(GROUP_CONCAT(t.v_aosp),',') FROM aml_foreign_dignitaries_trans t GROUP BY trans_code;
		
		declare continue handler for not FOUND set ret_cur_suspcs_black = 1;
    -- 开启游标
		OPEN cur_suspcs_black_;
	  
		-- 插入前删除事件交易明细记录
		delete FROM aml_suspcs_case_detail where date_id = v_dt_date and suspcs_model_code = '1106';
		
		CUR_Loop:LOOP
    -- 循环获取可疑交易流水编号
	  FETCH cur_suspcs_black_ into v_trans_code,v_stcr,v_tosc,v_stcb,v_aosp;
		 if ret_cur_suspcs_black = 1 THEN
	            LEAVE CUR_Loop;
		 else
		 
		 -- 循环插入最新事件交易明细记录
      insert into aml_suspcs_case_detail
        (AUTO_ID,
         DATA_FROM,
         DELETE_STATE,
         data_state,
         CHECK_STATE,
         AUDIT_OPINION,
         AUDIT_STATE,
         AUDIT_TYPE_STATE,
         suspcs_cdoe,
         suspcs_model_code,
         DATE_ID,
         TRANS_CODE,
         BRANCH_CODE,
         CUSTOMER_TYPE,
         CUSTOMER_NO,
         CUSTOMER_NAME,
         ACCT_CODE,
         TRANS_AMOUNT,
         TRANS_USE,
         CURRENCY,
         PAYMENT_FLAG,
         TRANS_TYPE,
         TRANS_DATE,
         TRANS_nationality,
         TRANS_address,
         TOSC,
         STCR,
         STCB,
         AOSP,
         SEVC,
         SENM,
         SETP,
         OITP,
         SEID,
         STNT,
         SCIF,
         SRNM,
         SRIT,
         ORIT,
         SRID,
         SCNM,
         SCIT,
         OCIT,
         SCID,
         SCBA,
         SCBN,
         OTHER_INST_LATTICE_NAME,
         OTHER_INST_LATTICE_TYPE,
         OTHER_INST_LATTICE_CODE,
         OTHER_INST_LATTICE_AREA,
         OTHER_CUSTOMER_NAME,
         OTHER_CUSTOMER_CRTFT_TYPE,
         OTHER_CUSTOMER_CRTFT_NUMBER,
         OTHER_CUSTOMER_ACCT_TYPE,
         OTHER_CUSTOMER_ACCT_CODE,
         AGENT_USER_NAME,
         AGENT_USER_CRTFT_TYPE,
         AGENT_USER_CRTFT_NUMBER,
         AGENT_USER_NATIONALITY)
        select uuid() AUTO_ID, t.*
          from (select distinct '0' DATA_FROM,
                                '0' DELETE_STATE,
                                '4' data_state,
                                '0' CHECK_STATE, -- 校验状态 0 未校验；1 校验失败；2 校验部分成功；3 校验成功
                                '' AUDIT_OPINION, -- 审核意见
                                '0' AUDIT_STATE, -- 审核状态 2 初审驳回；0  未审核；4 终审通过；6  复审通过；1  复审驳回；3  初审通过；5  终审驳回
                                '1' AUDIT_TYPE_STATE, -- 报送标识 1 上报；2 不上报
                                v_suspcs_code SUSPCS_CODE, -- 可疑事件识别码
                                '1106' suspcs_model_code, -- 可疑模型编码
                                v_dt_date DATE_ID, -- 数据日期
                                atr.trans_code TRANS_CODE, -- 交易流水号
                                atr.branch_code BRANCH_CODE, -- 机构号
                                atr.customer_type CUSTOMER_TYPE, -- 客户类型 1对私 ；2对公
                                atr.customer_no CUSTOMER_NO, -- 客户编号
                                atr.customer_name CUSTOMER_NAME, -- 客户姓名
                                atr.acct_code ACCT_CODE, -- 账号
                                atr.trans_amount TRANS_AMOUNT, -- 交易金额
                                atr.trans_use TRANS_USE, -- 资金用途
                                atr.currency CURRENCY, -- 客户国籍
                                atr.payment_flag PAYMENT_FLAG, -- 资金收付标识 01 收；02 付
                                atr.trans_type TRANS_TYPE, -- 易方式
                                atr.trans_date TRANS_DATE, -- 交易日期
																atr.trans_nationality trans_nationality, -- 交发生地国籍
																atr.trans_address trans_address, -- 交发生地代码
                                v_tosc TOSC, -- 可疑犯罪类型
                                v_stcr STCR, -- 可疑特征码
                                v_stcb STCB, -- 客户资金行为情况
                                v_aosp AOSP, -- 疑点分析
                                case atr.customer_type WHEN
                                       '1' then
                                       acps.industry_code WHEN
                                       '2' then
                                       acpg.industry_code END SEVC, -- 可疑主体职业（对私）或行业（对公）
                                case atr.customer_type WHEN
                                       '1' then
                                       acps.customer_name WHEN
                                       '2' then
                                       acpg.customer_name END SENM, -- 可疑主体姓名/名称
                                case atr.customer_type WHEN
                                       '1' then
                                       acps.crtft_type WHEN
                                       '2' then
                                       acpg.crtft_type  END SETP, -- 可疑主体身份证件/证明文件类型
                                case atr.customer_type WHEN
                                       '1' then
                                       acps.other_crtft_type WHEN
                                       '2' then
                                       acpg.other_crtft_type END OITP, -- 其他身份证件/证明文件类型
                                case atr.customer_type WHEN
                                       '1' then
                                       acps.crtft_number WHEN
                                       '2' then
                                       acpg.crtft_number END SEID, -- 可疑主体身份证件/证明文件号码
                                case atr.customer_type WHEN
                                       '1' then
                                       (case when acps.nationality_code2 is null or acps.nationality_code2 = '' then
                                          acps.nationality_code1
                                         else
                                          concat(acps.nationality_code1,',',acps.nationality_code2)
                                       end)  WHEN
                                       '2' then
                                       (case when acpg.nationality_code2  
																			     is null or acpg.nationality_code2 = '' then
                                          acpg.nationality_code1
                                       else
                                          concat(acpg.nationality_code1,',',acpg.nationality_code2)
                                       end) end STNT, -- 可疑主体国籍
                                       case  atr.customer_type when
                                       '1' then
                                       (case when acps.phone_number2 
                                          is null or acps.phone_number2  = '' then
                                          acps.phone_number1
                                         else
                                          concat(acps.phone_number1 , ',' , acps.phone_number2)
                                       end) WHEN
                                       '2' then
                                       (case when acpg.phone_number2 
                                          is null or acpg.phone_number2  = '' then
                                          acpg.phone_number1
                                         else
                                          concat(acpg.phone_number1 , ',' ,acpg.phone_number2)
                                       end)
																			end SCIF, -- 可疑主体联系方式
                                acpg.legal_name SRNM, -- 可疑主体法定代表人姓名
                                acpg.legal_crtft_type SRIT, -- 可疑主体法定代表人证件类型
                                acpg.legal_other_crtft_type ORIT, -- 法定代表人其他证件类型
                                acpg.legal_crtft_number SRID, -- 可疑主体法定代表人身份证件号码
                                acpg.controller_name SCNM, -- 可疑主体控股股东或实际控制人名称
                                acpg.controller_crtft_type SCIT, -- 可疑主体控股股东或实际控制人身份证件/证明文件类型
                                acpg.controller_oher_crtft_type OCIT, -- 可疑主体控股股东或实际控制人身份证件/证明文件类型
                                acpg.controller_crtft_number SCID, -- 可疑主体控股股东或实际控制人身份证件/证明文件号码
                                atr.bank_card_code SCBA, -- 可疑主体所在银行账号
                                atr.bank_card_name SCBN, -- 可疑主体所在银行名称
                                atr.other_inst_lattice_name OTHER_INST_LATTICE_NAME,
                                atr.other_inst_lattice_type OTHER_INST_LATTICE_TYPE,
                                atr.other_inst_lattice_code OTHER_INST_LATTICE_CODE,
                                atr.other_inst_lattice_area OTHER_INST_LATTICE_AREA,
                                atr.other_customer_name OTHER_CUSTOMER_NAME,
                                atr.other_customer_crtft_type OTHER_CUSTOMER_CRTFT_TYPE,
                                atr.other_customer_crtft_number OTHER_CUSTOMER_CRTFT_NUMBER,
                                atr.other_customer_acct_type OTHER_CUSTOMER_ACCT_TYPE,
                                atr.other_customer_acct_code OTHER_CUSTOMER_ACCT_CODE,
                                atr.agent_user_name AGENT_USER_NAME,
                                atr.agent_user_crtft_type AGENT_USER_CRTFT_TYPE,
                                atr.agent_user_crtft_number AGENT_USER_CRTFT_NUMBER,
                                atr.agent_user_nationality AGENT_USER_NATIONALITY
                  from aml_transaction_run atr
                  left join aml_customer_public_run acpg
                    on atr.customer_no = acpg.customer_no
                   and acpg.date_id = v_dt_date
                  left join aml_customer_personal_run acps
                    on atr.customer_no = acps.customer_no
                   and acps.date_id = v_dt_date
                  left join aml_customer_beneficiary_run acb
                    on atr.customer_no = acb.customer_no
                   and acb.date_id = v_dt_date
                 where atr.trans_code = v_trans_code and atr.SUSPCS_FLAG = '1' and atr.date_id = v_dt_date) t ;
								  
		    
		 end if;
		 
  end loop CUR_Loop;
	
    CLOSE cur_suspcs_black_; -- 关闭游标
		
	end;
	
	
	DROP table if exists aml_func_dist_str_tmp01;
	create table aml_func_dist_str_tmp01(str1 varchar(2000));
  -- 汇总可疑特征码
	select func_dist_str(GROUP_CONCAT(distinct stcr),',') into v_stcr from aml_suspcs_case_detail where date_id = v_dt_date and suspcs_model_code = '1106';
	-- 汇总涉嫌犯罪类型
	select func_dist_str(GROUP_CONCAT(distinct tosc),',') into v_tosc from aml_suspcs_case_detail where date_id = v_dt_date and suspcs_model_code = '1106';
	-- 汇总资金交易行为情况
	select concat('交易总笔数',COUNT(1),'笔,交易金额',sum(trans_amount),'元') into v_stcb from aml_suspcs_case_detail where date_id = v_dt_date and suspcs_model_code = '1106';
	-- 汇总疑点分析
	select func_dist_str(GROUP_CONCAT(distinct aosp),',') into v_aosp from aml_suspcs_case_detail where date_id = v_dt_date and suspcs_model_code = '1106';	
	
		-- 输出可疑事件表
  delete from aml_suspcs_case where date_id = v_dt_date and suspcs_model_code = '1106';
	
	select count(1) into null_flag from aml_suspcs_case_detail where date_id = v_dt_date and suspcs_model_code = '1106';
	
	if null_flag > 0 then
  insert into aml_suspcs_case
    (check_state,
     auto_id,
     data_from,
     delete_state,
     show_logic1,
     show_logic2,
     show_logic3,
     show_logic4,
     show_logic5,
     show_logic6,
     show_logic7,
     show_logic8,
     report_zpi_name,
     report_xml_name,
     receipt_state,
     data_state,
     produce_state,
     date_id,
     suspcs_cdoe,
     suspcs_model_code,
     RICD,
     RPNC,
     RITP,
     DETR,
     TORP,
     ORXN,
     TOSC,
     STCR,
     ODRP,
     DORP,
     TPTR,
     OTPR,
     STCB,
     AOSP,
     SBDT,
     SEDT,
     ROTF1,
     ROTF2)
    select '0' check_state, -- 0 未校验;1 校验失败;2 校验部分成功;3 校验成功;
           uuid() auto_id,
           '0' data_from, -- 数据来源 0 系统生成；2 手工补录;
           '0' delete_state, -- 删除状态
           '1' show_logic1,
           '0' show_logic2,
           '0' show_logic3,
           '0' show_logic4,
           '0' show_logic5,
           '0' show_logic6,
           '0' show_logic7,
           '0' show_logic8,
           '' report_zpi_name,
           '' report_xml_name,
           '3' receipt_state, -- 回执错误（0），回执补正（1），回执警告（2），未回执（3），回执成功（4）
           '4' data_state, -- 补正（0），纠错（1），删除（2），警告（3），新增（4）
           '0' produce_state, -- 0：未生成 1：已生成
           v_dt_date date_id, -- 数据日期
           v_suspcs_code suspcs_cdoe, -- 可疑事件识别码
           '1106' suspcs_model_code, -- 可疑模型编码
           as1.RICD RICD, -- 报告机构编码
           as1.RPNC RPNC, -- 上报网点代码
           as1.RITP RITP, -- 行业类别
           as1.DETR DETR, -- 通用可疑交易报告紧急程度
           '1' TORP, -- 报送次数标志
           '' ORXN, -- 初次报送的通用可疑交易报告报文名称
           v_tosc TOSC, -- 可疑主体犯罪类型
           v_stcr STCR, -- 可疑交易特征代码
           as1.ODRP ODRP,
           as1.DORP DORP,
           as1.TPTR TPTR,
           as1.OTPR OTPR,
           v_stcb STCB,
           v_aosp AOSP,
           ascd1.min_trans_date SBDT,
           ascd1.max_trans_date SEDT,
           '' ROTF1,
           '' ROTF2
      from (select * from aml_susmodel where susModelCode = '1106') as1,
           (select min(date_format(trans_date,'%Y%m%d')) min_trans_date,
                   max(date_format(trans_date,'%Y%m%d')) max_trans_date
              from aml_suspcs_case_detail
             where date_id = v_dt_date
               and suspcs_model_code = '1106') ascd1;
		end if;
    END