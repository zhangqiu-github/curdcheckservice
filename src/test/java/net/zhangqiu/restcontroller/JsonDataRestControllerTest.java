package net.zhangqiu.restcontroller;

/*
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import net.zhangqiu.BaseTest;

public class JsonDataRestControllerTest extends BaseTest{
	
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
			String jsonData = "{\"tableName\":\"Cooperation_Project\",\"data\":{\"strProjectCode\":\""+UUID.randomUUID().toString()+"\",\"strProjectName\":\""+"协作系统"+"\",\"strSourcePath\":\""+"源码路径"+"\",\"strProjectDescription\":\""+"项目描述"+"\",\"strUserCode\":\""+"admin"+"\"}}";
			try {
				jsonData = URLEncoder.encode(jsonData,testEncoding);
			}
			catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			String requestUrl = requestHost + "jsonDataSave?jsonData=" + jsonData;
			String result = restTemplate.getForObject(requestUrl,String.class);
			System.out.println(result);
		}
	}
	
	@Test
	public void test11() throws UnsupportedEncodingException, InterruptedException{
		String jsonData = "{\"tableName\":\"Cooperation_Project\",\"data\":{\"strProjectCode\":\""+UUID.randomUUID().toString()+"\",\"strProjectName\":\""+"协作系统"+"\",\"strSourcePath\":\""+"源码路径"+"\",\"strProjectDescription\":\""+"项目描述"+"\",\"strUserCode\":\""+"admin"+"\"}}";
		jsonData = URLEncoder.encode(jsonData,testEncoding);
		String requestUrl = requestHost + "jsonDataSave?jsonData=" + jsonData;
		restTemplate.getForObject(requestUrl,String.class);
	}
	
	@Test
	public void test12() throws UnsupportedEncodingException, InterruptedException{
		String jsonData = "{\"tableName\":\"Cooperation_Project\",\"data\":{\"strProjectCode\":\""+"cooperation"+"\",\"strProjectName\":\""+"协作系统(UPDATE)"+"\",\"strSourcePath\":\""+"源码路径"+"\",\"strProjectDescription\":\""+"项目描述"+"\",\"strUserCode\":\""+"admin"+"\"}}";
		jsonData = URLEncoder.encode(jsonData,testEncoding);
		String requestUrl = requestHost + "jsonDataUpdateById?jsonData=" + jsonData;
		restTemplate.getForObject(requestUrl,String.class);
	}
	
	@Test
	public void test13() throws UnsupportedEncodingException, InterruptedException{
		String jsonData = "{\"tableName\":\"Cooperation_Project\",\"data\":{\"strProjectCode\":\""+"cooperation"+"\",\"strProjectName\":\""+"协作系统(UPDATE)"+"\",\"strSourcePath\":\""+"源码路径"+"\",\"strProjectDescription\":\""+"项目描述"+"\",\"strUserCode\":\""+"admin"+"\"}}";
		jsonData = URLEncoder.encode(jsonData,testEncoding);
		String requestUrl = requestHost + "jsonDataDeleteById?jsonData=" + jsonData;
		restTemplate.getForObject(requestUrl,String.class);
	}
	
	@Test
	public void test21() throws UnsupportedEncodingException, InterruptedException{
		String jsonData = "{\"tableName\":\"Cooperation_Task\",\"data\":{\"strTaskCode\":\""+"coo_a01"+"\",\"strProjectCode\":\""+"cooperation"+"\",\"strTaskName\":\""+"任务名称"+"\",\"dtCreateDate\":\""+System.currentTimeMillis()+"\",\"strTaskDescription\":\""+"任务描述"+"\",\"strUserCode\":\""+"admin"+"\"}}";
		jsonData = URLEncoder.encode(jsonData,testEncoding);
		String requestUrl = requestHost + "jsonDataSave?jsonData=" + jsonData;
		restTemplate.getForObject(requestUrl,String.class);
	}
	
	@Test
	public void test22() throws UnsupportedEncodingException, InterruptedException{
		String jsonData = "{\"tableName\":\"Cooperation_Task\",\"data\":{\"strTaskCode\":\""+"coo_a01"+"\",\"strProjectCode\":\""+"cooperation"+"\",\"strTaskName\":\""+"任务名称"+"\",\"dtCreateDate\":\""+System.currentTimeMillis()+"\",\"strTaskDescription\":\""+"任务描述"+"\",\"strUserCode\":\""+"admin"+"\"}}";
		jsonData = URLEncoder.encode(jsonData,testEncoding);
		String requestUrl = requestHost + "jsonDataDeleteById?jsonData=" + jsonData;
		restTemplate.getForObject(requestUrl,String.class);
	}
	
	@Test
	public void test23() throws UnsupportedEncodingException, InterruptedException{
		String jsonData = "{\"tableName\":\"Cooperation_Task\",\"data\":{\"strTaskCode\":\""+"coo_a01"+"\",\"strProjectCode\":\""+"cooperation"+"\",\"strTaskName\":\""+"任务名称"+"\",\"dtCreateDate\":\""+System.currentTimeMillis()+"\",\"strTaskDescription\":\""+"任务描述"+"\",\"strUserCode\":\""+"admin"+"\"}}";
		jsonData = URLEncoder.encode(jsonData,testEncoding);
		String requestUrl = requestHost + "jsonDataSelectById?jsonData=" + jsonData;
		restTemplate.getForObject(requestUrl,String.class);
	}
	
	@Test
	public void test31() throws UnsupportedEncodingException, InterruptedException{
		String jsonData = "{\"tableName\":\"Cooperation_Project\",\"data\":{\"strProjectCode\":\""+"cooperation"+"\",\"strProjectName\":\""+"协作系统"+"\",\"strSourcePath\":\""+"源码路径"+"\",\"strProjectDescription\":\""+"项目描述"+"\",\"strUserCode\":\""+"admin"+"\"}}";
		jsonData = URLEncoder.encode(jsonData,testEncoding);
		String requestUrl = requestHost + "jsonDataCheck?jsonData=" + jsonData;
		restTemplate.getForObject(requestUrl,String.class);
	}
	
	@Test
	public void test32() throws UnsupportedEncodingException, InterruptedException{
		for(int i=0;i<10000;i++){
			String jsonData = "{\"tableName\":\"Cooperation_Project\",\"data\":{\"strProjectCode\":\""+"cooperation"+"\",\"strProjectName\":\""+"协作系统"+"\",\"strSourcePath\":\""+"源码路径"+"\",\"strProjectDescription\":\""+"项目描述"+"\",\"strUserCode\":\""+"admin"+"\"}}";
			jsonData = URLEncoder.encode(jsonData,testEncoding);
			String requestUrl = requestHost + "jsonDataCheck?jsonData=" + jsonData;
			restTemplate.getForObject(requestUrl,String.class);
		}
		String jsonData = "{\"tableName\":\"Cooperation_Project\",\"data\":{\"strProjectCode\":\""+"cooperation"+"\",\"strProjectName\":\""+"协作系统"+"\",\"strSourcePath\":\""+"源码路径"+"\",\"strProjectDescription\":\""+"项目描述"+"\",\"strUserCode\":\""+"admin"+"\"}}";
		jsonData = URLEncoder.encode(jsonData,testEncoding);
		String requestUrl = requestHost + "jsonDataCheck?jsonData=" + jsonData;
		System.out.println(restTemplate.getForObject(requestUrl,String.class));
	}
	
	@Test
	public void test33() throws UnsupportedEncodingException, InterruptedException{
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
				jsonData = URLEncoder.encode(jsonData,testEncoding);
			} catch (Exception e) {
				e.printStackTrace();
			}
			String requestUrl = requestHost + "jsonDataCheck?jsonData=" + jsonData;
			restTemplate.getForObject(requestUrl,String.class);
		}
	}
}
*/