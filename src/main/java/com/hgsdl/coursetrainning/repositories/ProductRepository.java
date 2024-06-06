package com.hgsdl.coursetrainning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgsdl.coursetrainning.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
