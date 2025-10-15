package com.apitesting;

import io.restassured.response.Response;

public class ClassJsonPath extends FlightBaseClass {
	public void createFlight() {
		initRestAssured();
		addHeader("content-type", "application/json");
		addPayLoad("{\r\n"
				+ "    \"flightName\": \"AirIndia\",\r\n"
				+ "    \"Country\": \"India\",\r\n"
				+ "    \"Destinations\": \"87\",\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
				+ "}");
		Response response2 = getResponse("POST", "https://omrbranch.com/api/flights");
		printResponse(response2);
		
	}
	
	public void singleFlight() {
		initRestAssured();
		addHeader("content-type", "application/json");
		Response response = getResponse("GET", "https://omrbranch.com/api/flight/55740");
		printResponse(response);
		
	}
	public void updateFlight() {
		initRestAssured();
		addHeader("content-Type", "application/json");
		addPayLoad("{\r\n"
				+ "    \"flightName\": \"AirIndia\",\r\n"
				+ "    \"Country\": \"India\",\r\n"
				+ "    \"Destinations\": 30,\r\n"
				+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
				+ "}");
		
		Response response = getResponse("PUT", "https://omrbranch.com/api/flight/55740");
		printResponse(response);
		
		
	}
	public void updateFlight1() {
		initRestAssured();
		addHeader("content-type", "application/json");
		addPayLoad("{\r\n"
				+ "    \"Destinations\": 66\r\n"
				+ "}\r\n"
				+ "");
		
			Response response = getResponse("PATCH", "https://omrbranch.com/api/flight/55740");
		printResponse(response);
		
	}
	public void deleteFlight() {
		initRestAssured();
		addHeader("content-type", "application/josn");
		Response response = getResponse("DELETE", "https://omrbranch.com/api/flight/55740");
		printResponse(response);
		
		
	}
	public void listFlight() {
		initRestAssured();
		addHeader("content-type", "application/json");
		Response response = getResponse("GET", "https://omrbranch.com/api/flights?page=1");
		Object object = response.jsonPath().get("data[1].id");
		System.out.println(object);
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ClassJsonPath classJsonPath = new ClassJsonPath();
		classJsonPath.createFlight();
		classJsonPath.singleFlight();
		classJsonPath.updateFlight();
		classJsonPath.updateFlight1();
		classJsonPath.deleteFlight();
		classJsonPath.listFlight();
		
	}

}
