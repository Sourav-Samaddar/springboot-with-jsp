package com.sourav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sourav.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User findByUsernameAndPassword(String username,String password) ;
}
