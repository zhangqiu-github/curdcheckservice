package net.zhangqiu.service.database.imps.serial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.zhangqiu.context.EnvironmentContext;
import net.zhangqiu.service.database.dao.UpdateSqlDao;
import net.zhangqiu.service.database.entity.EntityContext;
import net.zhangqiu.service.database.entity.param.EntityDataParam;
import net.zhangqiu.service.entity.result.CommonServiceResult;
import net.zhangqiu.utils.StrUtils;

@Service
public class JsonDataDeleteAllService extends EntityDataTemplateService{

	@Autowired
	EnvironmentContext environmentContext;
	@Autowired
	UpdateSqlDao updateSqlDao;
	@Autowired
	EntityContext entityContext;

	@Override
	public CommonServiceResult logicService(String strProjectCode,String datasourceName,EntityDataParam entityData) {
		CommonServiceResult commonServiceResult = new CommonServiceResult();
		String sql = entityContext.getEntityTableDeleteAllSql(strProjectCode,datasourceName,entityData);
		if(StrUtils.isEmpty(sql)){
			String key = entityContext.getEntityTableKey(strProjectCode,datasourceName, entityData.getTableName());
			commonServiceResult.setSuccess(false);
			commonServiceResult.setMessage("表名Key（"+key+"）不存在，请确认是否在*_table.json文件中定义，区分大小写");
			return commonServiceResult;
		}
		updateSqlDao.updateSql(strProjectCode,datasourceName, sql);
		commonServiceResult.setSuccess(true);
		commonServiceResult.setMessage("success");
		return commonServiceResult;
	}

}
