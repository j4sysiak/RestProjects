package com.example.connectToDatabaseH2_remote_server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/product")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
