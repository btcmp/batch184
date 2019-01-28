package com.xsis.training.batch184.teory;

//encapsulation -> data object
public class User {

	private String userId;
	private String username;
	private String password;
	private String sessionId;
	private String email;
	private String token;
	
	//setter via constructor using fields
	public User(String userId, String username, String password, 
							String sessionId, String email, String token){
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.sessionId = sessionId;
		this.email = email;
		this.token = token;
	}
	
	//empty constructor
	public User() {}
	
	//setter via method / function
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	//getter
	public String getUserId() {
		return this.userId;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getToken() {
		return this.token;
	}
	
	public String getSessionId() {
		return this.sessionId;
	}
}
