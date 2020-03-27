package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface Product_master_repository extends CrudRepository<Product_master, String> {

}