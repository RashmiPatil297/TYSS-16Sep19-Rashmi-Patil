package com.tyss.stockmanagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
@Configuration
public class ProductConfig {
	@Bean
	public LocalEntityManagerFactoryBean getBean() {
		LocalEntityManagerFactoryBean bean = new LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("product");
		return bean;
	}

}
