package net.zhangqiu.project.grxx.restcontroller;

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

public class TaskFileSaveRestControllerTest extends BaseTest{	
	
	@Test
	public void test() throws Exception{
		
		EntityTableFile entityTableFile = new EntityTableFile();
		
		EntityTable cooperation_GRXX = new EntityTable();
		cooperation_GRXX.setDataSourceName("v3");
		cooperation_GRXX.setTableName("GR_GRXX_VIEW");
		
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
		
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DBXXListMap","担保信息"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DBXX","担保信息段"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DBXX_ZJLX","证件类型"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DBXX_ZJHM","证件号码"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DBXX_XM","姓名"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DBXX_DBJE","担保金额"));
		cooperation_GRXX.getEntityColumnList().add(new EntityColumn("DBXX_DBZT","担保状态"));
		
		EntityTable cooperation_GRXX_JC = new EntityTable();
		cooperation_GRXX_JC.setDataSourceName("v3");
		cooperation_GRXX_JC.setTableName("GR_GRXX_JC");
		
		cooperation_GRXX_JC.getIdColumnSet().add("autoID");
		
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("autoID","主键"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("instInfo","机构"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("dtDate","数据时间",EntityUtils.Column_Date));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("extend1","扩展字段1"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("extend2","扩展字段2"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("extend3","扩展字段3"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("extend4","扩展字段4"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("extend5","扩展字段5"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("RPTFeedbackType","回执状态"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("RPTSubmitStatus","提交状态"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("RPTVerifyType","审核状态"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("RPTSendType","报送状态"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("RPTCheckType","校验状态"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("lastUpdateDate","最后修改时间"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("operationUser","操作用户"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("JRJGDM","金融机构代码（业务发生机构代码）"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("XZXH","下载序号"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("YWZL","业务种类"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("YWZLXF","业务种类细分"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("YWH","业务号"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("FSDD","发生地点"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("KHRQ","开户日期"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("DQRQ","到期日期"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("BZ","币种"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("SXED","授信额度"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("GXSXED","共享授信额度"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("ZDFZE","最大负债额"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("DBFS","担保方式"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("HKPL","还款频率"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("HKYS","还款月数"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("SYHKYS","剩余还款月数"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("JSYHKRQ","结算/应还款日期"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("ZHYCSJHKRQ","最近一次实际还款日期"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("BYYHKJE","本月应还款金额"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("BYSJHKJE","本月实际还款金额"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("YE","余额"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("DQYQQS","当前逾期期数"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("DQYQZE","当前逾期总额"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("YQ31_60HDKBJ","逾期31-60天未归还贷款本金"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("YQ61_90HDKBJ","逾期61-90天未归还贷款本金"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("YQ91_180HDKBJ","逾期91-180天未归还贷款本金"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("YQ180YSHDKBJ","逾期180天以上未归还贷款本金"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("LJYQQS","累计逾期期数"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("ZGYQQS","最高逾期期数"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("WJFLZT","五级分类状态"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("ZHZT","账户状态"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("HKZT","24个月（账户）还款状态"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("HKZT_24","24个月（账户）还款状态"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("WZFYE","透支180天以上未付余额"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("ZHYYZXXTS","账户拥有者信息提示"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("ZJLX","证件类型"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("ZJHM","证件号码"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("XM","姓名"));
		cooperation_GRXX_JC.getEntityColumnList().add(new EntityColumn("YLZD","预留字段"));
		
		
		EntityTable cooperation_DBXX = new EntityTable();
		cooperation_DBXX.setDataSourceName("v3");
		cooperation_DBXX.setTableName("GR_DBXX");

		cooperation_DBXX.getIdColumnSet().add("autoID");
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("autoID","主键"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("extend1","扩展字段1"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("extend2","扩展字段2"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("extend3","扩展字段3"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("extend4","扩展字段4"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("extend5","扩展字段5"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("RPTFeedbackType","回执状态"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("RPTSendType","报送状态"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("RPTCheckType","校验状态"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("FOREIGNID","外键"));
		
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("ZJLX","证件类型"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("ZJHM","证件号码"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("XM","姓名"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("DBJE","担保金额"));
		cooperation_DBXX.getEntityColumnList().add(new EntityColumn("DBZT","担保状态"));
		
		EntityTable cooperation_TSJY = new EntityTable();
		cooperation_TSJY.setDataSourceName("v3");
		cooperation_TSJY.setTableName("GR_TSJY");
		
		cooperation_TSJY.getIdColumnSet().add("autoID");
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("autoID","主键"));
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("extend1","扩展字段1"));
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("extend2","扩展字段2"));
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("extend3","扩展字段3"));
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("extend4","扩展字段4"));
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("extend5","扩展字段5"));
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("RPTFeedbackType","回执状态"));
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("RPTSendType","报送状态"));
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("RPTCheckType","校验状态"));
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("FOREIGNID","外键"));
		
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("TSJYLX","特殊交易类型"));
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("FSRQ","发生日期"));
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("BGYS","变更月数"));
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("FSJE","发生金额"));
		cooperation_TSJY.getEntityColumnList().add(new EntityColumn("MXXX","明细信息"));
		
		EntityTable cooperation_JYBSBG = new EntityTable();
		cooperation_JYBSBG.setDataSourceName("v3");
		cooperation_JYBSBG.setTableName("GR_JYBSBG");
		
		cooperation_JYBSBG.getIdColumnSet().add("autoID");
		cooperation_JYBSBG.getEntityColumnList().add(new EntityColumn("autoID","主键"));
		cooperation_JYBSBG.getEntityColumnList().add(new EntityColumn("extend1","扩展字段1"));
		cooperation_JYBSBG.getEntityColumnList().add(new EntityColumn("extend2","扩展字段2"));
		cooperation_JYBSBG.getEntityColumnList().add(new EntityColumn("extend3","扩展字段3"));
		cooperation_JYBSBG.getEntityColumnList().add(new EntityColumn("extend4","扩展字段4"));
		cooperation_JYBSBG.getEntityColumnList().add(new EntityColumn("extend5","扩展字段5"));
		cooperation_JYBSBG.getEntityColumnList().add(new EntityColumn("RPTFeedbackType","回执状态"));
		cooperation_JYBSBG.getEntityColumnList().add(new EntityColumn("RPTSendType","报送状态"));
		cooperation_JYBSBG.getEntityColumnList().add(new EntityColumn("RPTCheckType","校验状态"));
		cooperation_JYBSBG.getEntityColumnList().add(new EntityColumn("FOREIGNID","外键"));
		
		cooperation_JYBSBG.getEntityColumnList().add(new EntityColumn("YWH","业务号"));
		cooperation_JYBSBG.getEntityColumnList().add(new EntityColumn("JRJGDM","金融机构代码（业务发生机构代码）"));
		cooperation_JYBSBG.getEntityColumnList().add(new EntityColumn("JSYHKRQ","结算/应还款日期"));

		EntityTable cooperation_JZDZ = new EntityTable();
		cooperation_JZDZ.setDataSourceName("v3");
		cooperation_JZDZ.setTableName("GR_JZDZ");
		
		cooperation_JZDZ.getIdColumnSet().add("autoID");
		cooperation_JZDZ.getEntityColumnList().add(new EntityColumn("autoID","主键"));
		cooperation_JZDZ.getEntityColumnList().add(new EntityColumn("extend1","扩展字段1"));
		cooperation_JZDZ.getEntityColumnList().add(new EntityColumn("extend2","扩展字段2"));
		cooperation_JZDZ.getEntityColumnList().add(new EntityColumn("extend3","扩展字段3"));
		cooperation_JZDZ.getEntityColumnList().add(new EntityColumn("extend4","扩展字段4"));
		cooperation_JZDZ.getEntityColumnList().add(new EntityColumn("extend5","扩展字段5"));
		cooperation_JZDZ.getEntityColumnList().add(new EntityColumn("RPTFeedbackType","回执状态"));
		cooperation_JZDZ.getEntityColumnList().add(new EntityColumn("RPTSendType","报送状态"));
		cooperation_JZDZ.getEntityColumnList().add(new EntityColumn("RPTCheckType","校验状态"));
		cooperation_JZDZ.getEntityColumnList().add(new EntityColumn("FOREIGNID","外键"));
		
		cooperation_JZDZ.getEntityColumnList().add(new EntityColumn("JZDZ","居住地址"));
		cooperation_JZDZ.getEntityColumnList().add(new EntityColumn("ZJDZYZBM","居住地址邮政编码"));
		cooperation_JZDZ.getEntityColumnList().add(new EntityColumn("ZJZK","居住状况"));
		
		EntityTable cooperation_ZYXX = new EntityTable();
		cooperation_ZYXX.setDataSourceName("v3");
		cooperation_ZYXX.setTableName("GR_ZYXX");
		
		cooperation_ZYXX.getIdColumnSet().add("autoID");
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("autoID","主键"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("extend1","扩展字段1"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("extend2","扩展字段2"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("extend3","扩展字段3"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("extend4","扩展字段4"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("extend5","扩展字段5"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("RPTFeedbackType","回执状态"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("RPTSendType","报送状态"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("RPTCheckType","校验状态"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("FOREIGNID","外键"));
		
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("ZY","职业"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("DWMC","单位名称"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("DWSSHY","单位所属行业"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("DWDZ","单位地址"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("DWDZYZBM","单位地址邮政编码"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("BDWGZQSNF","本单位工作起始年份"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("ZW","职务"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("ZC","职称"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("NSR","年收入"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("GZZH","工资账号"));
		cooperation_ZYXX.getEntityColumnList().add(new EntityColumn("GZZHKHYH","工资账户开户银行"));
		
		EntityTable cooperation_GRSFXX = new EntityTable();
		cooperation_GRSFXX.setDataSourceName("v3");
		cooperation_GRSFXX.setTableName("GR_GRSFXX");
		
		cooperation_GRSFXX.getIdColumnSet().add("autoID");
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("autoID","主键"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("extend1","扩展字段1"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("extend2","扩展字段2"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("extend3","扩展字段3"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("extend4","扩展字段4"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("extend5","扩展字段5"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("RPTFeedbackType","回执状态"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("RPTSendType","报送状态"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("RPTCheckType","校验状态"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("FOREIGNID","外键"));
		
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("XB","性别"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("CSRQ","出生日期"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("HYZK","婚姻状况"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("ZGXL","最高学历"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("ZGXW","最高学位"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("ZZDH","住宅电话"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("SJHM","手机号码"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("DWDH","单位电话"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("DZYX","电子邮箱"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("TXDZ","通讯地址"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("TXDZYZBM","通讯地址邮政编码"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("HJDZ","户籍地址"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("POXM","配偶姓名"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("POZJLX","配偶证件类型"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("POZJHM","配偶证件号码"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("POGZDW","配偶工作单位"));
		cooperation_GRSFXX.getEntityColumnList().add(new EntityColumn("POLXDH","配偶联系电话"));
		
		
		entityTableFile.getEntityTableList().add(cooperation_GRXX);
		entityTableFile.getEntityTableList().add(cooperation_GRXX_JC);
		entityTableFile.getEntityTableList().add(cooperation_DBXX);
		entityTableFile.getEntityTableList().add(cooperation_TSJY);
		entityTableFile.getEntityTableList().add(cooperation_JYBSBG);
		entityTableFile.getEntityTableList().add(cooperation_JZDZ);
		entityTableFile.getEntityTableList().add(cooperation_ZYXX);
		entityTableFile.getEntityTableList().add(cooperation_GRSFXX);

		CheckRuleTableFile checkRuleTableFile = new CheckRuleTableFile();
		CheckRuleTable checkRuleTable = new CheckRuleTable();
		checkRuleTable.setDataSourceName("v3");
		checkRuleTable.setTableName("GR_GRXX_VIEW");

		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JZDZ),compareCheck~!=~*)","每条账户记录最多只能有一个居住地址信息段"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JYBSBG),compareCheck~!=~*)","每条账户记录最多只能有一个交易标识变更段"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(TSJY),compareCheck~!=~*)","每条账户记录最多只能有一个特殊交易段"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX),compareCheck~!=~*)","每条账户记录最多只能有一个身份信息段"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX),compareCheck~!=~*)","每条账户记录最多只能有一个职业信息段"));

		CheckRuleTable checkDBXXTable = new CheckRuleTable();
		checkDBXXTable.setTableName("GR_DBXX");
		checkDBXXTable.getCheckRuleList().add(new CheckRule("@CHECK(repeatCheck~@COLUMN(DBXX_XM)~@COLUMN(DBXX_ZJLX)~@COLUMN(DBXX_ZJHM))","同一条账户记录中若包含多个担保信息段，任意两个担保信息段的“姓名”、“证件类型、“证件号码”不能完全相同",2));
		checkRuleTable.getCheckRuleTableMap().put("DBXXListMap", checkDBXXTable);
		
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@CALCULATE(@COLUMN(JYBSBG_JRJGDM),@COLUMN(JYBSBG_YWH),stringCalculate),compareCheck~!=~@CALCULATE(@COLUMN(JRJGDM),@COLUMN(YWH),stringCalculate),ifEmptyCondition~@COLUMN(JYBSBG)~notempty)","如果交易标识变更段(JYBSBG):@COLUMN(JYBSBG)不为空,金融机构代码(JYBSBG_JRJGDM):@COLUMN(JYBSBG_JRJGDM)+业务号(JYBSBG_YWH):@COLUMN(JYBSBG_YWH)应不等于基础段中的金融机构代码(JRJGDM):@COLUMN(JRJGDM)+业务号(YWH):@COLUMN(YWH)"));
		
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JYBSBG),compareCheck~=~empty,ifCompareCondition~@COLUMN(ZHYYZXXTS)~=~2)"));
		
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(KHRQ),compareCheck~<=~systemDate)"));
		
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(JZDZ),compareCheck~!=~empty,ifCompareCondition~@COLUMN(ZHYYZXXTS)~=~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(GRSFXX),compareCheck~!=~empty,ifCompareCondition~@COLUMN(ZHYYZXXTS)~=~2)"));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(@COLUMN(ZYXX),compareCheck~!=~empty,ifCompareCondition~@COLUMN(ZHYYZXXTS)~=~2)"));
		
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(historyCheck)",1));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(historyListCheck)",3));
		checkRuleTable.getCheckRuleList().add(new CheckRule("@CHECK(historyAllCheck)",4));

		checkRuleTableFile.getCheckRuleTableList().add(checkRuleTable);
		
		String strProjectCode = "grxx";
		String strTaskCode = "grxx_a01";

		String jsonTableString = JsonUtils.objectToString(entityTableFile);
		FileUtils.saveFile(tempPath + strProjectCode + File.separator + strTaskCode + File.separator + strTaskCode + "_" + "table.json",jsonTableString,testEncoding);
		//String jsonTableSqlString = JsonUtils.objectToString(entityTableSqlFile);
		//FileUtils.saveFile(tempPath + strProjectCode + File.separator + strTaskCode + File.separator + strTaskCode + "~" + "tablesql.json",jsonTableSqlString,testEncoding);
		String jsonTableCheckString = JsonUtils.objectToString(checkRuleTableFile);
		FileUtils.saveFile(tempPath + strProjectCode + File.separator + strTaskCode + File.separator + strTaskCode + "_" + "tablecheck.json",jsonTableCheckString,testEncoding);
	}
}
*/