package com.aiwolves.webapp.dtos;

import java.util.Date;

public class LoginUserDto {
    private String username;
    
    private String password;
    private Date createdAt;
    private Date lastupdate;
	public String getUsername() {
		return username;
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

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getLastupdate() {
		return lastupdate;
	}
    
}