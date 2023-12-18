package com.endrius.os.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.endrius.os.services.DBServices;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBServices dbService;

	
	public void instanciaDB() {
		this.dbService.instanciaDB();

	}
}
