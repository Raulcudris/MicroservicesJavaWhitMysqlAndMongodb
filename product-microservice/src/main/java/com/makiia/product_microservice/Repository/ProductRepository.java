package com.makiia.product_microservice.Repository;

import com.makiia.product_microservice.Entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {

}
