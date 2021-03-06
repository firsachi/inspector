package ua.kiev.inspector.configurations;


import java.beans.PropertyVetoException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableTransactionManagement
public class HibernateConfiguration {
	
	@Bean
	public LazyConnectionDataSourceProxy dataSource(){
		LazyConnectionDataSourceProxy dataSource = new LazyConnectionDataSourceProxy(templateDataSource());
		return dataSource;
	}

	@Bean
	public ComboPooledDataSource templateDataSource(){
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		try {
			dataSource.setDriverClass("com.mysql.jdbc.Driver");
			dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/inspector");
			dataSource.setUser("root");
			dataSource.setPassword("Alex1q2w#E");
			dataSource.setMaxPoolSize(10);
			dataSource.setMinPoolSize(2);
			dataSource.setIdleConnectionTestPeriod(3600);
		} catch (PropertyVetoException e) {
			e.printStackTrace();
		}
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory(){
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[]{"ua.kiev.inspector.repository.entity"});
		Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.default_shema", "public");
        properties.put("hibernate.c3p0.timeout", 300);
        properties.put("hibernate.transaction.factory_class", "org.hibernate.transaction.JDBCTransactionFactory");
        properties.put("hibernate.enable_lazy_load_no_trans", true);
		sessionFactory.setHibernateProperties(properties);
		return sessionFactory;
	}
	
	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
	      HibernateTransactionManager txManager = new HibernateTransactionManager();
	      txManager.setSessionFactory(sessionFactory);
	      return txManager;
	   }
	
}
