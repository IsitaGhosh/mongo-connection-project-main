package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"com.example.demo.repo"},
        mongoTemplateRef = EmployeeDbConfig.MONGO_TEMPLATE
)
public class EmployeeDbConfig {

    protected static final String MONGO_TEMPLATE = "employeeMongoTemplate";
}
