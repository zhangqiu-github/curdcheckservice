package net.zhangqiu.service.database.imps.batch;

/*
import net.zhangqiu.BaseTest;
import net.zhangqiu.service.database.interfaces.JsonHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

public class DatabaseToDatabaseServiceTest extends BaseTest{
	@Autowired
	@Qualifier("databaseToDatabaseService")
	JsonHandler jsonDatabaseInterHandler;
	
	@Test
	public void test() throws Exception{

		EntityDatabaseInterParam entityDatabaseInter = new EntityDatabaseInterParam();
		entityDatabaseInter.setCacheLine(1000);
		entityDatabaseInter.setFromDatasourceName("sampledb1");
		entityDatabaseInter.setFromSql("SELECT * FROM Cooperation_Project");
		entityDatabaseInter.setToDatasourceName("sampledb2");
		entityDatabaseInter.setToTableName("Cooperation_Project");
		jsonDatabaseInterHandler.handleService(null, JsonUtils.objectToString(entityDatabaseInter), null);
	}
	
	@Test
	public void test1() throws Exception{
		EntityDatabaseInterParam entityDatabaseInter = new EntityDatabaseInterParam();
		entityDatabaseInter.setCacheLine(1000);
		entityDatabaseInter.setFromDatasourceName("sampledb1");
		entityDatabaseInter.setFromSql("select `autoID`, `instInfo`, `dtDate`, `extend1`, `extend2`, `extend3`, `extend4`, `extend5`, `RPTFeedbackType`, `RPTSubmitStatus`, `RPTVerifyType`, `RPTSendType`, `RPTCheckType`, `lastUpdateDate`, `operationUser`, `JRJGDM`, `XZXH`, `YWZL`, `YWZLXF`, `YWH`, `FSDD`, `KHRQ`, `DQRQ`, `BZ`, `SXED`, `GXSXED`, `ZDFZE`, `DBFS`, `HKPL`, `HKYS`, `SYHKYS`, `JSYHKRQ`, `ZHYCSJHKRQ`, `BYYHKJE`, `BYSJHKJE`, `YE`, `DQYQQS`, `DQYQZE`, `YQ31_60HDKBJ`, `YQ61_90HDKBJ`, `YQ91_180HDKBJ`, `YQ180YSHDKBJ`, `LJYQQS`, `ZGYQQS`, `WJFLZT`, `ZHZT`, `HKZT`, `HKZT_24`, `WZFYE`, `ZHYYZXXTS`, `ZJLX`, `ZJHM`, `XM`, `YLZD`, `GRSFXX`, `GRSFXX_XB`, `GRSFXX_CSRQ`, `GRSFXX_HYZK`, `GRSFXX_ZGXL`, `GRSFXX_ZGXW`, `GRSFXX_ZZDH`, `GRSFXX_SJHM`, `GRSFXX_DWDH`, `GRSFXX_DZYX`, `GRSFXX_TXDZ`, `GRSFXX_TXDZYZBM`, `GRSFXX_HJDZ`, `GRSFXX_POXM`, `GRSFXX_POZJLX`, `GRSFXX_POZJHM`, `GRSFXX_POGZDW`, `GRSFXX_POLXDH`, `ZYXX`, `ZYXX_ZY`, `ZYXX_DWMC`, `ZYXX_DWSSHY`, `ZYXX_DWDZ`, `ZYXX_DWDZYZBM`, `ZYXX_BDWGZQSNF`, `ZYXX_ZW`, `ZYXX_ZC`, `ZYXX_NSR`, `ZYXX_GZZH`, `ZYXX_GZZHKHYH`, `JZDZ`, `JZDZ_JZDZ`, `JZDZ_ZJDZYZBM`, `JZDZ_ZJZK`, `JYBSBG`, `JYBSBG_YWH`, `JYBSBG_JRJGDM`, `JYBSBG_JSYHKRQ`, `TSJY`, `TSJY_TSJYLX`, `TSJY_FSRQ`, `TSJY_BGYS`, `TSJY_FSJE`, `TSJY_MXXX`, group_concat(case when DBXX is null then '' else DBXX end) as DBXX, group_concat(case when DBXX_ZJLX is null then '' else DBXX_ZJLX end) as DBXX_ZJLX, group_concat(case when DBXX_ZJHM is null then '' else DBXX_ZJHM end) as DBXX_ZJHM, group_concat(case when DBXX_XM is null then '' else DBXX_XM end) as DBXX_XM, group_concat(case when DBXX_DBJE is null then '' else DBXX_DBJE end) as DBXX_DBJE, group_concat(case when DBXX_DBZT is null then '' else DBXX_DBZT end) as DBXX_DBZT from Cooperation_GRXX group by autoId");
		entityDatabaseInter.setToDatasourceName("sampledb2");
		entityDatabaseInter.setToTableName("Cooperation_GRXX");
		jsonDatabaseInterHandler.handleService(null, JsonUtils.objectToString(entityDatabaseInter), null);
	}
}
*/