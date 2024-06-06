package com.hgsdl.coursetrainning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hgsdl.coursetrainning.entites.Order;
import com.hgsdl.coursetrainning.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repoitory;

	public List<Order> findAll() {
		List<Order> listAllOrders = repoitory.findAll();
		return listAllOrders;
	}

	public Order findById(Long id) {
		Optional<Order> orderById = repoitory.findById(id);
		return orderById.get();
	}
	
	
}
