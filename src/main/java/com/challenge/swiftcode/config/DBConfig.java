package com.challenge.swiftcode.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 
 * @author nithinemanuel
 *
 */
@Configuration
@EnableTransactionManagement
@ConfigurationProperties("spring.datasource")
public class DBConfig {

	@Value("${spring.jpa.properties.hibernate.connection.driver_class}")
	private String driver;

	private String username;
	private String password;
	private String url;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	// @Bean(name = "dataSource")
	// public DataSource dataSource() {
	// return
	// DataSourceBuilder.create().driverClassName(driver).username(username).password(password).url(url)
	// .build();
	// }

	// Need to add the feature toggle pojo's too
	@Autowired
	@Bean(name = "entityManagerFactory")
	public LocalSessionFactoryBean getEntityManagerFactory(DataSource dataSource) throws IOException {
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setPackagesToScan(new String[] { "com.challenge.swiftcode.models" });
		localSessionFactoryBean.setDataSource(dataSource);
		localSessionFactoryBean.afterPropertiesSet();
		return localSessionFactoryBean;
	}

	@Autowired
	@Bean(name = "sessionFactory")
	public SessionFactory sessionFactory(LocalSessionFactoryBean localSessionFactoryBean) {
		SessionFactory sessionFactory = localSessionFactoryBean.getObject();
		return sessionFactory;
	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getHibernateTransactionManager(SessionFactory sessionFactory) {
		return new HibernateTransactionManager(sessionFactory);
	}

}
