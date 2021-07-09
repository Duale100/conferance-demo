package com.pluralsight.conferancedemo.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {
    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:mysql://${MYSQL_HOST:localhost}:3306/conference_demo");
        System.out.println("My custom datasoruce bean has been initialized and seen.");
        return builder.build();
    }
}
