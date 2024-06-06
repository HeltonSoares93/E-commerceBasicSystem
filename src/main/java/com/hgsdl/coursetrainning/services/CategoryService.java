package com.hgsdl.coursetrainning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hgsdl.coursetrainning.entites.Category;
import com.hgsdl.coursetrainning.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		List<Category> listCat = repository.findAll();
		return listCat;
	}

	public Category findById(Long id) {
		Optional<Category> catById = repository.findById(id);
		return catById.get();
	}
	
	
}
