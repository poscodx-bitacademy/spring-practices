package com.poscodx.container.user;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String name = "둘리";
	
	public String getName() {
		return name;
	}
}
