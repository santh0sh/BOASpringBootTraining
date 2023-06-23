package com.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.CartEntity;
import com.model.Product;
@Repository
public interface CartDAO extends CrudRepository<CartEntity, Long>{

}
