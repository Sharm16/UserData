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
	
	//private static final Logger LOGGER = Logger.getLogger(UserService.class);

	public Iterable<UserData> getAllUsers() {
		return repo.findAll();
	}

	public UserData addUser(UserData user) {
		//LOGGER.info(util.getObjectForJSON(user, UserData.class));
		//System.out.println(user);
		return repo.save(user);
		
	}

	public String deleteUser(int id) {
		repo.deleteById(id);
		return null;

	}



	public UserData test() {

		return repo.save(new UserData("Jack", "Bauer"));
	}

	public void setRepo(iUserRepository repo) {
		this.repo = repo;
	}




}
