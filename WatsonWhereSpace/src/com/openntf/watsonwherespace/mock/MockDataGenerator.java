package com.openntf.watsonwherespace.mock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.openntf.watsonwherespace.model.Event;
import com.openntf.watsonwherespace.model.Location;
import com.openntf.watsonwherespace.model.Person;

public class MockDataGenerator {
    private static int nextPersonId = 1;
    private static int nextEventtId = 1;
    
    private static final Random random = new Random(1);
    
    private static final List<Person> people = null;
    private static final List<Location> locations = null;
    private static final List<Event> events = null;
    
    public MockDataGenerator(){
    	
    }
    
    public static void run(){
    	createLocations();
    	createPeople();
    	createEvents();
    }
    
    private static void createPeople() {
        Person person = new Person();
        person.setDepartment("Development");
        person.setEmail("graham.acres@brytek.ca");
        person.setFirstName("Graham");
        person.setLastName("Acres");
        person.setId("1");
        person.setMobilePhoneNumber("(604) 916-7526");

        people.add(person);
        
        person = new Person();
        person.setDepartment("Development");
        person.setEmail("betty.robinson@brytek.ca");
        person.setFirstName("Betty");
        person.setLastName("Robinson");
        person.setId("20");
        person.setMobilePhoneNumber("(604) 916-7526");

        people.add(person);
        
        person = new Person();
        person.setDepartment("Development");
        person.setEmail("kgodbold@canalbarge.com");
        person.setFirstName("Kerry");
        person.setLastName("Godbold");
        person.setId("2");
        person.setMobilePhoneNumber("(504) 669 4391");

        people.add(person);
        
        person = new Person();
        person.setDepartment("Development");
        person.setEmail("slohja@hotmail.com");
        person.setFirstName("Slobodan");
        person.setLastName("Lohja");
        person.setId("3");
        person.setMobilePhoneNumber("(773) 297 8756");
        
        people.add(person);
        
        person = new Person();
        person.setDepartment("Development");
        person.setEmail("pwithers@intect.co.uk");
        person.setFirstName("Paul");
        person.setLastName("Withers");
        person.setId("4");
        person.setMobilePhoneNumber("+44 774 904 6270");

        people.add(person);
        
        person = new Person();
        person.setDepartment("Development");
        person.setEmail("flinden68@elstarit.nl");
        person.setFirstName("Frank");
        person.setLastName("Linden");
        person.setId("5");
        person.setMobilePhoneNumber("+31 63 739 4111");
    }
    
    private static void createLocations(){
    	Location location = new Location();
    	location.setId("540");
    	location.setLabel("IBM Hackathon");
    	location.setLatitude(51.5033640);
    	location.setLongitude(-0.1276250);
    	
    	locations.add(location);
    	
    	location = new Location();
    	location.setId("560");
    	location.setLabel("Canal Barge Company");
    	location.setLatitude(0);
    	location.setLatitude(0);
    	
    	locations.add(location);
    	
    	location = new Location();
    	location.setId("570");
    	location.setLabel("ElstarIt");
    	location.setLatitude(0);
    	location.setLatitude(0);
    	
    	locations.add(location);
    	
    	location = new Location();
    	location.setId("580");
    	location.setLabel("Intect");
    	location.setLatitude(0);
    	location.setLatitude(0);
    	
    	locations.add(location);
    	
    	location = new Location();
    	location.setId("590");
    	location.setLabel("Brytec");
    	location.setLatitude(0);
    	location.setLatitude(0);
    }

    private static void createEvents() {
        Event event = new Event();
        Date date = new Date();
        List<Date> range = new ArrayList<Date>();
        range.add(date);
        int counter = 0;
        
        for(Iterator<Person> i = people.iterator(); i.hasNext(); ) {
            Person person = i.next();
            Event currentEvent = new Event();
            currentEvent.setPerson_ID(person.getId());
            currentEvent.setLocation_ID("540");
            currentEvent.setDates(range);
            currentEvent.setEvent_ID("400-" + counter++);
        }
        
        
    }

    

}
