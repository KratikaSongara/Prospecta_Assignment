package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{
	@Query("from Product where category like %?1%")
	public List<Product> getProductByCategory(String category);
}
