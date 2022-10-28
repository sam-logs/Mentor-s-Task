package com.bhavna.payload;

import lombok.Data;

@Data
public class JwtAuthResponse {
	private String token;
	private UserDto user;

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
