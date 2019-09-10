package net.zhangqiu.restcontroller;
/*
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import net.zhangqiu.BaseTest;
import net.zhangqiu.service.database.entity.EntityContext;
import net.zhangqiu.service.database.entity.param.EntityDataParam;
import net.zhangqiu.utils.JsonUtils;

public class JsonDataRestController1Test extends BaseTest{
	
	@Autowired
	EntityContext entityContext;
	
	@Test
	public void test() throws UnsupportedEncodingException, InterruptedException{
		for(int k=0;k<1;k++){
			ExecutorService executorService = Executors.newCachedThreadPool();
			for(int i=0;i<1;i++){
				executorService.execute(new JsonDataSaveThread());
			}
			executorService.shutdown();
			executorService.awaitTermination(10000000, TimeUnit.MILLISECONDS);
		}
	}
	
	class JsonDataSaveThread implements Runnable{
				
		public void run() {			
			try {
				EntityDataParam entityData = new EntityDataParam();
				entityData.setTableName("Cooperation_GRXX");
				Map<String,Object> map = new HashMap<String,Object>();
				
				map.put("autoID", entityContext.getNextId());
				map.put("instInfo", "aaaaaaaaaaaaaaaaaaaa");
				map.put("dtDate", System.currentTimeMillis());
				map.put("extend1", "aaaaaaaaaaaaaaaaaaaa");
				map.put("extend2", "aaaaaaaaaaaaaaaaaaaa");
				map.put("extend3", "aaaaaaaaaaaaaaaaaaaa");
				map.put("extend4", "aaaaaaaaaaaaaaaaaaaa");
				map.put("extend5", "aaaaaaaaaaaaaaaaaaaa");
				map.put("RPTFeedbackType", "1");
				map.put("RPTSubmitStatus", "1");
				map.put("RPTVerifyType", "1");
				map.put("RPTSendType", "1");
				map.put("RPTCheckType", "1");
				map.put("lastUpdateDate", "20180101");
				map.put("operationUser", "admin");
				
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
				
				map.put("GRSFXX", "aaaaaaaaaaaaaaaaaaaa");
				map.put("GRSFXX_XB", "1");
				map.put("GRSFXX_CSRQ", "20180101");
				map.put("GRSFXX_HYZK", "21");
				map.put("GRSFXX_ZGXL", "10");
				map.put("GRSFXX_ZGXW", "1");
				map.put("GRSFXX_ZZDH", "aaaaaaaaaaaaaaaaaaaa");
				map.put("GRSFXX_SJHM", "aaaaaaaaaaaaaaaa");
				map.put("GRSFXX_DWDH", "aaaaaaaaaaaaaaaaaaaa");
				map.put("GRSFXX_DZYX", "aaaaaaaaaaaaaaaaaaaa");
				map.put("GRSFXX_TXDZ", "aaaaaaaaaaaaaaaaaaaa");
				map.put("GRSFXX_TXDZYZBM", "111111");
				map.put("GRSFXX_HJDZ", "aaaaaaaaaaaaaaaaaaaa");
				map.put("GRSFXX_POXM", "aaaaaaaaaaaaaaaaaaaa");
				map.put("GRSFXX_POZJLX", "1");
				map.put("GRSFXX_POZJHM", "aaaaaaaaaaaaaaaaaa");
				map.put("GRSFXX_POGZDW", "aaaaaaaaaaaaaaaaaaaa");
				map.put("GRSFXX_POLXDH", "aaaaaaaaaaaaaaaaaaaa");
				
				map.put("ZYXX", "aaaaaaaaaaaaaaaaaaaa");
				map.put("ZYXX_ZY", "1");
				map.put("ZYXX_DWMC", "aaaaaaaaaaaaaaaaaaaa");
				map.put("ZYXX_DWSSHY", "D");
				map.put("ZYXX_DWDZ", "aaaaaaaaaaaaaaaaaaaa");
				map.put("ZYXX_DWDZYZBM", "111111");
				map.put("ZYXX_BDWGZQSNF", "1111");
				map.put("ZYXX_ZW", "1");
				map.put("ZYXX_ZC", "1");
				map.put("ZYXX_NSR", "10000");
				map.put("ZYXX_GZZH", "aaaaaaaaaaaaaaaaaaaa");
				map.put("ZYXX_GZZHKHYH", "aaaaaaaaaaaaaa");
				
				map.put("JZDZ", "aaaaaaaaaaaaaaaaaaaa");
				map.put("JZDZ_JZDZ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
				map.put("JZDZ_ZJDZYZBM", "111111");
				map.put("JZDZ_ZJZK", "a");
				
				map.put("JYBSBG", "aaaaaaaaaaaaaaaaaaaa");
				map.put("JYBSBG_YWH", "aaaaaaaaaaaaaaaaaaaa");
				map.put("JYBSBG_JRJGDM", "aaaaaaaaaaaaaa");
				map.put("JYBSBG_JSYHKRQ", "20180101");
				
				map.put("TSJY", "aaaaaaaaaaaaaaaaaaaa");
				map.put("TSJY_TSJYLX", "3");
				map.put("TSJY_FSRQ", "20180101");
				map.put("TSJY_BGYS", "0101");
				map.put("TSJY_FSJE", "10000");
				map.put("TSJY_MXXX", "aaaaaaaaaaaaaaaaaaaa");
				
				map.put("DBXX", "aaaaaaaaaaaaaaaaaaaa");
				map.put("DBXX_ZJLX", "0");
				map.put("DBXX_ZJHM", "500382198501018643");
				map.put("DBXX_XM", "aaaaaaaaaaaaaaaaaaaa");
				map.put("DBXX_DBJE", "10000");
				map.put("DBXX_DBZT", "1");
				//List<Map<String,Object>> dbxxMapList = new ArrayList<Map<String,Object>>();
				//Map<String,Object> dbxxMap = new HashMap<String,Object>();
				//dbxxMap.put("DBXX", "aaaaaaaaaaaaaaaaaaaa");
				//dbxxMap.put("DBXX_ZJLX", "0");
				//dbxxMap.put("DBXX_ZJHM", "500382198501018643");
				//dbxxMap.put("DBXX_XM", "aaaaaaaaaaaaaaaaaaaa");
				//dbxxMap.put("DBXX_DBJE", "10000");
				//dbxxMap.put("DBXX_DBZT", "1");
				//dbxxMapList.add(dbxxMap);
				//map.put("DBXX",dbxxMapList);

				entityData.setData(map);
				String jsonData = URLEncoder.encode(JsonUtils.objectToString(entityData),testEncoding);
				String requestUrl = requestHost + "jsonDataSave?datasourceName=sampledb1&jsonData=" + jsonData;
				restTemplate.getForObject(requestUrl,String.class);
			} 
			catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
}
*/
