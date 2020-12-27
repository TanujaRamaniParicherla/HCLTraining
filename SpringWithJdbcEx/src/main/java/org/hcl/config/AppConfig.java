package org.hcl.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages= {"org.hcl"})
public class AppConfig {
	@Value("${driver}")
	String driver;
	@Value("${url}")
	String url;
	@Value("${uname}")
	String username;
	@Value("${password}")
	String password;
	@Bean
	public static PropertyPlaceholderConfigurer getHolder()
	{
		 PropertyPlaceholderConfigurer prop=new PropertyPlaceholderConfigurer();
		 Resource resource=new ClassPathResource("database.properties");
		 prop.setLocation(resource);
		 return prop;
	}
	@Bean
	public DataSource getdataSource()
	{
		
		DriverManagerDataSource datasource= new DriverManagerDataSource();
		datasource.setDriverClassName(driver);
		datasource.setUrl(url);
		datasource.setUsername(username);
		datasource.setPassword(password);
		return datasource;
	}
	
	
}
