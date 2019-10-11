package com.kp.myboot.service.impl;

import com.kp.myboot.service.MysqlBackupService;
import com.kp.myboot.utils.MySqlBackupRestoreUtils;
import org.springframework.stereotype.Service;

@Service //注意要交给spring管理
	public class MysqlBackupServiceImpl implements MysqlBackupService {

	    @Override
	    public boolean backup(String host, String userName, String password, String backupFolderPath, String fileName,
	                          String database) throws Exception {
	        return MySqlBackupRestoreUtils.backup(host, userName, password, backupFolderPath, fileName, database);
	    }

	    @Override
	    public boolean restore(String restoreFilePath, String host, String userName, String password, String database)
	            throws Exception {
	        return MySqlBackupRestoreUtils.restore(restoreFilePath, host, userName, password, database);
	    }

	}