package com.jwn.spring.struts.beans;

public class Person
{
	private String username;
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername()
	{
		return username;
	}
	public void hello(){
		System.out.println("My name is " + username);
	}
	
}
