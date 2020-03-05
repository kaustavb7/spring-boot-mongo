package com.training.coder.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.training.coder.document.Users;


@Repository
public interface UserRepository extends MongoRepository<Users, Integer> {

}
