package com.apitesting;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SingleFlight {
	public static void main(String[] args) throws  IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		Object object = jsonParser.parse(new FileReader("C:\\Users\\chandreshwaran\\eclipse-workspace.prakash\\APITesting"
				+ "\\src\\test\\resources\\SingleFlight.json"));
		JSONObject jsonObject =(JSONObject) object; 
		System.out.println(jsonObject);
		Object data = jsonObject.get("data");
		JSONObject jsonObject2 = (JSONObject)data;
		Object flightName = jsonObject2.get("flightName");
		System.out.println(flightName);
		Object support = jsonObject.get("support");
		JSONObject jsonObject3 = (JSONObject) support;
		Object text = jsonObject3.get("text");
		System.out.println(text);
		
		
		
		
	}

}
