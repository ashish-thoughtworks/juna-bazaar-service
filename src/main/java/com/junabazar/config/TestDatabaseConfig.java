package com.junabazar.config;


import org.hsqldb.jdbc.JDBCDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;

/**
 * Created by dharihar on 15/11/2016.
 */
@Configuration
@Profile("service-test")
public class TestDatabaseConfig {

    @Value("classpath:schema.sql")
    private Resource SCHEMA_SCRIPT;

    @Value("classpath:city_data.sql")
    private Resource CITY_DATA_SCRIPT;

    @Value("classpath:user_data.sql")
    private Resource USER_DATA_SCRIPT;

    @Bean
    public DataSourceInitializer dataSourceInitializer() throws Exception {
        final DataSourceInitializer initializer = new DataSourceInitializer();
        initializer.setDataSource(createH2DataSource());
        initializer.setDatabasePopulator(databasePopulator());
        return initializer;
    }


    private DatabasePopulator databasePopulator() {
        final ResourceDatabasePopulator populator = new ResourceDatabasePopulator();
        populator.addScript(SCHEMA_SCRIPT);
        populator.addScripts(CITY_DATA_SCRIPT, USER_DATA_SCRIPT);
        return populator;
    }

    private DataSource createH2DataSource() {
        String jdbcUrl = "jdbc:hsqldb:mem:testdb";
        JDBCDataSource ds = new JDBCDataSource();
        ds.setURL(jdbcUrl);
        ds.setUser("sa");
        ds.setPassword("");

        return ds;
    }
}
