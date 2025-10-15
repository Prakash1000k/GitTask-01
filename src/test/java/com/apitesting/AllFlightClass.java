package com.apitesting;

import io.restassured.response.Response;

public class AllFlightClass extends FlightBaseClass {
	public static void main(String[] args) {
		AllFlightClass run = new AllFlightClass();
		run.listFlight();
		run.createFlight();
		run.singleFlight();
		run.updateFlight();
		run.patchUpdateFlight();
		run.deleteFlight();
		
		
	}
	public void listFlight() {
		initRestAssured();
		addHeader("content-type", "application/json");
		Response response2 = getResponse("GET", "https://omrbranch.com/api/flights?page=1");
		printResponse(response2);
		
	}
		
	public void singleFlight() {
		initRestAssured();
		addHeader("content-type", "application/json");
		Response response2 = getResponse("GET", "https://omrbranch.com/api/flight/55394");
		printResponse(response2);
		
	}
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
		public void updateFlight() {
			initRestAssured();
			addHeader("content-type", "application/json");
			addPayLoad("{\r\n"
					+ "    \"flightName\": \"AirIndia\",\r\n"
					+ "    \"Country\": \"India\",\r\n"
					+ "    \"Destinations\": 21,\r\n"
					+ "    \"URL\": \"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India\"\r\n"
					+ "}");
			
			Response response2 = getResponse("PUT", "https://omrbranch.com/api/flight/55394");
			printResponse(response2);
			
		}
	public void patchUpdateFlight() {
		initRestAssured();
		addHeader("content-type", "application/json");
		addPayLoad("{\r\n"
				+ "    \"Destinations\": 12\r\n"
				+ "}");
		
		Response response2 = getResponse("PATCH", "https://omrbranch.com/api/flight/55394");
		printResponse(response2);
		
	}
	
	public void deleteFlight() {
		initRestAssured();
		addHeader("content-type", "application/json");
		Response response2 = getResponse("DELETE", "https://omrbranch.com/api/flight/55394");
		printResponse(response2);
		
	}
		
		

}
