package com.openntf.watsonwherespace.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EventServiceController {

	private EventServiceController instance = null;
	
	public EventServiceController getInstance(){
		
		if(instance == null){
			instance = new EventServiceController();
		}
		
		return instance;
	}
	
	public Person getPersonByLocation(Location location){
		Person person = new Person();
			//TODO: get person
		
		return person;
	}

	public List<Person> getPeopleByLocation(Location location){
		List<Person> people = new ArrayList<Person>();
			//TODO: get people
		return people;
	}
	
	
	
}
