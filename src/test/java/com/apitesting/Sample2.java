package com.apitesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Sample2 {
	public static void main(String[] args) {
		Sample2 sample2 = new Sample2();
		sample2.createFlight();
	}
	
	
	public void createFlight() {
		RequestSpecification rqspec;
		
		 rqspec =  RestAssured.given(); 
		 //2. 
		 rqspec = rqspec.header("Content-Type","application/json");
		 
		 //2.1
		 rqspec.body("{\r\n"
		 		+ "    \"flightName\": \"AirIndia\",\r\n"
		 		+ "    \"Country\": \"India\",\r\n"
		 		+ "    \"Destinations\": \"87\",\r\n"
		 		+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
		 		+ "}");
		 //3.
		 Response response = rqspec.post("https://omrbranch.com/api/flights");
		 //status code
		 int statusCode = response.getStatusCode();
		 System.out.println(statusCode);
		 
		 String asString = response.asString();
		 System.out.println(asString);
		 
		 String asPrettyString = response.asPrettyString();
		 System.out.println(asPrettyString);
		 
		
	}

}
