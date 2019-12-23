package mx.com.mb3.runnergps;

import java.util.Properties;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@Configuration
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class })
public class HibernateConfig {

	@Autowired
	private Environment environment;
//
	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
		dataSource.setUrl(environment.getProperty("spring.datasource.url"));
		dataSource.setUsername(environment.getProperty("spring.datasource.username"));
		dataSource.setPassword(environment.getProperty("spring.datasource.password"));
		return dataSource;
	}
//
//	@Autowired
//	@Bean(name = "sessionFactory")
//	public SessionFactory getSessionFactory(DataSource dataSource) throws Exception {
//		Properties properties = new Properties();
//		properties.put("hibernate.dialect", environment.getProperty("spring.jpa.properties.hibernate.dialect"));
//		properties.put("current_session_context_class", environment.getProperty("spring.jpa.properties.hibernate.current_session_context_class"));
//		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
//		factoryBean.setPackagesToScan(new String[] { "mx.com.mb3" });
//		factoryBean.setDataSource(dataSource);
//		factoryBean.setHibernateProperties(properties);
//		factoryBean.afterPropertiesSet();
//		SessionFactory sessionFactory = factoryBean.getObject();
//		return sessionFactory;
//	}
//
//	@Autowired
//	@Bean(name = "transactionManager")
//	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
//		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
//		return transactionManager;
//	}

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setPackagesToScan(new String[] { "mx.com.mb3" });
		sessionFactory.setHibernateProperties(hibernateProperties());
		// factoryBean.setAnnotatedClasses(User.class, Authorities.class);

		return sessionFactory;
	}

//	@Bean
//	public DataSource dataSource() throws NamingException {
//		return (DataSource) new JndiTemplate().lookup("java:/global/production_gateway");
//	}

	private final Properties hibernateProperties() {
		final Properties hibernateProperties = new Properties();
 		hibernateProperties.setProperty("hibernate.dialect", environment.getProperty("spring.jpa.properties.hibernate.dialect"));
		hibernateProperties.setProperty("hibernate.show_sql", "true");
		hibernateProperties.setProperty("hibernate.format_sql", "true");

		return hibernateProperties;
	}
}