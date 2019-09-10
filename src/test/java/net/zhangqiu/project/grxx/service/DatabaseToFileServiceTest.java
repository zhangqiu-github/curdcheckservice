package net.zhangqiu.project.grxx.service;
/*
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

import net.zhangqiu.BaseTest;
import net.zhangqiu.service.database.entity.param.EntityDatabaseCheckTextParam;
import net.zhangqiu.service.database.interfaces.JsonDatasourceHandler;
import net.zhangqiu.utils.JsonUtils;

public class DatabaseToFileServiceTest extends BaseTest{
	
	@Autowired
	@Qualifier("databaseToFileService")
	JsonDatasourceHandler jsonDatasourceHandler;

	@Test
	public void test() throws Exception{
		EntityDatabaseCheckTextParam entityDatabaseText = new EntityDatabaseCheckTextParam();
		entityDatabaseText.setCacheLine(1000);
		entityDatabaseText.setRegex(",");
		entityDatabaseText.setResource("C:\\Users\\张秋\\Desktop\\e.txt");
		entityDatabaseText.setTableName("GR_GRXX_VIEW");
		String sql = "select jc.*";
		sql += ",jybsbg.FOREIGNID AS JYBSBG,jybsbg.YWH AS JYBSBG_YWH,jybsbg.JRJGDM AS JYBSBG_JRJGDM,jybsbg.JSYHKRQ AS JYBSBG_JSYHKRQ";
		sql += ",grsfxx.FOREIGNID AS GRSFXX,grsfxx.XB AS GRSFXX_XB,grsfxx.CSRQ AS GRSFXX_CSRQ,grsfxx.HYZK AS GRSFXX_HYZK";
		sql += ",grsfxx.ZGXL AS GRSFXX_ZGXL,grsfxx.ZGXW AS GRSFXX_ZGXW,grsfxx.ZZDH AS GRSFXX_ZZDH";
		sql += ",grsfxx.SJHM AS GRSFXX_SJHM,grsfxx.DWDH AS GRSFXX_DWDH,grsfxx.DZYX AS GRSFXX_DZYX";
		sql += ",grsfxx.TXDZ AS GRSFXX_TXDZ,grsfxx.TXDZYZBM AS GRSFXX_TXDZYZBM,grsfxx.HJDZ AS GRSFXX_HJDZ";
		sql += ",grsfxx.POXM AS GRSFXX_POXM,grsfxx.POZJLX AS GRSFXX_POZJLX,grsfxx.POZJHM AS GRSFXX_POZJHM";
		sql += ",grsfxx.POGZDW AS GRSFXX_POGZDW,grsfxx.POLXDH AS GRSFXX_POLXDH";
		sql += ",jzdz.FOREIGNID AS JZDZ,jzdz.JZDZ AS JZDZ_JZDZ,jzdz.ZJDZYZBM AS JZDZ_ZJDZYZBM,jzdz.ZJZK AS JZDZ_ZJZK";
		sql += ",tsjy.FOREIGNID AS TSJY,tsjy.TSJYLX AS TSJY_TSJYLX,tsjy.FSRQ AS TSJY_FSRQ,tsjy.BGYS AS TSJY_BGYS";
		sql += ",tsjy.FSJE AS TSJY_FSJE,tsjy.MXXX AS TSJY_MXXX";
		sql += ",zyxx.FOREIGNID AS ZYXX,zyxx.ZY AS ZYXX_ZY,zyxx.DWMC AS ZYXX_DWMC,zyxx.DWSSHY AS ZYXX_DWSSHY";
		sql += ",zyxx.DWDZ AS ZYXX_DWDZ,zyxx.DWDZYZBM AS ZYXX_DWDZYZBM,zyxx.BDWGZQSNF AS ZYXX_BDWGZQSNF";
		sql += ",zyxx.ZW AS ZYXX_ZW,zyxx.ZC AS ZYXX_ZC,zyxx.NSR AS ZYXX_NSR";
		sql += ",zyxx.GZZH AS ZYXX_GZZH,zyxx.GZZHKHYH AS ZYXX_GZZHKHYH";
		sql += ",dbxx.FOREIGNID AS DBXX,dbxx.ZJLX AS DBXX_ZJLX,dbxx.ZJHM AS DBXX_ZJHM,dbxx.XM AS DBXX_XM";
		sql += ",dbxx.DBJE AS DBXX_DBJE,dbxx.DBZT AS DBXX_DBZT";
		sql += " from gr_grxx_jc jc";
		sql += " left join gr_jybsbg jybsbg on jc.autoID = jybsbg.FOREIGNID and jybsbg.RPTSendType in ('1','5') and jybsbg.RPTFeedbackType in ('1','3','4')";
		sql += " left join gr_grsfxx grsfxx on jc.autoID = grsfxx.FOREIGNID and grsfxx.RPTSendType in ('1','5') and grsfxx.RPTFeedbackType in ('1','3','4')";
		sql += " left join gr_jzdz jzdz on jc.autoID = jzdz.FOREIGNID and jzdz.RPTSendType in ('1','5') and jzdz.RPTFeedbackType in ('1','3','4')";
		sql += " left join gr_tsjy tsjy on jc.autoID = tsjy.FOREIGNID and tsjy.RPTSendType in ('1','5') and tsjy.RPTFeedbackType in ('1','3','4')";
		sql += " left join gr_zyxx zyxx on jc.autoID = zyxx.FOREIGNID and zyxx.RPTSendType in ('1','5') and zyxx.RPTFeedbackType in ('1','3','4')";
		sql += " left join gr_dbxx dbxx on jc.autoID = dbxx.FOREIGNID and dbxx.RPTSendType in ('1','5') and dbxx.RPTFeedbackType in ('1','3','4')";
		sql += " where jc.instInfo in ('000100') and jc.RPTVerifyType = '2' and jc.RPTSendType in ('1','5') and jc.RPTFeedbackType in ('1','3','4') and jc.JSYHKRQ like '201801%'";
		sql += " order by jc.autoID;";

		entityDatabaseText.setSql(sql);
		String jsonString = JsonUtils.objectToString(entityDatabaseText);
		jsonString = URLEncoder.encode(jsonString,testEncoding);
		
		jsonDatasourceHandler.handleService(null,"grxx", "v3", jsonString, null);
	}
	
}

*/
