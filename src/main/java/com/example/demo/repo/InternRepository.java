package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Interns;

public interface InternRepository extends MongoRepository<Interns, String>  {

}
