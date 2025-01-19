package com.nk.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nk.main.model.User;
import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String email);
}
