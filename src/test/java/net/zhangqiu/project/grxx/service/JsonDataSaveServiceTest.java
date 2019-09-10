package net.zhangqiu.project.grxx.service;
/*
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

import net.zhangqiu.BaseTest;

import net.zhangqiu.service.database.entity.EntityContext;
import net.zhangqiu.service.database.entity.param.EntityDataParam;
import net.zhangqiu.service.database.interfaces.EntityTransactionHandler;

public class JsonDataSaveServiceTest extends BaseTest{
	
	@Autowired
	@Qualifier("jsonDataSaveService")
	EntityTransactionHandler jsonDataSaveService;
	
	@Autowired
	EntityContext entityContext;
	
	class EntityDataSaveThread implements Runnable{
		
		public void run() {	
			
			long jcId = entityContext.getNextId();
			
			EntityDataParam entityData = new EntityDataParam();
			entityData.setTableName("GR_GRXX_JC");
			Map<String,Object> map = new HashMap<String,Object>();
			
			map.put("autoID", jcId);
			map.put("operationUser", null);
			map.put("instInfo", "000100");
			map.put("dtDate", System.currentTimeMillis());
			
			map.put("extend1", "aaaaaaaaaaaaaaaaaaaa");
			map.put("extend2", "aaaaaaaaaaaaaaaaaaaa");
			map.put("extend3", "aaaaaaaaaaaaaaaaaaaa");
			map.put("extend4", "aaaaaaaaaaaaaaaaaaaa");
			map.put("extend5", "aaaaaaaaaaaaaaaaaaaa");
			map.put("RPTFeedbackType", "1");
			map.put("RPTSubmitStatus", "1");
			map.put("RPTVerifyType", "2");
			map.put("RPTSendType", "1");
			map.put("RPTCheckType", "1");
			map.put("lastUpdateDate", "20180101");

			map.put("JRJGDM", "aaaaaaaaaaaaa1");
			map.put("XZXH", "aaaaaaaaaaaaaaaaaaaa");
			map.put("YWZL", "1");
			map.put("YWZLXF", "91");
			map.put("YWH", entityContext.getNextId());
			map.put("FSDD", "000000");
			map.put("KHRQ", "20180101");
			map.put("DQRQ", "20180101");
			map.put("BZ", "JPY");
			map.put("SXED", "50001");
			map.put("GXSXED", "10000");
			map.put("ZDFZE", "50001");
			map.put("DBFS", "1");
			map.put("HKPL", "08");
			map.put("HKYS", "U");
			map.put("SYHKYS", "U");
			map.put("JSYHKRQ", "20180101");
			map.put("ZHYCSJHKRQ", "20180101");
			map.put("BYYHKJE", "10000");
			map.put("BYSJHKJE", "10000");
			map.put("YE", "50001");
			map.put("DQYQQS", "00");
			map.put("DQYQZE", "50000");
			map.put("YQ31_60HDKBJ", "10000");
			map.put("YQ61_90HDKBJ", "10000");
			map.put("YQ91_180HDKBJ", "10000");
			map.put("YQ180YSHDKBJ", "10000");
			map.put("LJYQQS", "000");
			map.put("ZGYQQS", "00");
			map.put("WJFLZT", "1");
			map.put("ZHZT", "1");
			map.put("HKZT", "////////////////////////");
			map.put("HKZT_24", "1");
			map.put("WZFYE", "10000");
			map.put("ZHYYZXXTS", "1");
			map.put("ZJLX", "0");
			map.put("ZJHM", "500382198501018643");
			map.put("XM", "aaaaaaaaaaaaaaaaaaaa");
			map.put("YLZD", "aaaaaaaaaaaaaaaaaaaa");
			entityData.setData(map);
			
			EntityDataParam GRSFXX = new EntityDataParam();
			GRSFXX.setTableName("GR_GRSFXX");
			Map<String,Object> GRSFXXMap = new HashMap<String,Object>();
			GRSFXXMap.put("autoID", entityContext.getNextId());
			GRSFXXMap.put("FOREIGNID", jcId);
			GRSFXXMap.put("extend1", "aaaaaaaaaaaaaaaaaaaa");
			GRSFXXMap.put("extend2", "aaaaaaaaaaaaaaaaaaaa");
			GRSFXXMap.put("extend3", "aaaaaaaaaaaaaaaaaaaa");
			GRSFXXMap.put("extend4", "aaaaaaaaaaaaaaaaaaaa");
			GRSFXXMap.put("extend5", "aaaaaaaaaaaaaaaaaaaa");
			GRSFXXMap.put("RPTFeedbackType", "1");
			GRSFXXMap.put("RPTSendType", "1");
			GRSFXXMap.put("RPTCheckType", "1");
			
			GRSFXXMap.put("XB", "1");
			GRSFXXMap.put("CSRQ", "20180101");
			GRSFXXMap.put("HYZK", "21");
			GRSFXXMap.put("ZGXL", "10");
			GRSFXXMap.put("ZGXW", "1");
			GRSFXXMap.put("ZZDH", "aaaaaaaaaaaaaaaaaaaa");
			GRSFXXMap.put("SJHM", "aaaaaaaaaaaaaaaa");
			GRSFXXMap.put("DWDH", "aaaaaaaaaaaaaaaaaaaa");
			GRSFXXMap.put("DZYX", "aaaaaaaaaaaaaaaaaaaa");
			GRSFXXMap.put("TXDZ", "aaaaaaaaaaaaaaaaaaaa");
			GRSFXXMap.put("TXDZYZBM", "111111");
			GRSFXXMap.put("HJDZ", "aaaaaaaaaaaaaaaaaaaa");
			GRSFXXMap.put("POXM", "aaaaaaaaaaaaaaaaaaaa");
			GRSFXXMap.put("POZJLX", "1");
			GRSFXXMap.put("POZJHM", "aaaaaaaaaaaaaaaaaa");
			GRSFXXMap.put("POGZDW", "aaaaaaaaaaaaaaaaaaaa");
			GRSFXXMap.put("POLXDH", "aaaaaaaaaaaaaaaaaaaa");
			GRSFXX.setData(GRSFXXMap);
			
			EntityDataParam ZYXX = new EntityDataParam();
			ZYXX.setTableName("GR_ZYXX");
			Map<String,Object> ZYXXMap = new HashMap<String,Object>();
			
			ZYXXMap.put("autoID", entityContext.getNextId());
			ZYXXMap.put("FOREIGNID", jcId);
			ZYXXMap.put("extend1", "aaaaaaaaaaaaaaaaaaaa");
			ZYXXMap.put("extend2", "aaaaaaaaaaaaaaaaaaaa");
			ZYXXMap.put("extend3", "aaaaaaaaaaaaaaaaaaaa");
			ZYXXMap.put("extend4", "aaaaaaaaaaaaaaaaaaaa");
			ZYXXMap.put("extend5", "aaaaaaaaaaaaaaaaaaaa");
			ZYXXMap.put("RPTFeedbackType", "1");
			ZYXXMap.put("RPTSendType", "1");
			ZYXXMap.put("RPTCheckType", "1");
			
			ZYXXMap.put("ZY", "1");
			ZYXXMap.put("DWMC", "aaaaaaaaaaaaaaaaaaaa");
			ZYXXMap.put("DWSSHY", "D");
			ZYXXMap.put("DWDZ", "aaaaaaaaaaaaaaaaaaaa");
			ZYXXMap.put("DWDZYZBM", "111111");
			ZYXXMap.put("BDWGZQSNF", "1111");
			ZYXXMap.put("ZW", "1");
			ZYXXMap.put("ZC", "1");
			ZYXXMap.put("NSR", "10000");
			ZYXXMap.put("GZZH", "aaaaaaaaaaaaaaaaaaaa");
			ZYXXMap.put("GZZHKHYH", "aaaaaaaaaaaaaa");
			
			ZYXX.setData(ZYXXMap);
			
			EntityDataParam JZDZ = new EntityDataParam();
			JZDZ.setTableName("GR_JZDZ");
			Map<String,Object> JZDZMap = new HashMap<String,Object>();
			
			JZDZMap.put("autoID", entityContext.getNextId());
			JZDZMap.put("FOREIGNID", jcId);
			JZDZMap.put("extend1", "aaaaaaaaaaaaaaaaaaaa");
			JZDZMap.put("extend2", "aaaaaaaaaaaaaaaaaaaa");
			JZDZMap.put("extend3", "aaaaaaaaaaaaaaaaaaaa");
			JZDZMap.put("extend4", "aaaaaaaaaaaaaaaaaaaa");
			JZDZMap.put("extend5", "aaaaaaaaaaaaaaaaaaaa");
			JZDZMap.put("RPTFeedbackType", "1");
			JZDZMap.put("RPTSendType", "1");
			JZDZMap.put("RPTCheckType", "1");
			
			JZDZMap.put("JZDZ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			JZDZMap.put("ZJDZYZBM", "111111");
			JZDZMap.put("ZJZK", "a");
			
			JZDZ.setData(JZDZMap);
			
			EntityDataParam JYBSBG = new EntityDataParam();
			JYBSBG.setTableName("GR_JYBSBG");
			Map<String,Object> JYBSBGMap = new HashMap<String,Object>();
			
			JYBSBGMap.put("autoID", entityContext.getNextId());
			JYBSBGMap.put("FOREIGNID", jcId);
			JYBSBGMap.put("extend1", "aaaaaaaaaaaaaaaaaaaa");
			JYBSBGMap.put("extend2", "aaaaaaaaaaaaaaaaaaaa");
			JYBSBGMap.put("extend3", "aaaaaaaaaaaaaaaaaaaa");
			JYBSBGMap.put("extend4", "aaaaaaaaaaaaaaaaaaaa");
			JYBSBGMap.put("extend5", "aaaaaaaaaaaaaaaaaaaa");
			JYBSBGMap.put("RPTFeedbackType", "1");
			JYBSBGMap.put("RPTSendType", "1");
			JYBSBGMap.put("RPTCheckType", "1");
			
			JYBSBGMap.put("YWH", "aaaaaaaaaaaaaaaaaaaa");
			JYBSBGMap.put("JRJGDM", "aaaaaaaaaaaaaa");
			JYBSBGMap.put("JSYHKRQ", "20180101");
			
			JYBSBG.setData(JYBSBGMap);
			
			EntityDataParam TSJY = new EntityDataParam();
			TSJY.setTableName("GR_TSJY");
			Map<String,Object> TSJYMap = new HashMap<String,Object>();
			
			TSJYMap.put("autoID", entityContext.getNextId());
			TSJYMap.put("FOREIGNID", jcId);
			TSJYMap.put("extend1", "aaaaaaaaaaaaaaaaaaaa");
			TSJYMap.put("extend2", "aaaaaaaaaaaaaaaaaaaa");
			TSJYMap.put("extend3", "aaaaaaaaaaaaaaaaaaaa");
			TSJYMap.put("extend4", "aaaaaaaaaaaaaaaaaaaa");
			TSJYMap.put("extend5", "aaaaaaaaaaaaaaaaaaaa");
			TSJYMap.put("RPTFeedbackType", "1");
			TSJYMap.put("RPTSendType", "1");
			TSJYMap.put("RPTCheckType", "1");
			
			TSJYMap.put("TSJYLX", "3");
			TSJYMap.put("FSRQ", "20180101");
			TSJYMap.put("BGYS", "0101");
			TSJYMap.put("FSJE", "10000");
			TSJYMap.put("MXXX", "aaaaaaaaaaaaaaaaaaaa");
			
			TSJY.setData(TSJYMap);
			
			EntityDataParam DBXX = new EntityDataParam();
			DBXX.setTableName("GR_DBXX");
			Map<String,Object> DBXXMap = new HashMap<String,Object>();
			
			DBXXMap.put("autoID", entityContext.getNextId());
			DBXXMap.put("FOREIGNID", jcId);
			DBXXMap.put("extend1", "aaaaaaaaaaaaaaaaaaaa");
			DBXXMap.put("extend2", "aaaaaaaaaaaaaaaaaaaa");
			DBXXMap.put("extend3", "aaaaaaaaaaaaaaaaaaaa");
			DBXXMap.put("extend4", "aaaaaaaaaaaaaaaaaaaa");
			DBXXMap.put("extend5", "aaaaaaaaaaaaaaaaaaaa");
			DBXXMap.put("RPTFeedbackType", "1");
			DBXXMap.put("RPTSendType", "1");
			DBXXMap.put("RPTCheckType", "1");
			
			DBXXMap.put("ZJLX", "0");
			DBXXMap.put("ZJHM", "500382198501018643");
			DBXXMap.put("XM", "aaaaaaaaaaaaaaaaaaaa");
			DBXXMap.put("DBJE", "10000");
			DBXXMap.put("DBZT", "1");
			
			DBXX.setData(DBXXMap);
			
			EntityDataParam DBXX1 = new EntityDataParam();
			DBXX1.setTableName("GR_DBXX");
			Map<String,Object> DBXX1Map = new HashMap<String,Object>();
			
			DBXX1Map.put("autoID", entityContext.getNextId());
			DBXX1Map.put("FOREIGNID", jcId);
			DBXX1Map.put("extend1", "aaaaaaaaaaaaaaaaaaaa");
			DBXX1Map.put("extend2", "aaaaaaaaaaaaaaaaaaaa");
			DBXX1Map.put("extend3", "aaaaaaaaaaaaaaaaaaaa");
			DBXX1Map.put("extend4", "aaaaaaaaaaaaaaaaaaaa");
			DBXX1Map.put("extend5", "aaaaaaaaaaaaaaaaaaaa");
			DBXX1Map.put("RPTFeedbackType", "1");
			DBXX1Map.put("RPTSendType", "1");
			DBXX1Map.put("RPTCheckType", "1");
			
			DBXX1Map.put("ZJLX", "0");
			DBXX1Map.put("ZJHM", "500382198501018643");
			DBXX1Map.put("XM", "aaaaaaaaaaaaaaaaaaaa");
			DBXX1Map.put("DBJE", "10000");
			DBXX1Map.put("DBZT", "1");
			
			DBXX1.setData(DBXX1Map);
									
			try {
				jsonDataSaveService.transactionService("grxx","v3", entityData);
				jsonDataSaveService.transactionService("grxx","v3", GRSFXX);
				jsonDataSaveService.transactionService("grxx","v3", ZYXX);
				jsonDataSaveService.transactionService("grxx","v3", JZDZ);
				jsonDataSaveService.transactionService("grxx","v3", JYBSBG);
				jsonDataSaveService.transactionService("grxx","v3", TSJY);
				jsonDataSaveService.transactionService("grxx","v3", DBXX);
				//jsonDataSaveService.transactionService("v3", DBXX1);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void test() throws Exception{
		for(int k=0;k<1;k++){
			ExecutorService executorService = Executors.newCachedThreadPool();
			for(int i=0;i<1;i++){
				executorService.execute(new EntityDataSaveThread());
			}
			executorService.shutdown();
			executorService.awaitTermination(10000000, TimeUnit.MILLISECONDS);
		}
	}
}
*/
