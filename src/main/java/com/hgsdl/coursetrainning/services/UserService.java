package com.hgsdl.coursetrainning.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hgsdl.coursetrainning.entites.User;
import com.hgsdl.coursetrainning.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		List<User> list = repository.findAll();
		return list;
	}

	public User findById(Long id) {
		Optional<User> userById = repository.findById(id);
		return userById.get();
	}
}
