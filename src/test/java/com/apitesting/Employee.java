package com.apitesting;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


import tools.jackson.databind.ObjectMapper;



public class Employee {
	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		EmpDetails value = mapper.readValue(new File("src\\test\\resources\\employee.json"), EmpDetails.class);
		int page = value.getPage();
		System.out.println(page);
		int per_page = value.getPer_page();
		System.out.println(per_page);
		int total = value.getTotal();
		System.out.println(total);
		int total_pages = value.getTotal_pages();
		System.out.println(total_pages);
		 ArrayList<Details> data = value.getData();
		 for (Details employee : data) {
			System.out.println(employee.getCountry());
			System.out.println(employee.getDestinations());
			System.out.println(employee.getFlightName());
			System.out.println(employee.getId());
			System.out.println(employee.getURL());
			
		}
		 Support support = value.getSupport();
		 System.out.println(support.getText());
		 System.out.println(support.getUrl());
		
		
		
		
		
	}

}
