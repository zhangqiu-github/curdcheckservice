package net.zhangqiu.project.cooperation.restcontroller;

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

		EntityDatasource entityDatasource = new EntityDatasource();
		entityDatasource.setDataSourceName("sampledb1");
		//?useCursorFetch=true&defaultFetchSize=1000
		entityDatasource.setUrl("jdbc:mysql://localhost:3306/sampledb1");
		entityDatasource.setUserName("root");
		entityDatasource.setPassword("root");
		entityDatasource.setDriverClassName("com.mysql.jdbc.Driver");
		entityDatasource.setStrDatabaseType("mysql");
		entityDatasource.setDefaultDatasource(true);
		
		EntityDatasource entityDatasource1 = new EntityDatasource();
		entityDatasource1.setDataSourceName("sampledb2");
		entityDatasource1.setUrl("jdbc:mysql://localhost:3306/sampledb2");
		entityDatasource1.setUserName("root");
		entityDatasource1.setPassword("root");
		entityDatasource1.setStrDatabaseType("mysql");
		entityDatasource1.setDriverClassName("com.mysql.jdbc.Driver");
		
		EntityDatasource entityDatasource2 = new EntityDatasource();
		entityDatasource2.setDataSourceName("sample1");
		entityDatasource2.setUrl("jdbc:mysql://192.168.0.200:3306/sample1");
		entityDatasource2.setUserName("root");
		entityDatasource2.setPassword("1234");
		entityDatasource2.setStrDatabaseType("mysql");
		entityDatasource2.setDriverClassName("com.mysql.jdbc.Driver");
		
		EntityDatasource entityDatasource3 = new EntityDatasource();
		entityDatasource3.setDataSourceName("sample2");
		entityDatasource3.setUrl("jdbc:mysql://192.168.0.200:3306/sample2");
		entityDatasource3.setUserName("root");
		entityDatasource3.setPassword("1234");
		entityDatasource3.setStrDatabaseType("mysql");
		entityDatasource3.setDriverClassName("com.mysql.jdbc.Driver");
		
		EntityDatasource entityDatasource4 = new EntityDatasource();
		entityDatasource4.setDataSourceName("v3full");
		entityDatasource4.setUrl("jdbc:mysql://localhost:3306/v3full");
		entityDatasource4.setUserName("root");
		entityDatasource4.setPassword("root");
		entityDatasource4.setStrDatabaseType("mysql");
		entityDatasource4.setDriverClassName("com.mysql.jdbc.Driver");
		
		entityDatasourceFile.getEntityDatasourceList().add(entityDatasource);
		entityDatasourceFile.getEntityDatasourceList().add(entityDatasource1);
		entityDatasourceFile.getEntityDatasourceList().add(entityDatasource2);
		entityDatasourceFile.getEntityDatasourceList().add(entityDatasource3);
		entityDatasourceFile.getEntityDatasourceList().add(entityDatasource4);
		
		String jsonString = JsonUtils.objectToString(entityDatasourceFile);
		String strProjectCode = "cooperation";
		FileUtils.saveFile(tempPath + strProjectCode + File.separator + strProjectCode + "_" + "datasource.json",jsonString,testEncoding);
	}
}

*/