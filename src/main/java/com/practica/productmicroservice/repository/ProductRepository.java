package com.practica.productmicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.practica.productmicroservice.entity.ProductEntity;

public interface ProductRepository extends MongoRepository <ProductEntity, String> {

}
