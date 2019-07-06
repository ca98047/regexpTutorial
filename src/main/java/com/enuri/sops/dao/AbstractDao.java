package com.enuri.sops.dao;




import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class AbstractDao {
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public AbstractDao(){
		System.out.println("hello");
	}
	
	@PostConstruct
	public void init(){
		System.out.println(jdbcTemplate);
	}
}
