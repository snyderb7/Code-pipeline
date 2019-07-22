package com.pipeline.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pipeline.dao.DatabaseDao;
import com.pipeline.entities.Database;

@Service
public class DatabaseServiceImpl implements DatabaseService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseServiceImpl.class);

	@Autowired
	DatabaseDao databaseDao;

	@Override
	public List<Database> findAllDatabases() {
		LOGGER.info("Find All Database Service Called !!");
		return databaseDao.getAllDatabases();
	}

}
