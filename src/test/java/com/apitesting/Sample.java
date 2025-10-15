package com.apitesting;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {
	public static void main(String[] args) throws  IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		Object object = jsonParser.parse(new FileReader("C:\\Users\\chandreshwaran\\eclipse-workspace"
				+ ".prakash\\APITesting\\src\\test\\resources\\sample.json"));
		JSONObject jsonObject= (JSONObject) object;
		System.out.println(jsonObject);
		Object mobileNo = jsonObject.get("PhoneNo");
		System.out.println(mobileNo);
		Object email = jsonObject.get("email");
		System.out.println(email);
		
	
	
	
	
	}


}
