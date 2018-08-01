package com.qa.userdata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdata")
public class UserData {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	@Column (name = "username")
	private String username;
	@Column (name = "firstname")
	private String firstName;
	@Column (name = "lastname")
	private String lastName;
	@Column (name = "password")
	private String password;
	@Column (name = "email")
	private String email;
	@Column (name = "totalquestions")
	private int totalQuestions;
	@Column (name = "correctquestions")
	private int correctQuestions;
	@Column (name = "level")
	private int level;
	@Column (name = "exp")
	private int exp;
	@Column (name = "pictureurl")
	private String pictureUrl;

	

	public UserData(String username, String firstName, String lastName, String password, String email,
			int totalQuestions, int correctQuestions, int level, int exp, String pictureUrl) {
		
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.totalQuestions = totalQuestions;
		this.correctQuestions = correctQuestions;
		this.level = level;
		this.exp = exp;
		this.pictureUrl = pictureUrl;
	}
	
	public UserData() {
		
	}
	public UserData(String username, String password) {
		this.username = username;
		this.password = password;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getUsername() {
		return username;
	}

	public int getTotalQuestions() {
		return totalQuestions;
	}

	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}

	public int getCorrectQuestions() {
		return correctQuestions;
	}

	public void setCorrectQuestions(int correctQuestions) {
		this.correctQuestions = correctQuestions;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

}
