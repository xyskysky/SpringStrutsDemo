package com.jwn.spring.struts.action;

import com.jwn.spring.struts.service.PersonService;

public class PersonAction
{
	private PersonService personService;
	
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	public String execute(){
		System.out.println("execute....");
		personService.save();
		return "success";
	}
}
