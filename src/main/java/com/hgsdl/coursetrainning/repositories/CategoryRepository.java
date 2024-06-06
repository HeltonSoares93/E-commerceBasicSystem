package com.hgsdl.coursetrainning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgsdl.coursetrainning.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
