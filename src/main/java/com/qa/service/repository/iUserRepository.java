package com.qa.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.userdata.UserData;

@Repository
public interface iUserRepository extends JpaRepository<UserData, Integer>{
	
	

}
