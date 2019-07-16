package com.sample.demo.repository;

import com.sample.demo.model.Customer;
import org.apache.catalina.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {

}
