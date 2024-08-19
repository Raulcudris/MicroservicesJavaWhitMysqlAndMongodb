package com.makiia.product_microservice.controller;

import com.makiia.product_microservice.Entity.ProductEntity;
import com.makiia.product_microservice.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("getAll")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void cerateProduct(@RequestBody ProductEntity productEntity){
         productRepository.save(productEntity);
    }

}
