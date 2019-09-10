package net.zhangqiu.service.database.imps.serial;
/*
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.testng.annotations.Test;

import net.zhangqiu.BaseTest;
import net.zhangqiu.service.database.interfaces.JsonDatasourceHandler;


public class JsonDataCheckServiceTest extends BaseTest{
	@Autowired
	@Qualifier("jsonDataCheckService")
	JsonDatasourceHandler jsonDatasourceHandler;
	
	@Test
	public void test() throws InterruptedException{
		for(int k=0;k<50;k++){
			ExecutorService executorService = Executors.newCachedThreadPool();
			for(int i=0;i<50;i++){
				executorService.execute(new JsonDataCheckThread());
			}
			executorService.shutdown();
			executorService.awaitTermination(10000000, TimeUnit.MILLISECONDS);
		}
	}
	
	class JsonDataCheckThread implements Runnable{
		public void run() {
			String jsonData = "{\"tableName\":\"Cooperation_Project\",\"data\":{\"strProjectCode\":\""+"cooperation"+"\",\"strProjectName\":\""+"协作系统"+"\",\"strSourcePath\":\""+"源码路径"+"\",\"strProjectDescription\":\""+"项目描述"+"\",\"strUserCode\":\""+"admin"+"\"}}";			
			try {
				jsonDatasourceHandler.handleService(null, null, jsonData, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void test1() throws Exception{
		String jsonData = "{\"tableName\":\"Cooperation_Project\",\"data\":{\"strProjectCode\":\""+"cooperation"+"\",\"strProjectName\":\""+"协作系统"+"\",\"strSourcePath\":\""+"源码路径"+"\",\"strProjectDescription\":\""+"项目描述"+"\",\"strUserCode\":\""+"admin"+"\"}}";	
		for(int i =0;i<10000;i++){
			jsonDatasourceHandler.handleService(null, null, jsonData, null);
		}
		System.out.println(jsonDatasourceHandler.handleService(null, null, jsonData, null));
	}
}
*/
