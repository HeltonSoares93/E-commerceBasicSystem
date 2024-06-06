package com.hgsdl.coursetrainning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hgsdl.coursetrainning.entites.Product;
import com.hgsdl.coursetrainning.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		List<Product> listProducts = repository.findAll();
		return listProducts;
	}
	
	public Product findById(Long id) {
		Optional<Product> prodById = repository.findById(id);
		return prodById.get();
	}
}
