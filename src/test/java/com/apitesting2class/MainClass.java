package com.apitesting2class;

import java.io.File;
import java.util.ArrayList;

import tools.jackson.databind.ObjectMapper;



public class MainClass {
	public static void main(String[] args) {
		 File file = new File("C:\\Users\\chandreshwaran\\eclipse-workspace.prakash\\APITesting\\src\\test\\resources\\new.json");
		 ObjectMapper mapper= new ObjectMapper();
		
		 
		 ArrayList<Datas> data = new  ArrayList<Datas>();
		 Datas d1 = new Datas(548,"AirIndia","India","87","https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		 Datas d2 = new Datas(573, "AirIndia", "India", "54", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		 Datas d3 = new Datas(576, "AirIndia", "India", "87", "\"https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		 Datas d4 = new Datas(630, "AirIndia", "India", "67", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		 Datas d5 = new Datas(636, "Aircanda", "canada", "97", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_India");
		 Datas d6 = new Datas(655, "AirMalasiya", "Malasiya", "87", "https:\\/\\/en.wikipedia.org\\/wiki\\/Air_Malasiya");
		
		 data.add(d1);
		 data.add(d2);
		 data.add(d3);
		 data.add(d4);
		 data.add(d5);
		 data.add(d6);
		 
		
		 Support support= new Support("https:\\/\\/omrbranch.com","For Joining Automation Course, Please Contact-Velmurugan 9944152058");
		 PageNo1 pge = new PageNo1(1, 6, 17871, 2979, data, support);
		 
		 mapper.writeValue(file, pge);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
