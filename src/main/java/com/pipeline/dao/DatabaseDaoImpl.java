package com.pipeline.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pipeline.entities.Database;

@Repository
public class DatabaseDaoImpl implements DatabaseDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DatabaseDaoImpl.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Database> getAllDatabases() {
		
		LOGGER.info("Find All databases Called !!");

		String sql = "select * from database";

		List<Database> databases = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Database>(Database.class));
		System.out.println(databases);
		return databases;
	}

}
