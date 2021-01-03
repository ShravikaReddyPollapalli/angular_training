package config;

import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@PropertySource("classpath:dbconfig.properties")
@ComponentScan(basePackages = { "dao" })
public class ApplicationContextConfig {
	// Used for reading properties from a properties file
		@Autowired
		private Environment env;
		/*
		 * Bean for Datasource
		 */
		@Bean
		public DataSource getDatasource() {
			BasicDataSource dataSource = new BasicDataSource();
			dataSource.setDriverClassName(env.getProperty("driverClassName"));
			dataSource.setUrl(env.getProperty("url"));
			dataSource.setUsername(env.getProperty("dbuser"));
			dataSource.setPassword(env.getProperty("password"));
			return dataSource;
		}
		@Bean
		@Autowired
		public LocalSessionFactoryBean getSessionFactory(DataSource dataSource) throws IOException {
			LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
			sessionFactory.setDataSource(dataSource);
			Properties hibernateProperties = new Properties();
			hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
			hibernateProperties.put("hibernate.show_sql", "true");
			hibernateProperties.put("hibernate.format_sql", "true");
			hibernateProperties.put("hibernate.hbm2ddl.auto", "update");
			// create ,update, validate,none
			sessionFactory.setHibernateProperties(hibernateProperties);
			sessionFactory.setPackagesToScan("model");
			sessionFactory.afterPropertiesSet();
			return sessionFactory;
		}
		@Bean
		@Autowired
		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
			HibernateTransactionManager transactionManager = new HibernateTransactionManager();
			transactionManager.setSessionFactory(sessionFactory);
			return transactionManager;
		}
}
