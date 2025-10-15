package com.apitesting2class;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageNo1 {
	
	private int page;
	private int per_page;
	private int total;
	private int total_pages;
	private ArrayList<Datas> data;
	private Support support;
	
	
	

}
