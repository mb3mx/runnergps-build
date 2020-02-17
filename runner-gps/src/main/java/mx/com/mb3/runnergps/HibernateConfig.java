package mx.com.mb3.runnergps;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class })
@EnableTransactionManagement
public class HibernateConfig {
	
	@Value("${spring.datasource.driver-class-name}")
	private String DB_DRIVER;

	@Value("${spring.datasource.password}")
	private String DB_PASSWORD;

	@Value("${spring.datasource.url}")
	private String DB_URL;

	@Value("${spring.datasource.username}")
	private String DB_USERNAME;

	@Value("${spring.jpa.properties.hibernate.dialect}")
	private String HIBERNATE_DIALECT;

	@Value("${spring.jpa.show-sql}")
	private String HIBERNATE_SHOW_SQL;

	@Value("${hibernate.hbm2ddl.auto}")
	private String HIBERNATE_HBM2DDL_AUTO;
	
	@Value("${entitymanager.packagesToScan}")
	private String ENTITYMANAGER_PACKAGES_TO_SCAN;

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", HIBERNATE_DIALECT);
		hibernateProperties.put("hibernate.show_sql", HIBERNATE_SHOW_SQL);
//		hibernateProperties.put("hibernate.hbm2ddl.auto", HIBERNATE_HBM2DDL_AUTO);
		sessionFactory.setHibernateProperties(hibernateProperties);
		return sessionFactory;
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(DB_DRIVER);
		dataSource.setUrl(DB_URL);
		dataSource.setUsername(DB_USERNAME);
		dataSource.setPassword(DB_PASSWORD);
		return dataSource;
	}

	@Bean
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory().getObject());
		return txManager;
	}

//	@Autowired
//	private Environment environment;
//
//	@Bean(name = "dataSource")
//	public DataSource getDataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName(environment.getProperty("spring.datasource.driver-class-name"));
//		dataSource.setUrl(environment.getProperty("spring.datasource.url"));
//		dataSource.setUsername(environment.getProperty("spring.datasource.username"));
//		dataSource.setPassword(environment.getProperty("spring.datasource.password"));
//		return dataSource;
//	}
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

//	@Bean
//    public HibernateTransactionManager transactionManager() {
//        HibernateTransactionManager txManager = new HibernateTransactionManager();
//        txManager.setSessionFactory(sessionFactory().getObject());
//        return txManager;
//    }
//
//	@Bean
//	public LocalSessionFactoryBean getSessionFactory() {
//		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();

//		sessionFactory.setDataSource(getDataSource());
//		sessionFactory.setPackagesToScan(new String[] { "mx.com.mb3" });
//		sessionFactory.setHibernateProperties(hibernateProperties());
	// factoryBean.setAnnotatedClasses(User.class, Authorities.class);

//		return sessionFactory;
//	}

//	@Bean
//	public DataSource dataSource() throws NamingException {
//		return (DataSource) new JndiTemplate().lookup("java:/global/production_gateway");
//	}

//	private final Properties hibernateProperties() {
//		final Properties hibernateProperties = new Properties();
// 		hibernateProperties.setProperty("hibernate.dialect", environment.getProperty("spring.jpa.properties.hibernate.dialect"));
//		hibernateProperties.setProperty("hibernate.show_sql", "true");
//		hibernateProperties.setProperty("hibernate.format_sql", "true");
//
//		return hibernateProperties;
//	}
}