package com.example.service;

import java.util.List;

import com.example.model.Product;
import com.example.model.ProductDTO;

public interface ProductService {
	public List<ProductDTO> getTitleAndDescription(String category);
	public Product saveProduct(Product product);
}
