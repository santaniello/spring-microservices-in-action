package com.thoughtmechanix.licenses.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class PostgreConfig {
    @Value("${spring.jpa.database}")
    private String database;
}
