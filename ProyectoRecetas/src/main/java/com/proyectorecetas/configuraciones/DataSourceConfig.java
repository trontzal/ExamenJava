package com.proyectorecetas.configuraciones;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataSourceConfig {
	// Me da problemas con el properties asi que lo tengo que poner aqui
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/examen");
		dataSource.setUsername("usr_recetas");
		dataSource.setPassword("contra");
		return dataSource;
	}
}