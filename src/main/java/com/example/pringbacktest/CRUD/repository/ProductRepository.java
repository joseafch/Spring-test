package com.example.pringbacktest.CRUD.repository;

import com.example.pringbacktest.CRUD.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<ProductEntity, Integer> {
}
