package com.example.connectToDatabaseH2.controller;

import com.example.connectToDatabaseH2.entity.Product;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    private JdbcTemplate jdbcTemplate;

    @GetMapping("/product")
    public List<Product> listAll() {
        String sql = "SELECT * FROM tbl_product2";
        return  jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Product.class));
    }
}
