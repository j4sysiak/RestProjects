package com.example.connectToDatabaseH2_remote_server;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends /*CrudRepository*/ JpaRepository<Product, Long> {

    Product findByName(String name);

}
