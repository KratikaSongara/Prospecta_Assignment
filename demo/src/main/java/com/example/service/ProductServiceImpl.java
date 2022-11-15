package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.model.ProductDTO;
import com.example.repository.ProductDao;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao pdao;
	
	@Override
	public List<ProductDTO> getTitleAndDescription(String category) {
		List<Product> list = pdao.getProductByCategory(category);
		List<ProductDTO> pdto = new ArrayList<>();
		for(Product p : list) {
			pdto.add(new ProductDTO(p.getDescription(),p.getTitle()));
		}
		return pdto;
	}

	@Override
	public Product saveProduct(Product product) {
		Product savedProduct = pdao.save(product);
		return savedProduct;
	}

}
