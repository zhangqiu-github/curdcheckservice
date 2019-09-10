package net.zhangqiu.project.grxx.restcontroller;
/*
import java.io.File;

import net.zhangqiu.BaseTest;
import net.zhangqiu.service.database.entity.EntityDatasource;
import net.zhangqiu.service.database.entity.EntityDatasourceFile;
import net.zhangqiu.utils.FileUtils;
import net.zhangqiu.utils.JsonUtils;

import org.testng.annotations.Test;

public class DatasourceFileSaveRestControllerTest extends BaseTest{

	@Test
	public void test() throws Exception{
		EntityDatasourceFile entityDatasourceFile = new EntityDatasourceFile();

		EntityDatasource entityDatasource4 = new EntityDatasource();
		entityDatasource4.setDataSourceName("v3");
		entityDatasource4.setUrl("jdbc:mysql://localhost:3306/v3");
		entityDatasource4.setUserName("root");
		entityDatasource4.setPassword("root");
		entityDatasource4.setStrDatabaseType("mysql");
		entityDatasource4.setDriverClassName("com.mysql.jdbc.Driver");
		
		entityDatasourceFile.getEntityDatasourceList().add(entityDatasource4);
		
		String jsonString = JsonUtils.objectToString(entityDatasourceFile);
		String strProjectCode = "grxx";
		FileUtils.saveFile(tempPath + strProjectCode + File.separator + strProjectCode + "_" + "datasource.json",jsonString,testEncoding);
	}
}
*/