package com.sourav.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sourav.model.User;
import com.sourav.repository.UserRepository;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public void saveMyUser(User user) {
		userRepository.save(user);
	}
	
	public List<User> showAllUser() {
		List<User> userList = new ArrayList<>();
		for(User user:userRepository.findAll()) {
			userList.add(user);
		}
		return userList;
	}
	
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
	
	public User findUserById(int id) {
		return userRepository.findById(id).get();
	}
	
	public User findByUsernameAndPassword(String username,String password) {
		return 	userRepository.findByUsernameAndPassword(username, password);	
	}
}
