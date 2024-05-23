package com.example.demo.configuration;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoConfiguration {

    @Primary
    @Bean(name = "internDBProperties")
    @ConfigurationProperties(prefix = "spring.data.mongodb.intern")
    public MongoProperties getInternProps() throws Exception {
        return new MongoProperties();
    }

    @Bean(name = "employeeDBProperties")
    @ConfigurationProperties(prefix = "spring.data.mongodb.employee")
    public MongoProperties getemployeeProps() throws Exception {
        return new MongoProperties();
    }

    @Primary
    @Bean(name = "internMongoTemplate")
    public MongoTemplate internsMongoTemplate() throws Exception {
        return new MongoTemplate(internMongoDatabaseFactory(getInternProps()));
    }

    @Bean(name ="employeeMongoTemplate")
    public MongoTemplate employeeMongoTemplate() throws Exception {
        return new MongoTemplate(employeeMongoDatabaseFactory(getemployeeProps()));
    }

    @Primary
    @Bean
    public MongoDatabaseFactory internMongoDatabaseFactory(MongoProperties mongo) throws Exception {
        return new SimpleMongoClientDatabaseFactory(
                mongo.getUri()
        );
    }

    @Bean
    public MongoDatabaseFactory employeeMongoDatabaseFactory(MongoProperties mongo) throws Exception {
        return new SimpleMongoClientDatabaseFactory(
                mongo.getUri()
        );
    }
}

