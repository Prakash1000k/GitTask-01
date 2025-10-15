package com.apitesting;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ListFlight {
	public static void main(String[] args) throws  IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		Object object = jsonParser.parse(new FileReader("C:\\Users\\chandreshwaran\\eclipse-workspace.prakash\\APITesting\\src\\test\\resources\\ListFlight.json"));
		
		JSONObject jsonObject = (JSONObject) object;
		Object page = jsonObject.get("page");
		System.out.println("page no :" + page);
		Object data = jsonObject.get("data");
		JSONArray array = (JSONArray) data;
		for (int i = 0; i < array.size(); i++) {
			Object object2 = array.get(i);
			JSONObject jsonObject2 = (JSONObject) object2;
			Object object3 = jsonObject2.get("id");
			System.out.println("ID : " + object3);
			Object object4 = jsonObject2.get("flightName");
			System.out.println(" Flight Name :" + object4);
			Object object5 = jsonObject2.get("Country");
			System.out.println(" Country :" + object5);
			Object object6 = jsonObject2.get("Destinations");
			System.out.println(" Destinatiopn :" + object6);
			Object object7 = jsonObject2.get("URL");
			System.out.println("Url :" + object7);
			
			}
	
	Object object2 = jsonObject.get("support");
	JSONObject jsonObject2 = (JSONObject) object2;
	
	Object object3 = jsonObject2.get("url");
	System.out.println(" support Url :" + object3);
	Object object4 = jsonObject2.get("text");
	System.out.println("Support Text :" + object4);
	
	System.out.println("-----------------------------page 1 end-----------------------------------");
	
	
	
	Object object5 = jsonParser.parse(new FileReader("C:\\Users\\chandreshwaran\\eclipse-workspace.prakash\\APITesting\\src\\test\\resources\\ListFlight2.json"));
	JSONObject jsonObject3 = (JSONObject) object5;
	Object page2 = jsonObject3.get("page");
	System.out.println("Page No :" + page2);
	Object per_page = jsonObject3.get("per_page");
	System.out.println(per_page);
	Object total = jsonObject3.get("total");
	System.out.println(total);
	Object total_page = jsonObject3.get("total_pages");
	System.out.println(total_page);
	Object data2 = jsonObject3.get("data");
	JSONArray array2 = (JSONArray) data2;
	for (int i = 0; i < array2.size(); i++) {
		Object object6 = array2.get(i);
		JSONObject jsonObject4 = (JSONObject) object6;
		Object object7 = jsonObject4.get("id");
		System.out.println("ID :" + object7);
		Object object8 = jsonObject4.get("flightName");
		System.out.println("Flight Name :" +object8);
		Object object9 = jsonObject4.get("Country");
		System.out.println("Country :" + object9);
		Object object10 = jsonObject4.get("Destinations");
		System.out.println("Destination:" + object10);
		Object object11 = jsonObject4.get("URL");
		System.out.println("Url :" + object11);
		
		
	}
	Object support = jsonObject3.get("support");
	JSONObject jsonObject4 = (JSONObject) support;
	Object object6 = jsonObject4.get("url");
	System.out.println(" Support Url :" + object6);
	Object object7 = jsonObject4.get("text");
	System.out.println(" Support Text :" + object7);
	System.out.println("-------------------------------page 2 end---------------------------------");
	
		
		
		
		
		
		
		
	}
	

}
