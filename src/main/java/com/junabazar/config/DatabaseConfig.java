package com.junabazar.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by ashishm on 11/13/16.
 */
@Configuration
public class DatabaseConfig {
    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    private DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
