package net.zhangqiu.project.cooperation.restcontroller;
/*
import java.io.File;

import net.zhangqiu.BaseTest;
import net.zhangqiu.service.check.entity.CheckRule;
import net.zhangqiu.service.check.entity.CheckRuleTable;
import net.zhangqiu.service.check.entity.CheckRuleTableFile;
import net.zhangqiu.service.database.entity.EntityColumn;
import net.zhangqiu.service.database.entity.EntityTable;
import net.zhangqiu.service.database.entity.EntityTableFile;
import net.zhangqiu.service.database.entity.EntityUtils;
import net.zhangqiu.utils.FileUtils;
import net.zhangqiu.utils.JsonUtils;

import org.testng.annotations.Test;

public class TaskFileSaveRestController1Test extends BaseTest{	
	
	@Test
	public void test() throws Exception{
		
		EntityTableFile entityTableFile = new EntityTableFile();
		
		EntityTable cooperation_GRXX = new EntityTable();
		cooperation_GRXX.setTableName("Cooperation_GRXX");
		cooperation_GRXX.getIdColumnSet().add("autoID");
		
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("autoID","主键"));
		
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("instInfo","机构"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("dtDate","数据时间",EntityUtils.Column_Date));

		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("extend1","扩展字段1"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("extend2","扩展字段2"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("extend3","扩展字段3"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("extend4","扩展字段4"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("extend5","扩展字段5"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("RPTFeedbackType","回执状态"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("RPTSubmitStatus","提交状态"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("RPTVerifyType","审核状态"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("RPTSendType","报送状态"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("RPTCheckType","校验状态"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("lastUpdateDate","最后修改时间"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("operationUser","操作用户"));

		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("JRJGDM","金融机构代码（业务发生机构代码）"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("XZXH","下载序号"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("YWZL","业务种类"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("YWZLXF","业务种类细分"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("YWH","业务号"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("FSDD","发生地点"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("KHRQ","开户日期"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DQRQ","到期日期"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("BZ","币种"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("SXED","授信额度"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GXSXED","共享授信额度"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZDFZE","最大负债额"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DBFS","担保方式"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("HKPL","还款频率"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("HKYS","还款月数"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("SYHKYS","剩余还款月数"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("JSYHKRQ","结算/应还款日期"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZHYCSJHKRQ","最近一次实际还款日期"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("BYYHKJE","本月应还款金额"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("BYSJHKJE","本月实际还款金额"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("YE","余额"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DQYQQS","当前逾期期数"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DQYQZE","当前逾期总额"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("YQ31_60HDKBJ","逾期31-60天未归还贷款本金"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("YQ61_90HDKBJ","逾期61-90天未归还贷款本金"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("YQ91_180HDKBJ","逾期91-180天未归还贷款本金"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("YQ180YSHDKBJ","逾期180天以上未归还贷款本金"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("LJYQQS","累计逾期期数"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZGYQQS","最高逾期期数"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("WJFLZT","五级分类状态"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZHZT","账户状态"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("HKZT","24个月（账户）还款状态"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("HKZT_24","24个月（账户）还款状态"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("WZFYE","透支180天以上未付余额"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZHYYZXXTS","账户拥有者信息提示"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZJLX","证件类型"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZJHM","证件号码"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("XM","姓名"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("YLZD","预留字段"));
		
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX","身份信息段"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_XB","性别"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_CSRQ","出生日期"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_HYZK","婚姻状况"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_ZGXL","最高学历"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_ZGXW","最高学位"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_ZZDH","住宅电话"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_SJHM","手机号码"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_DWDH","单位电话"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_DZYX","电子邮箱"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_TXDZ","通讯地址"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_TXDZYZBM","通讯地址邮政编码"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_HJDZ","户籍地址"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_POXM","配偶姓名"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_POZJLX","配偶证件类型"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_POZJHM","配偶证件号码"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_POGZDW","配偶工作单位"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("GRSFXX_POLXDH","配偶联系电话"));
		
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZYXX","职业信息段"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZYXX_ZY","职业"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZYXX_DWMC","单位名称"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZYXX_DWSSHY","单位所属行业"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZYXX_DWDZ","单位地址"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZYXX_DWDZYZBM","单位地址邮政编码"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZYXX_BDWGZQSNF","本单位工作起始年份"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZYXX_ZW","职务"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZYXX_ZC","职称"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZYXX_NSR","年收入"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZYXX_GZZH","工资账号"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("ZYXX_GZZHKHYH","工资账户开户银行"));
		
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("JZDZ","居住地址段"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("JZDZ_JZDZ","居住地址"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("JZDZ_ZJDZYZBM","居住地址邮政编码"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("JZDZ_ZJZK","居住状况"));

		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("JYBSBG","交易标识变更段"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("JYBSBG_YWH","业务号"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("JYBSBG_JRJGDM","金融机构代码（业务发生机构代码）"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("JYBSBG_JSYHKRQ","结算/应还款日期"));
		
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("TSJY","特殊交易段"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("TSJY_TSJYLX","特殊交易类型"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("TSJY_FSRQ","发生日期"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("TSJY_BGYS","变更月数"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("TSJY_FSJE","发生金额"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("TSJY_MXXX","明细信息"));
		
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DBXX","担保信息段"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DBXX_ZJLX","证件类型"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DBXX_ZJHM","证件号码"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DBXX_XM","姓名"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DBXX_DBJE","担保金额"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DBXX_DBZT","担保状态"));
		
		EntityTable cooperation_DBXX = new EntityTable();
		cooperation_DBXX.setTableName("Cooperation_DBXX");
		
		cooperation_DBXX.getIdColumnSet().add("DBXX");
		
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("DBXX","担保信息段"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("DBXX_ZJLX","证件类型"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("DBXX_ZJHM","证件号码"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("DBXX_XM","姓名"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("DBXX_DBJE","担保金额"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("DBXX_DBZT","担保状态"));
		
		EntityTable cooperation_GRXX1 = new EntityTable();
		cooperation_GRXX1.setDataSourceName("sampledb2");
		cooperation_GRXX1.setTableName("Cooperation_GRXX");
		cooperation_GRXX1.getIdColumnSet().add("autoID");
		
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("autoID","主键"));
		
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("instInfo","机构"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("dtDate","数据时间",EntityUtils.Column_Date));

		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("extend1","扩展字段1"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("extend2","扩展字段2"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("extend3","扩展字段3"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("extend4","扩展字段4"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("extend5","扩展字段5"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("RPTFeedbackType","回执状态"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("RPTSubmitStatus","提交状态"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("RPTVerifyType","审核状态"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("RPTSendType","报送状态"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("RPTCheckType","校验状态"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("lastUpdateDate","最后修改时间"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("operationUser","操作用户"));

		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("JRJGDM","金融机构代码（业务发生机构代码）"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("XZXH","下载序号"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("YWZL","业务种类"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("YWZLXF","业务种类细分"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("YWH","业务号"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("FSDD","发生地点"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("KHRQ","开户日期"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("DQRQ","到期日期"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("BZ","币种"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("SXED","授信额度"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GXSXED","共享授信额度"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZDFZE","最大负债额"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("DBFS","担保方式"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("HKPL","还款频率"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("HKYS","还款月数"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("SYHKYS","剩余还款月数"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("JSYHKRQ","结算/应还款日期"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZHYCSJHKRQ","最近一次实际还款日期"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("BYYHKJE","本月应还款金额"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("BYSJHKJE","本月实际还款金额"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("YE","余额"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("DQYQQS","当前逾期期数"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("DQYQZE","当前逾期总额"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("YQ31_60HDKBJ","逾期31-60天未归还贷款本金"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("YQ61_90HDKBJ","逾期61-90天未归还贷款本金"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("YQ91_180HDKBJ","逾期91-180天未归还贷款本金"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("YQ180YSHDKBJ","逾期180天以上未归还贷款本金"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("LJYQQS","累计逾期期数"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZGYQQS","最高逾期期数"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("WJFLZT","五级分类状态"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZHZT","账户状态"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("HKZT","24个月（账户）还款状态"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("HKZT_24","24个月（账户）还款状态"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("WZFYE","透支180天以上未付余额"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZHYYZXXTS","账户拥有者信息提示"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZJLX","证件类型"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZJHM","证件号码"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("XM","姓名"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("YLZD","预留字段"));
		
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX","身份信息段"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_XB","性别"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_CSRQ","出生日期"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_HYZK","婚姻状况"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_ZGXL","最高学历"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_ZGXW","最高学位"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_ZZDH","住宅电话"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_SJHM","手机号码"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_DWDH","单位电话"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_DZYX","电子邮箱"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_TXDZ","通讯地址"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_TXDZYZBM","通讯地址邮政编码"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_HJDZ","户籍地址"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_POXM","配偶姓名"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_POZJLX","配偶证件类型"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_POZJHM","配偶证件号码"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_POGZDW","配偶工作单位"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("GRSFXX_POLXDH","配偶联系电话"));
		
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZYXX","职业信息段"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZYXX_ZY","职业"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZYXX_DWMC","单位名称"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZYXX_DWSSHY","单位所属行业"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZYXX_DWDZ","单位地址"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZYXX_DWDZYZBM","单位地址邮政编码"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZYXX_BDWGZQSNF","本单位工作起始年份"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZYXX_ZW","职务"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZYXX_ZC","职称"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZYXX_NSR","年收入"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZYXX_GZZH","工资账号"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("ZYXX_GZZHKHYH","工资账户开户银行"));
		
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("JZDZ","居住地址段"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("JZDZ_JZDZ","居住地址"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("JZDZ_ZJDZYZBM","居住地址邮政编码"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("JZDZ_ZJZK","居住状况"));

		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("JYBSBG","交易标识变更段"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("JYBSBG_YWH","业务号"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("JYBSBG_JRJGDM","金融机构代码（业务发生机构代码）"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("JYBSBG_JSYHKRQ","结算/应还款日期"));
		
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("TSJY","特殊交易段"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("TSJY_TSJYLX","特殊交易类型"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("TSJY_FSRQ","发生日期"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("TSJY_BGYS","变更月数"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("TSJY_FSJE","发生金额"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("TSJY_MXXX","明细信息"));
		
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("DBXX","担保信息段"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("DBXX_ZJLX","证件类型"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("DBXX_ZJHM","证件号码"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("DBXX_XM","姓名"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("DBXX_DBJE","担保金额"));
		cooperation_GRXX1.getEntityColumnList().add(new EntityColumn("DBXX_DBZT","担保状态"));
		
		EntityTable cooperation_GRXX2 = new EntityTable();
		cooperation_GRXX2.setDataSourceName("sample1");
		cooperation_GRXX2.setTableName("Cooperation_GRXX");
		cooperation_GRXX2.getIdColumnSet().add("autoID");
		
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("autoID","主键"));
		
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("instInfo","机构"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("dtDate","数据时间",EntityUtils.Column_Date));

		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("extend1","扩展字段1"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("extend2","扩展字段2"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("extend3","扩展字段3"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("extend4","扩展字段4"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("extend5","扩展字段5"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("RPTFeedbackType","回执状态"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("RPTSubmitStatus","提交状态"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("RPTVerifyType","审核状态"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("RPTSendType","报送状态"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("RPTCheckType","校验状态"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("lastUpdateDate","最后修改时间"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("operationUser","操作用户"));

		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("JRJGDM","金融机构代码（业务发生机构代码）"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("XZXH","下载序号"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("YWZL","业务种类"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("YWZLXF","业务种类细分"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("YWH","业务号"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("FSDD","发生地点"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("KHRQ","开户日期"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("DQRQ","到期日期"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("BZ","币种"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("SXED","授信额度"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GXSXED","共享授信额度"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZDFZE","最大负债额"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("DBFS","担保方式"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("HKPL","还款频率"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("HKYS","还款月数"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("SYHKYS","剩余还款月数"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("JSYHKRQ","结算/应还款日期"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZHYCSJHKRQ","最近一次实际还款日期"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("BYYHKJE","本月应还款金额"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("BYSJHKJE","本月实际还款金额"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("YE","余额"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("DQYQQS","当前逾期期数"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("DQYQZE","当前逾期总额"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("YQ31_60HDKBJ","逾期31-60天未归还贷款本金"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("YQ61_90HDKBJ","逾期61-90天未归还贷款本金"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("YQ91_180HDKBJ","逾期91-180天未归还贷款本金"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("YQ180YSHDKBJ","逾期180天以上未归还贷款本金"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("LJYQQS","累计逾期期数"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZGYQQS","最高逾期期数"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("WJFLZT","五级分类状态"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZHZT","账户状态"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("HKZT","24个月（账户）还款状态"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("HKZT_24","24个月（账户）还款状态"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("WZFYE","透支180天以上未付余额"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZHYYZXXTS","账户拥有者信息提示"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZJLX","证件类型"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZJHM","证件号码"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("XM","姓名"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("YLZD","预留字段"));
		
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX","身份信息段"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_XB","性别"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_CSRQ","出生日期"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_HYZK","婚姻状况"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_ZGXL","最高学历"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_ZGXW","最高学位"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_ZZDH","住宅电话"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_SJHM","手机号码"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_DWDH","单位电话"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_DZYX","电子邮箱"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_TXDZ","通讯地址"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_TXDZYZBM","通讯地址邮政编码"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_HJDZ","户籍地址"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_POXM","配偶姓名"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_POZJLX","配偶证件类型"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_POZJHM","配偶证件号码"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_POGZDW","配偶工作单位"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("GRSFXX_POLXDH","配偶联系电话"));
		
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZYXX","职业信息段"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZYXX_ZY","职业"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZYXX_DWMC","单位名称"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZYXX_DWSSHY","单位所属行业"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZYXX_DWDZ","单位地址"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZYXX_DWDZYZBM","单位地址邮政编码"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZYXX_BDWGZQSNF","本单位工作起始年份"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZYXX_ZW","职务"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZYXX_ZC","职称"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZYXX_NSR","年收入"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZYXX_GZZH","工资账号"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("ZYXX_GZZHKHYH","工资账户开户银行"));
		
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("JZDZ","居住地址段"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("JZDZ_JZDZ","居住地址"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("JZDZ_ZJDZYZBM","居住地址邮政编码"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("JZDZ_ZJZK","居住状况"));

		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("JYBSBG","交易标识变更段"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("JYBSBG_YWH","业务号"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("JYBSBG_JRJGDM","金融机构代码（业务发生机构代码）"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("JYBSBG_JSYHKRQ","结算/应还款日期"));
		
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("TSJY","特殊交易段"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("TSJY_TSJYLX","特殊交易类型"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("TSJY_FSRQ","发生日期"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("TSJY_BGYS","变更月数"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("TSJY_FSJE","发生金额"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("TSJY_MXXX","明细信息"));
		
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("DBXX","担保信息段"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("DBXX_ZJLX","证件类型"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("DBXX_ZJHM","证件号码"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("DBXX_XM","姓名"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("DBXX_DBJE","担保金额"));
		cooperation_GRXX2.getEntityColumnList().add(new EntityColumn("DBXX_DBZT","担保状态"));
		
		EntityTable cooperation_GRXX3 = new EntityTable();
		cooperation_GRXX3.setDataSourceName("sample2");
		cooperation_GRXX3.setTableName("Cooperation_GRXX");
		cooperation_GRXX3.getIdColumnSet().add("autoID");
		
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("autoID","主键"));
		
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("instInfo","机构"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("dtDate","数据时间",EntityUtils.Column_Date));

		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("extend1","扩展字段1"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("extend2","扩展字段2"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("extend3","扩展字段3"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("extend4","扩展字段4"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("extend5","扩展字段5"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("RPTFeedbackType","回执状态"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("RPTSubmitStatus","提交状态"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("RPTVerifyType","审核状态"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("RPTSendType","报送状态"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("RPTCheckType","校验状态"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("lastUpdateDate","最后修改时间"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("operationUser","操作用户"));

		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("JRJGDM","金融机构代码（业务发生机构代码）"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("XZXH","下载序号"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("YWZL","业务种类"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("YWZLXF","业务种类细分"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("YWH","业务号"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("FSDD","发生地点"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("KHRQ","开户日期"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("DQRQ","到期日期"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("BZ","币种"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("SXED","授信额度"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GXSXED","共享授信额度"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZDFZE","最大负债额"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("DBFS","担保方式"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("HKPL","还款频率"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("HKYS","还款月数"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("SYHKYS","剩余还款月数"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("JSYHKRQ","结算/应还款日期"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZHYCSJHKRQ","最近一次实际还款日期"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("BYYHKJE","本月应还款金额"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("BYSJHKJE","本月实际还款金额"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("YE","余额"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("DQYQQS","当前逾期期数"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("DQYQZE","当前逾期总额"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("YQ31_60HDKBJ","逾期31-60天未归还贷款本金"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("YQ61_90HDKBJ","逾期61-90天未归还贷款本金"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("YQ91_180HDKBJ","逾期91-180天未归还贷款本金"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("YQ180YSHDKBJ","逾期180天以上未归还贷款本金"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("LJYQQS","累计逾期期数"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZGYQQS","最高逾期期数"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("WJFLZT","五级分类状态"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZHZT","账户状态"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("HKZT","24个月（账户）还款状态"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("HKZT_24","24个月（账户）还款状态"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("WZFYE","透支180天以上未付余额"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZHYYZXXTS","账户拥有者信息提示"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZJLX","证件类型"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZJHM","证件号码"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("XM","姓名"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("YLZD","预留字段"));
		
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX","身份信息段"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_XB","性别"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_CSRQ","出生日期"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_HYZK","婚姻状况"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_ZGXL","最高学历"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_ZGXW","最高学位"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_ZZDH","住宅电话"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_SJHM","手机号码"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_DWDH","单位电话"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_DZYX","电子邮箱"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_TXDZ","通讯地址"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_TXDZYZBM","通讯地址邮政编码"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_HJDZ","户籍地址"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_POXM","配偶姓名"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_POZJLX","配偶证件类型"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_POZJHM","配偶证件号码"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_POGZDW","配偶工作单位"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("GRSFXX_POLXDH","配偶联系电话"));
		
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZYXX","职业信息段"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZYXX_ZY","职业"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZYXX_DWMC","单位名称"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZYXX_DWSSHY","单位所属行业"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZYXX_DWDZ","单位地址"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZYXX_DWDZYZBM","单位地址邮政编码"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZYXX_BDWGZQSNF","本单位工作起始年份"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZYXX_ZW","职务"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZYXX_ZC","职称"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZYXX_NSR","年收入"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZYXX_GZZH","工资账号"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("ZYXX_GZZHKHYH","工资账户开户银行"));
		
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("JZDZ","居住地址段"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("JZDZ_JZDZ","居住地址"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("JZDZ_ZJDZYZBM","居住地址邮政编码"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("JZDZ_ZJZK","居住状况"));

		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("JYBSBG","交易标识变更段"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("JYBSBG_YWH","业务号"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("JYBSBG_JRJGDM","金融机构代码（业务发生机构代码）"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("JYBSBG_JSYHKRQ","结算/应还款日期"));
		
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("TSJY","特殊交易段"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("TSJY_TSJYLX","特殊交易类型"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("TSJY_FSRQ","发生日期"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("TSJY_BGYS","变更月数"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("TSJY_FSJE","发生金额"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("TSJY_MXXX","明细信息"));
		
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("DBXX","担保信息段"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("DBXX_ZJLX","证件类型"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("DBXX_ZJHM","证件号码"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("DBXX_XM","姓名"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("DBXX_DBJE","担保金额"));
		cooperation_GRXX3.getEntityColumnList().add(new EntityColumn("DBXX_DBZT","担保状态"));

		entityTableFile.getEntityTableList().add(cooperation_GRXX);
		entityTableFile.getEntityTableList().add(cooperation_DBXX);
		entityTableFile.getEntityTableList().add(cooperation_GRXX1);
		entityTableFile.getEntityTableList().add(cooperation_GRXX2);
		entityTableFile.getEntityTableList().add(cooperation_GRXX3);
		
		/*
		EntityTableSqlFile entityTableSqlFile = new EntityTableSqlFile();
		EntityTableSql entityProjectSql = new EntityTableSql();
		entityProjectSql.setTableName("Cooperation_Project");
		EntityDatabaseSql entityProjectDatabaseSql = new EntityDatabaseSql();
		entityProjectDatabaseSql.setStrDatabaseType(EntityUtils.Database_Mysql);
		entityProjectDatabaseSql.setStrCreateSql("CREATE TABLE `Cooperation_Project` (" +
		"`strProjectCode` VARCHAR(45) NOT NULL," +
        "`strProjectName` VARCHAR(200) NOT NULL," +
        "`strSourcePath` VARCHAR(200) NOT NULL," +
        "`strProjectDescription` VARCHAR(200)," +
        "`strUserCode` VARCHAR(45) NOT NULL," +
        "PRIMARY KEY (`strProjectCode`))" +
        "ENGINE = InnoDB;");
		entityProjectDatabaseSql.setStrDropSql("DROP TABLE `Cooperation_Project`;");
		entityProjectSql.getEntityDatabaseSqlList().add(entityProjectDatabaseSql);

		entityTableSqlFile.getEntityTableSqlList().add(entityProjectSql);
		*/
		/*
		CheckRuleTableFile checkRuleTableFile = new CheckRuleTableFile();
		CheckRuleTable checkRuleTable = new CheckRuleTable();
		checkRuleTable.setTableName("Cooperation_GRXX");
		
		
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JRJGDM),emptyCheck|stringCheck~notchinese|byteLengthCheck~14~14)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YWZL),emptyCheck|stringCheck~notchinese|byteLengthCheck~1~1|constCheck~YWZL)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YWZLXF),emptyCheck|stringCheck~notchinese|byteLengthCheck~0~2|constCheck~YWZLXF)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YWH),emptyCheck|byteLengthCheck~0~40)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(FSDD),emptyCheck|numberCheck~number|byteLengthCheck~0~6)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(KHRQ),emptyCheck|dateCheck~yyyyMMdd|compareCheck~<=~systemDate)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DQRQ),emptyCheck|dateCheck~yyyyMMdd)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(BZ),emptyCheck|stringCheck~notchinese|byteLengthCheck~0~3|constCheck~BZ)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(SXED),emptyCheck|decimalCheck|byteLengthCheck~0~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GXSXED),emptyCheck|decimalCheck|byteLengthCheck~0~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZDFZE),emptyCheck|decimalCheck|byteLengthCheck~0~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DBFS),emptyCheck|numberCheck~number|byteLengthCheck~1~1|constCheck~DBFS)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKPL),emptyCheck|stringCheck~notchinese|byteLengthCheck~0~2|constCheck~HKPL)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKYS),emptyCheck|stringCheck~notchinese|byteLengthCheck~0~3)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(SYHKYS),emptyCheck|stringCheck~notchinese|byteLengthCheck~0~3)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JSYHKRQ),emptyCheck|dateCheck~yyyyMMdd)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZHYCSJHKRQ),emptyCheck|dateCheck~yyyyMMdd)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(BYYHKJE),emptyCheck|decimalCheck|byteLengthCheck~0~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(BYSJHKJE),emptyCheck|decimalCheck|byteLengthCheck~0~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YE),emptyCheck|decimalCheck|byteLengthCheck~0~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DQYQQS),emptyCheck|numberCheck~number|byteLengthCheck~0~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DQYQZE),emptyCheck|decimalCheck|byteLengthCheck~0~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YQ31_60HDKBJ),emptyCheck|decimalCheck|byteLengthCheck~0~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YQ61_90HDKBJ),emptyCheck|decimalCheck|byteLengthCheck~0~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YQ91_180HDKBJ),emptyCheck|decimalCheck|byteLengthCheck~0~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YQ180YSHDKBJ),emptyCheck|decimalCheck|byteLengthCheck~0~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(LJYQQS),emptyCheck|numberCheck~number|byteLengthCheck~0~3)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZGYQQS),emptyCheck|numberCheck~number|byteLengthCheck~0~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(WJFLZT),emptyCheck|numberCheck~number|byteLengthCheck~1~1|constCheck~WJFLZT)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZHZT),emptyCheck|numberCheck~number|byteLengthCheck~1~1)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKZT),emptyCheck|byteLengthCheck~24~24)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKZT_24),emptyCheck|byteLengthCheck~1~1|constCheck~HKZT)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(WZFYE),emptyCheck|decimalCheck|byteLengthCheck~0~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZHYYZXXTS),emptyCheck|numberCheck~number|byteLengthCheck~1~1|constCheck~ZHYYZXXTS)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(XM),emptyCheck|byteLengthCheck~0~30)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZJLX),emptyCheck|byteLengthCheck~1~1|constCheck~ZJLX)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZJHM),emptyCheck|byteLengthCheck~0~18)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YLZD),byteLengthCheck~0~30)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(instInfo),emptyCheck)"));
		
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DQRQ),compareCheck~>=~@COLUMN(KHRQ))"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JSYHKRQ),compareCheck~>=~@COLUMN(KHRQ))"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKYS),compareCheck~>=~@COLUMN(SYHKYS))"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZHYCSJHKRQ),compareCheck~>=~@COLUMN(KHRQ))"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZDFZE),compareCheck~>=~@COLUMN(YE))"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@CALCULATE(@COLUMN(YQ31_60HDKBJ) + @COLUMN(YQ61_90HDKBJ) + @COLUMN(YQ91_180HDKBJ) + @COLUMN(YQ180YSHDKBJ)),compareCheck~<=~@CALCULATE(@COLUMN(YE) + 2))"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@CALCULATE(@COLUMN(YQ31_60HDKBJ) + @COLUMN(YQ61_90HDKBJ) + @COLUMN(YQ91_180HDKBJ) + @COLUMN(YQ180YSHDKBJ)),compareCheck~<=~@CALCULATE(@COLUMN(DQYQZE) + 2))"));

		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YE),compareCheck~>=~@COLUMN(DQYQZE),ifCompareCondition~@COLUMN(YWZL)~=~2~and~@COLUMN(YWZLXF)~=~81)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZGYQQS),compareCheck~>=~@COLUMN(DQYQQS),ifEqualsCondition~@COLUMN(YWZL)~=~1)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(LJYQQS),compareCheck~>=~@COLUMN(ZGYQQS),ifEqualsCondition~@COLUMN(YWZL)~=~1)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(SXED),compareCheck~>=~@COLUMN(ZDFZE),ifEqualsCondition~@COLUMN(YWZL)~=~1)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKYS),compareCheck~=~U,ifEqualsCondition~@COLUMN(HKPL)~=~08)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKYS),compareCheck~=~O,ifEqualsCondition~@COLUMN(HKPL)~=~07)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKYS),compareCheck~=~X,ifEqualsCondition~@COLUMN(HKPL)~=~99)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKYS),compareCheck~=~C,ifEqualsCondition~@COLUMN(YWZL)~=~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(SYHKYS),compareCheck~=~U,ifEqualsCondition~@COLUMN(HKPL)~=~08)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(SYHKYS),compareCheck~=~O,ifEqualsCondition~@COLUMN(HKPL)~=~07)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(SYHKYS),compareCheck~=~X,ifEqualsCondition~@COLUMN(HKPL)~=~99)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(SYHKYS),compareCheck~=~C,ifEqualsCondition~@COLUMN(YWZL)~=~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YWZLXF),compareCheck~isIndexOf~11 12 13 21 31 41 51 91 99,ifEqualsCondition~@COLUMN(YWZL)~=~1)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKZT_24),compareCheck~isIndexOf~/ * N 1 2 3 4 5 6 7 D Z G C,ifEqualsCondition~@COLUMN(YWZL)~=~1)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKPL),compareCheck~isIndexOf~01 02 03 04 05 06 07 08 99,ifEqualsCondition~@COLUMN(YWZL)~=~1)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZHZT),compareCheck~isIndexOf~1 2 3 4 5,ifEqualsCondition~@COLUMN(YWZL)~=~1)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DQRQ),compareCheck~=~20991231,ifEqualsCondition~@COLUMN(YWZL)~=~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YWZLXF),compareCheck~isIndexOf~71 81,ifEqualsCondition~@COLUMN(YWZL)~=~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZHZT),compareCheck~isIndexOf~1 2 3 4 5 6 7 8 9 0,ifEqualsCondition~@COLUMN(YWZL)~=~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKZT_24),compareCheck~isIndexOf~/ * N 1 2 3 4 5 6 7 D Z G C #,ifEqualsCondition~@COLUMN(YWZL)~=~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKPL),compareCheck~=~C,ifEqualsCondition~@COLUMN(YWZL)~=~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKYS),compareCheck~=~C,ifEqualsCondition~@COLUMN(YWZL)~=~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(SYHKYS),compareCheck~=~C,ifEqualsCondition~@COLUMN(YWZL)~=~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(BYYHKJE),compareCheck~=~0,ifEqualsCondition~@COLUMN(HKZT_24)~=~*)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DQYQZE),compareCheck~=~0,ifEqualsCondition~@COLUMN(DQYQQS)~=~0)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DQYQQS),compareCheck~=~0,ifEqualsCondition~@COLUMN(DQYQZE)~=~0)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DQYQZE),compareCheck~!=~0,ifEqualsCondition~@COLUMN(DQYQQS)~!=~0)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DQYQQS),compareCheck~!=~0,ifEqualsCondition~@COLUMN(DQYQZE)~!=~0)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKYS),compareCheck~=~0,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(HKPL)~=~07)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKYS),compareCheck~=~U,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(HKPL)~=~08)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKYS),compareCheck~notIsisIndexOf~O U X C,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(HKPL)~isIndexOf~01 02 03 04 05 06)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(SYHKYS),compareCheck~=~0,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(HKPL)~=~07)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(SYHKYS),compareCheck~=~U,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(HKPL)~=~08)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(SYHKYS),compareCheck~notIsisIndexOf~O U X C,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(HKPL)~isIndexOf~01 02 03 04 05 06)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DQYQQS),compareCheck~!=~0,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(ZHZT)~isIndexOf~2 4)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DQYQZE),compareCheck~!=~0,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(ZHZT)~isIndexOf~2 4)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(LJYQQS),compareCheck~!=~0,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(ZHZT)~isIndexOf~2 4)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZGYQQS),compareCheck~!=~0,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(ZHZT)~isIndexOf~2 4)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKZT_24),compareCheck~isIndexOf~1 2 3 4 5 6 7,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(ZHZT)~=~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKZT_24),compareCheck~isIndexOf~1 2 3 4 5 6 7 G,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(ZHZT)~=~4)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YE),compareCheck~=~0,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(ZHZT)~=~3)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DQYQQS),compareCheck~=~0,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(ZHZT)~=~3)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DQYQZE),compareCheck~=~0,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(ZHZT)~=~3)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKZT_24),compareCheck~isIndexOf~C G,ifCompareCondition~@COLUMN(YWZL)~=~2~and~@COLUMN(ZHZT)~=~4)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKZT_24),compareCheck~=~C,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(ZHZT)~=~3)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZJHM),idCodeCheck,ifCompareCondition~@COLUMN(ZJLX)~=~0)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKZT_24),compareCheck~=~7,ifCompareCondition~@COLUMN(YWZL)~=~2~and~@COLUMN(YWZLXF)~=~71~and~@COLUMN(WZFYE)~!=~0000000000~and~@COLUMN(HKZT)~match~([/*N1-7DZCG#]{23}[1-7]{1}))"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(WZFYE),compareCheck~=~@COLUMN(YE),ifCompareCondition~@COLUMN(YWZL)~=~2~and~@COLUMN(YWZLXF)~=~71~and~@COLUMN(WZFYE)~!=~0000000000~and~@COLUMN(HKZT)~match~([/*N1-7DZCG#]{23}[1-7]{1}))"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(HKZT_24),compareCheck~!=~7,ifCompareCondition~@COLUMN(YWZL)~=~2~and~@COLUMN(YWZLXF)~=~71~and~@COLUMN(WZFYE)~=~0)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YQ31_60HDKBJ),compareCheck~=~0,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(ZHYYZXXTS)~=~2~and~@COLUMN(JSYHKRQ)~yearMonth~@COLUMN(KHRQ))"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YQ61_90HDKBJ),compareCheck~=~0,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(ZHYYZXXTS)~=~2~and~@COLUMN(JSYHKRQ)~yearMonth~@COLUMN(KHRQ))"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YQ91_180HDKBJ),compareCheck~=~0,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(ZHYYZXXTS)~=~2~and~@COLUMN(JSYHKRQ)~yearMonth~@COLUMN(KHRQ))"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(YQ180YSHDKBJ),compareCheck~=~0,ifCompareCondition~@COLUMN(YWZL)~=~1~and~@COLUMN(ZHYYZXXTS)~=~2~and~@COLUMN(JSYHKRQ)~yearMonth~@COLUMN(KHRQ))"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(hkztCheck)",1));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JZDZ),compareCheck~!=~empty,ifCompareCondition~@COLUMN(ZHYYZXXTS)~=~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX),compareCheck~!=~empty,ifCompareCondition~@COLUMN(ZHYYZXXTS)~=~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX),compareCheck~!=~empty,ifCompareCondition~@COLUMN(ZHYYZXXTS)~=~2)"));
		
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JZDZ),compareCheck~!=~*)","每条账户记录最多只能有一个居住地址信息段"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JZDZ_JZDZ),emptyCheck|byteLengthCheck~0~60,ifEmptyCondition~@COLUMN(JZDZ)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JZDZ_ZJDZYZBM),emptyCheck|numberCheck~number|byteLengthCheck~6~6,ifEmptyCondition~@COLUMN(JZDZ)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JZDZ_ZJZK),emptyCheck|stringCheck~notchinese|byteLengthCheck~1~1,ifEmptyCondition~@COLUMN(JZDZ)~notempty)"));

		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JYBSBG),compareCheck~!=~*)","每条账户记录最多只能有一个交易标识变更段"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JYBSBG_YWH),emptyCheck|byteLengthCheck~0~40,ifEmptyCondition~@COLUMN(JYBSBG)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JYBSBG_JRJGDM),emptyCheck|stringCheck~notchinese|byteLengthCheck~14~14,ifEmptyCondition~@COLUMN(JYBSBG)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JYBSBG_JSYHKRQ),emptyCheck|dateCheck~yyyyMMdd,ifEmptyCondition~@COLUMN(JYBSBG)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@CALCULATE(@COLUMN(JYBSBG_JRJGDM),@COLUMN(JYBSBG_YWH),stringCalculate),compareCheck~!=~@CALCULATE(@COLUMN(JRJGDM),@COLUMN(YWH),stringCalculate),ifEmptyCondition~@COLUMN(JYBSBG)~notempty)","如果交易标识变更段(JYBSBG):@COLUMN(JYBSBG)不为空,金融机构代码(JYBSBG_JRJGDM):@COLUMN(JYBSBG_JRJGDM)+业务号(JYBSBG_YWH):@COLUMN(JYBSBG_YWH)应不等于基础段中的金融机构代码(JRJGDM):@COLUMN(JRJGDM)+业务号(YWH):@COLUMN(YWH)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JYBSBG),compareCheck~=~empty,ifCompareCondition~@COLUMN(ZHYYZXXTS)~=~2)"));
		
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(TSJY),compareCheck~!=~*)","每条账户记录最多只能有一个特殊交易段"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(TSJY_TSJYLX),emptyCheck|numberCheck~number|byteLengthCheck~1~1|constCheck~TSJYLX,ifEmptyCondition~@COLUMN(TSJY)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(TSJY_FSRQ),emptyCheck|dateCheck~yyyyMMdd,ifEmptyCondition~@COLUMN(TSJY)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(TSJY_BGYS),emptyCheck|numberCheck~number|byteLengthCheck~0~4,ifEmptyCondition~@COLUMN(TSJY)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(TSJY_FSJE),emptyCheck|decimalCheck|byteLengthCheck~0~10,ifEmptyCondition~@COLUMN(TSJY)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(TSJY_MXXX),byteLengthCheck~0~200,ifEmptyCondition~@COLUMN(TSJY)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(TSJY_FSRQ),compareCheck~>=~@COLUMN(KHRQ),ifEmptyCondition~@COLUMN(TSJY)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(TSJY_FSRQ),compareCheck~<=~systemDate,ifEmptyCondition~@COLUMN(TSJY)~notempty)"));
		
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX),compareCheck~!=~*)","每条账户记录最多只能有一个身份信息段"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_XB),emptyCheck|numberCheck~number|byteLengthCheck~1~1|constCheck~XB,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_CSRQ),emptyCheck|dateCheck~yyyyMMdd,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_HYZK),emptyCheck|numberCheck~number|byteLengthCheck~0~2|constCheck~HYZK,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_ZGXL),emptyCheck|numberCheck~number|byteLengthCheck~0~2|constCheck~GGRYZGXL,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_ZGXW),emptyCheck|numberCheck~number|byteLengthCheck~0~1|constCheck~ZGXW,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_ZZDH),stringCheck~notchinese|byteLengthCheck~0~25,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_SJHM),stringCheck~notchinese|byteLengthCheck~0~16,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_DWDH),stringCheck~notchinese|byteLengthCheck~0~25,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_DZYX),stringCheck~notchinese|byteLengthCheck~0~30,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_TXDZ),emptyCheck|byteLengthCheck~0~60,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_TXDZYZBM),emptyCheck|numberCheck~number|byteLengthCheck~6~6,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_HJDZ),byteLengthCheck~0~60,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_POXM),byteLengthCheck~0~30,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_POZJLX),byteLengthCheck~0~1|constCheck~ZJLX,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_POZJHM),byteLengthCheck~0~18,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_POGZDW),byteLengthCheck~0~60,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_POLXDH),byteLengthCheck~0~25,ifEmptyCondition~@COLUMN(GRSFXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_POXM),compareCheck~=~empty,ifCompareCondition~@COLUMN(GRSFXX)~!=~empty~and~@COLUMN(GRSFXX_HYZK)~=~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_POZJLX),compareCheck~=~empty,ifCompareCondition~@COLUMN(GRSFXX)~!=~empty~and~@COLUMN(GRSFXX_HYZK)~=~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_POZJHM),compareCheck~=~empty,ifCompareCondition~@COLUMN(GRSFXX)~!=~empty~and~@COLUMN(GRSFXX_HYZK)~=~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_POGZDW),compareCheck~=~empty,ifCompareCondition~@COLUMN(GRSFXX)~!=~empty~and~@COLUMN(GRSFXX_HYZK)~=~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_POLXDH),compareCheck~=~empty,ifCompareCondition~@COLUMN(GRSFXX)~!=~empty~and~@COLUMN(GRSFXX_HYZK)~=~10)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_POZJLX),compareCheck~!=~empty,ifCompareCondition~@COLUMN(GRSFXX)~!=~empty~and~@COLUMN(GRSFXX_POZJHM)~!=~empty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_POZJHM),compareCheck~!=~empty,ifCompareCondition~@COLUMN(GRSFXX)~!=~empty~and~@COLUMN(GRSFXX_POZJLX)~!=~empty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX_POZJHM),idCodeCheck,ifCompareCondition~@COLUMN(GRSFXX)~!=~empty~and~@COLUMN(GRSFXX_POZJLX)~=~0)"));
		
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX),compareCheck~!=~*)","每条账户记录最多只能有一个职业信息段"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX_ZY),emptyCheck|byteLengthCheck~0~1|constCheck~ZY,ifEmptyCondition~@COLUMN(ZYXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX_DWMC),emptyCheck|byteLengthCheck~0~60,ifEmptyCondition~@COLUMN(ZYXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX_DWSSHY),emptyCheck|byteLengthCheck~0~1|constCheck~DWSSHY,ifEmptyCondition~@COLUMN(ZYXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX_DWDZ),byteLengthCheck~0~60,ifEmptyCondition~@COLUMN(ZYXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX_DWDZYZBM),emptyCheck|numberCheck~number|byteLengthCheck~6~6,ifEmptyCondition~@COLUMN(ZYXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX_BDWGZQSNF),numberCheck~number|byteLengthCheck~4~4,ifEmptyCondition~@COLUMN(ZYXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX_ZW),emptyCheck|numberCheck~number|byteLengthCheck~0~1|constCheck~ZW,ifEmptyCondition~@COLUMN(ZYXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX_ZC),emptyCheck|numberCheck~number|byteLengthCheck~0~1|constCheck~ZC,ifEmptyCondition~@COLUMN(ZYXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX_NSR),decimalCheck|byteLengthCheck~0~10,ifEmptyCondition~@COLUMN(ZYXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX_GZZH),byteLengthCheck~0~40,ifEmptyCondition~@COLUMN(ZYXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX_GZZHKHYH),stringCheck~notchinese|byteLengthCheck~0~14,ifEmptyCondition~@COLUMN(ZYXX)~notempty)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX_BDWGZQSNF),compareCheck~<=~systemYear,ifEmptyCondition~@COLUMN(ZYXX)~notempty)"));

		CheckRuleTable checkDBXXTable = new CheckRuleTable();
		checkDBXXTable.setTableName("Cooperation_DBXX");
		checkDBXXTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DBXX_XM),emptyCheck|byteLengthCheck~0~30,ifEmptyCondition~@COLUMN(DBXX)~notempty)"));
		checkDBXXTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DBXX_ZJLX),emptyCheck|stringCheck~notchinese|byteLengthCheck~1~1|constCheck~ZJLX,ifEmptyCondition~@COLUMN(DBXX)~notempty)"));
		checkDBXXTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DBXX_ZJHM),emptyCheck|stringCheck~notchinese|byteLengthCheck~0~18,ifEmptyCondition~@COLUMN(DBXX)~notempty)"));
		checkDBXXTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DBXX_DBJE),emptyCheck|decimalCheck|byteLengthCheck~0~10,ifEmptyCondition~@COLUMN(DBXX)~notempty)"));
		checkDBXXTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DBXX_DBZT),emptyCheck|numberCheck~number|byteLengthCheck~1~1,ifEmptyCondition~@COLUMN(DBXX)~notempty)"));
		checkDBXXTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(DBXX_ZJHM),idCodeCheck,ifCompareCondition~@COLUMN(DBXX)~!=~empty~and~@COLUMN(DBXX_ZJLX)~=~0)"));
		checkDBXXTable.getCheckRuleList().add(new CheckRule("@CHECK(repeatCheck~@COLUMN(DBXX_XM)~@COLUMN(DBXX_ZJLX)~@COLUMN(DBXX_ZJHM))","同一条账户记录中若包含多个担保信息段，任意两个担保信息段的“姓名”、“证件类型、“证件号码”不能完全相同",2));
		checkRuleTable.getCheckRuleTableMap().put("DBXX", checkDBXXTable);
		
		
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(historyCheck)",1));

		checkRuleTableFile.getCheckRuleTableList().add(checkRuleTable);
		
		String strProjectCode = "cooperation";
		String strTaskCode = "coo_a02";

		String jsonTableString = JsonUtils.objectToString(entityTableFile);
		FileUtils.saveFile(tempPath + strProjectCode + File.separator + strTaskCode + File.separator + strTaskCode + "_" + "table.json",jsonTableString,testEncoding);
		//String jsonTableSqlString = JsonUtils.objectToString(entityTableSqlFile);
		//FileUtils.saveFile(tempPath + strProjectCode + File.separator + strTaskCode + File.separator + strTaskCode + "~" + "tablesql.json",jsonTableSqlString,testEncoding);
		String jsonTableCheckString = JsonUtils.objectToString(checkRuleTableFile);
		FileUtils.saveFile(tempPath + strProjectCode + File.separator + strTaskCode + File.separator + strTaskCode + "_" + "tablecheck.json",jsonTableCheckString,testEncoding);
	}
}
*/