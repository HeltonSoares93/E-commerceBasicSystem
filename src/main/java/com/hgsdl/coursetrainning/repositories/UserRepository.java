package com.hgsdl.coursetrainning.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hgsdl.coursetrainning.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
