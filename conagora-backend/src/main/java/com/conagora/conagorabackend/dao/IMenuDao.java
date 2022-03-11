package com.conagora.conagorabackend.dao;

import com.conagora.conagorabackend.model.Category;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface IMenuDao extends MongoRepository<Category,String> {
    
}
