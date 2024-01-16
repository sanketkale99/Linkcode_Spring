package com.spring.service;

import java.util.List;

import com.spring.model.Product;

public interface ProductService {

	 public List<Product> getAllProducts();
	 public Product getProductById(int id);
	 public Product saveProduct(Product product);
	 void deleteProduct(int id);
}
