package com.qa.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.qa.service.repository.iUserRepository;
import com.qa.userdata.UserData;
import com.qa.utility.JSONUtility;

public class UserService   {

	@Autowired
	private JSONUtility util;
	
	@Autowired
	private iUserRepository repo;
	

	public Iterable<UserData> getAllUsers() {
		return repo.findAll();
	}

	public UserData addUser(UserData user) {
	
		return repo.save(user);
		
	}

	public String deleteUser(int id) {
		repo.deleteById(id);
		return null;

	}


	public void setRepo(iUserRepository repo) {
		this.repo = repo;
	}

	public UserData updateUser(UserData user) {
		return repo.save(user);		
		
	}
	




}
