package net.zhangqiu.project.cooperation.restcontroller;
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
		EntityTable cooperation_Project = new EntityTable();
		cooperation_Project.setTableName("Cooperation_Project");
		cooperation_Project.getIdColumnSet().add("strProjectCode");
		cooperation_Project.getEntityColumnList().add(new EntityColumn("strProjectCode"));
		cooperation_Project.getEntityColumnList().add(new EntityColumn("strProjectName"));
		cooperation_Project.getEntityColumnList().add(new EntityColumn("strSourcePath"));
		cooperation_Project.getEntityColumnList().add(new EntityColumn("strProjectDescription"));
		cooperation_Project.getEntityColumnList().add(new EntityColumn("strUserCode"));
		
		EntityTable cooperation_Project1 = new EntityTable();
		cooperation_Project1.setDataSourceName("sampledb2");
		cooperation_Project1.setTableName("Cooperation_Project");
		cooperation_Project1.getIdColumnSet().add("strProjectCode");
		cooperation_Project1.getEntityColumnList().add(new EntityColumn("strProjectCode"));
		cooperation_Project1.getEntityColumnList().add(new EntityColumn("strProjectName"));
		cooperation_Project1.getEntityColumnList().add(new EntityColumn("strSourcePath"));
		cooperation_Project1.getEntityColumnList().add(new EntityColumn("strProjectDescription"));
		cooperation_Project1.getEntityColumnList().add(new EntityColumn("strUserCode"));
		
		EntityTable cooperation_Task = new EntityTable();
		cooperation_Task.setTableName("Cooperation_Task");
		cooperation_Task.getIdColumnSet().add("strTaskCode");
		cooperation_Task.getEntityColumnList().add(new EntityColumn("strTaskCode"));
		cooperation_Task.getEntityColumnList().add(new EntityColumn("strProjectCode"));
		cooperation_Task.getEntityColumnList().add(new EntityColumn("strTaskName"));
		cooperation_Task.getEntityColumnList().add(new EntityColumn("dtCreateDate","",EntityUtils.Column_Date));
		cooperation_Task.getEntityColumnList().add(new EntityColumn("strTaskDescription"));
		cooperation_Task.getEntityColumnList().add(new EntityColumn("strUserCode"));
		
		entityTableFile.getEntityTableList().add(cooperation_Project);
		entityTableFile.getEntityTableList().add(cooperation_Project1);
		entityTableFile.getEntityTableList().add(cooperation_Task);
		
		/*
		EntityTableSqlFile entityTableSqlFile = new EntityTableSqlFile();
		
		EntityTableSql entityProjectSql = new EntityTableSql();
		entityProjectSql.setTableName("Cooperation_Project");
		EntityDatabaseSql entityProjectDatabaseSql = new EntityDatabaseSql();
		entityProjectDatabaseSql.setStrDatabaseType(EntityUtils.Database_Mysql);
		entityProjectDatabaseSql.setStrCreateSql("CREATE TABLE `Cooperation_Project` (" +
		"`strProjectCode` VARCHAR(45) NOT NULL," +
        "`strProjectName` VARCHAR(200) NOT NULL," +
        "`strSourcePath` VARCHAR(200) NOT NULL," +
        "`strProjectDescription` VARCHAR(200)," +
        "`strUserCode` VARCHAR(45) NOT NULL," +
        "PRIMARY KEY (`strProjectCode`))" +
        "ENGINE = InnoDB;");
		entityProjectDatabaseSql.setStrDropSql("DROP TABLE `Cooperation_Project`;");
		entityProjectSql.getEntityDatabaseSqlList().add(entityProjectDatabaseSql);

		EntityTableSql entityTaskSql = new EntityTableSql();
		entityTaskSql.setTableName("Cooperation_Task");
		EntityDatabaseSql entityTaskDatabaseSql = new EntityDatabaseSql();
		entityTaskDatabaseSql.setStrDatabaseType(EntityUtils.Database_Mysql);
		entityTaskDatabaseSql.setStrCreateSql("CREATE TABLE `Cooperation_Task` (" +
		"`strTaskCode` VARCHAR(45) NOT NULL," +
        "`strProjectCode` VARCHAR(45) NOT NULL," +
        "`strTaskName` VARCHAR(200) NOT NULL," +
        "`dtCreateDate` DATETIME NOT NULL," +
        "`strTaskDescription` VARCHAR(200)," +
        "`strUserCode` VARCHAR(45) NOT NULL," +
        "PRIMARY KEY (`strTaskCode`))" +
        "ENGINE = InnoDB;");
		entityTaskDatabaseSql.setStrDropSql("DROP TABLE `Cooperation_Task`;");
		entityTaskSql.getEntityDatabaseSqlList().add(entityTaskDatabaseSql);
		
		entityTableSqlFile.getEntityTableSqlList().add(entityProjectSql);
		entityTableSqlFile.getEntityTableSqlList().add(entityTaskSql);
		
		*/
		/*
		CheckRuleTableFile checkRuleTableFile = new CheckRuleTableFile();
		CheckRuleTable checkRuleTable = new CheckRuleTable();
		checkRuleTable.setTableName("Cooperation_Project");
		CheckRule checkRule1 = new CheckRule("@CHECK(@COLUMN(strProjectCode),emptyCheck)");
		CheckRule checkRule2 = new CheckRule("@CHECK(@COLUMN(strProjectName),emptyCheck)");
		CheckRule checkRule3 = new CheckRule("@CHECK(@COLUMN(strSourcePath),emptyCheck)");
		CheckRule checkRule4 = new CheckRule("@CHECK(@COLUMN(strUserCode),emptyCheck)");
		CheckRule checkRule5 = new CheckRule("@CHECK(@COLUMN(strProjectCode),byteLengthCheck~0~40)");
		CheckRule checkRule6 = new CheckRule("@CHECK(@COLUMN(strProjectName),byteLengthCheck~0~100)");
		CheckRule checkRule7 = new CheckRule("@CHECK(@COLUMN(strSourcePath),byteLengthCheck~0~100)");
		CheckRule checkRule8 = new CheckRule("@CHECK(@COLUMN(strProjectDescription),byteLengthCheck~0~100)");
		CheckRule checkRule9 = new CheckRule("@CHECK(@COLUMN(strUserCode),byteLengthCheck~0~40)");

		checkRuleTable.getCheckRuleList().add(checkRule1);
		checkRuleTable.getCheckRuleList().add(checkRule2);
		checkRuleTable.getCheckRuleList().add(checkRule3);
		checkRuleTable.getCheckRuleList().add(checkRule4);
		checkRuleTable.getCheckRuleList().add(checkRule5);
		checkRuleTable.getCheckRuleList().add(checkRule6);
		checkRuleTable.getCheckRuleList().add(checkRule7);
		checkRuleTable.getCheckRuleList().add(checkRule8);
		checkRuleTable.getCheckRuleList().add(checkRule9);

		checkRuleTableFile.getCheckRuleTableList().add(checkRuleTable);
		
		String strProjectCode = "cooperation";
		String strTaskCode = "coo_a01";

		String jsonTableString = JsonUtils.objectToString(entityTableFile);
		FileUtils.saveFile(tempPath + strProjectCode + File.separator + strTaskCode + File.separator + strTaskCode + "_" + "table.json",jsonTableString,testEncoding);
		//String jsonTableSqlString = JsonUtils.objectToString(entityTableSqlFile);
		//FileUtils.saveFile(tempPath + strProjectCode + File.separator + strTaskCode + File.separator + strTaskCode + "_" + "tablesql.json",jsonTableSqlString,testEncoding);
		String jsonTableCheckString = JsonUtils.objectToString(checkRuleTableFile);
		FileUtils.saveFile(tempPath + strProjectCode + File.separator + strTaskCode + File.separator + strTaskCode + "_" + "tablecheck.json",jsonTableCheckString,testEncoding);
		
	}
}
*/