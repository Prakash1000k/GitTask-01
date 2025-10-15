package com.apitesting;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FlightBaseClass {
	RequestSpecification reqspec;
	Response response;
	
	public void initRestAssured() {
		 reqspec = RestAssured.given();		
	}
	public  void addHeader(String key, String value) {
		 reqspec = reqspec.header(key, value);
	}
	public void addPayLoad(String body) {
		 reqspec = reqspec.body(body);
		
	}
	public Response getResponse(String type, String endpoint) {
		switch (type) {
		case "GET":
			 response = reqspec.get(endpoint);
			break;
		case "POST":
			 response = reqspec.post(endpoint);
			 break;
		case "PUT":
			 response = reqspec.put(endpoint);
			 break;
		case "PATCH":
			 response = reqspec.patch(endpoint);
			 break;
		case "DELETE":
			 response = reqspec.delete(endpoint);
			 break;
			 
		default:
			break;
		}
		return response;
	}
	public int getStatusCode(Response response) {
		int statusCode = response.getStatusCode();
		return statusCode;
		
	}
	public String getResBodyAsString(Response response) {
		String asString = response.asString();
		return asString;
		
	}
	public String  getResBodyAsPrettyString(Response response) {
		String asPrettyString = response.asPrettyString();
		return asPrettyString;
		
	}
	public void printResponse(Response response) {
		int statusCode = getStatusCode(response);
		System.out.println("Status Code:"+ statusCode);
		String resBodyAsPrettyString = getResBodyAsPrettyString(response);
		System.out.println("Response Body:" + resBodyAsPrettyString);
		
	}


}
