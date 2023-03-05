package com.example.testcicd.controller;

import com.example.testcicd.model.Product;
import com.example.testcicd.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @GetMapping("/test")
    public String test(){
        String test = "test4";
        return test;
    }

    @GetMapping("/getAll")
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    @PostMapping("/saveProduct")
    public Product saveProduct(@RequestBody Product product){
        return productRepository.save(product);
    }
}
