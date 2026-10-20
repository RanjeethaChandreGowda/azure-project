package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Testing {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> countryCodes = new HashMap<Integer,String>();
		countryCodes.put(01, "India");
		countryCodes.put(02, "Singapore");
		countryCodes.put(03, "US");
		countryCodes.put(04, "US");
		
		countryCodes.values().stream().distinct().collect(Collectors.toList()).forEach(x->System.out.println(x));
		countryCodes.values().stream().distinct().forEach(x->System.out.println(x));
		/*List<String> values= new ArrayList<String>();
		values.add(countryCodes.get(01));
		values.add(countryCodes.get(02));
		values.add(countryCodes.get(03));*/
	//this is exception.This is error.This is runtimeerror : give me java program to split the string which has . and after . next string should print in next line	
	String str = "this is exception.This is error.This is runtimeerror";
	String[] values = str.split("\\.");
	for(String ss : values) {
		System.out.println(ss.trim());
	}
	
	
	
		
		
		
		
		
		
	//countryCodes.values().stream().distinct().collect(Collectors.toList()).forEach(x->System.out.println(x));
		
	}

}
