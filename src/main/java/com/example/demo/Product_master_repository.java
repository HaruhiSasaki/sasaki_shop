package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Product_master;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface Product_master_repository extends CrudRepository<Product_master, String> {

}