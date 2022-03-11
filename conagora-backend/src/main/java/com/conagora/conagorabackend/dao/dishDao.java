package com.conagora.conagorabackend.dao;

import com.conagora.conagorabackend.model.Dish;

import org.springframework.data.mongodb.repository.MongoRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface dishDao extends MongoRepository<Dish, String> {

    // Object ok();

}
