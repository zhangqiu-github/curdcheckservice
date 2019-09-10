package net.zhangqiu.service.database.imps.batch;
/*

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
	
	@Autowired
	@Qualifier("databaseToFile1Service")
	JsonDatasourceHandler jsonDatasourceHandler1;
	
	@Test
	public void test() throws Exception{
		EntityDatabaseCheckTextParam entityDatabaseText = new EntityDatabaseCheckTextParam();
		entityDatabaseText.setCacheLine(1000);
		entityDatabaseText.setRegex(",");
		entityDatabaseText.setResource("C:\\Users\\张秋\\Desktop\\a.txt");
		entityDatabaseText.setTableName("Cooperation_Project");
		entityDatabaseText.setSql("SELECT * FROM Cooperation_Project");
		jsonDatasourceHandler.handleService(null, null, JsonUtils.objectToString(entityDatabaseText), null);
	}
	
	@Test
	public void test1() throws Exception{
		EntityDatabaseCheckTextParam entityDatabaseText = new EntityDatabaseCheckTextParam();
		entityDatabaseText.setCacheLine(1000);
		entityDatabaseText.setRegex(",");
		entityDatabaseText.setResource("C:\\Users\\张秋\\Desktop\\b.txt");
		entityDatabaseText.setTableName("Cooperation_Project");
		entityDatabaseText.setSql("SELECT * FROM Cooperation_Project");
		jsonDatasourceHandler1.handleService(null, null, JsonUtils.objectToString(entityDatabaseText), null);
	}
	
	@Test
	public void test2() throws Exception{
		EntityDatabaseCheckTextParam entityDatabaseText = new EntityDatabaseCheckTextParam();
		entityDatabaseText.setCacheLine(1000);
		entityDatabaseText.setRegex(",");
		entityDatabaseText.setResource("C:\\Users\\张秋\\Desktop\\c.txt");
		entityDatabaseText.setTableName("Cooperation_GRXX");
		entityDatabaseText.setSql("SELECT * FROM Cooperation_GRXX");
		jsonDatasourceHandler.handleService(null, null, JsonUtils.objectToString(entityDatabaseText), null);
	}
	
	@Test
	public void test3() throws Exception{
		EntityDatabaseCheckTextParam entityDatabaseText = new EntityDatabaseCheckTextParam();
		entityDatabaseText.setCacheLine(1000);
		entityDatabaseText.setRegex(",");
		entityDatabaseText.setResource("C:\\Users\\张秋\\Desktop\\d.txt");
		entityDatabaseText.setTableName("Cooperation_GRXX");
		entityDatabaseText.setSql("SELECT * FROM Cooperation_GRXX");
		jsonDatasourceHandler1.handleService(null, null, JsonUtils.objectToString(entityDatabaseText), null);
	}
}
*/