package com.bootcoding.restaurant.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@Getter
public class ApplicationConfig {

    @Value("${application.mode}")
    private String appMode;

    @Value("${restaurant.datasource.username}")
    private String dbUsername;

    @Bean
    @ConfigurationProperties(prefix = "restaurant.datasource")
    public DataSource restaurantDataSource() {
        return DataSourceBuilder.create().build();
    }
}
