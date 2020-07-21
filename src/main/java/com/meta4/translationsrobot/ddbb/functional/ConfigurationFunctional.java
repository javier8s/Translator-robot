package com.meta4.translationsrobot.ddbb.functional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "mssqlEntityManagerFactory",
        transactionManagerRef = "mssqlTransactionManager",
        basePackages = {"com.meta4.translationsrobot.ddbb.functional.repositories"}
)
public class ConfigurationFunctional {

    @Bean(name = "mssqlDataSource")
    @ConfigurationProperties(prefix = "mssql.datasource")
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.username("GLOBALHRPRO140619");
        dataSourceBuilder.password("h68iYJTx");
        DataSourceBuilder.create().build();
        return dataSourceBuilder.build();
    }

    @Bean(name = "mssqlEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    mssqlEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("mssqlDataSource") DataSource dataSource
    ) {
        return
                builder
                        .dataSource((javax.sql.DataSource) dataSource)
                        .packages("com.meta4.translationsrobot.ddbb.functional.entities")
                        .persistenceUnit("mssql")
                        .build();
    }
    @Bean(name = "mssqlTransactionManager")
    public PlatformTransactionManager mssqlTransactionManager(
            @Qualifier("mssqlEntityManagerFactory") EntityManagerFactory
                    mssqlEntityManagerFactory
    ) {
        return new JpaTransactionManager(mssqlEntityManagerFactory);
    }
}