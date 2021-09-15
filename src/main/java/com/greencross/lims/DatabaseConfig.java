package com.greencross.lims;


import java.util.Properties;
import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories (
		basePackages = "com.greencross.lims.server.repository"
)
public class DatabaseConfig {
	private static final String ENV_JPA_GENERATE_DDL = "spring.datasource.jpa.generate-ddl";
	private static final String ENV_JPA_SHOW_SQL = "spring.datasource.jpa.show-sql";
	private final Environment env;

	public DatabaseConfig(Environment env) {
		this.env = env;
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource getDataSource() {
		return DataSourceBuilder.create().build();
	}

	private Properties jpaProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.hbm2ddl.auto", env.getProperty(ENV_JPA_GENERATE_DDL));
		properties.put("hibernate.show_sql", env.getProperty(ENV_JPA_SHOW_SQL));
		properties.put("hibernate.jdbc.lob.non_contextual_creation", true);
		return properties;
	}

	@Bean(name="entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean getFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(getDataSource());
		em.setPackagesToScan("com.greencross.lims.server.entity");
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(jpaProperties());
		return em;
	}
}
