package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	
	public static void main(String[] args) {
		Map<String, String> hashMap = new LinkedHashMap<>();
		hashMap.put("Swarupa", "Java");
		hashMap.put("Naveen", "Java");
		hashMap.put("Naveen", "Java");
		hashMap.put("Pavan", "FE");
		hashMap.put("Sai", "QA");
		
		System.out.println(hashMap);
		
		Map<Student, String> studentMap = new LinkedHashMap<>();
		studentMap.put(new Student(51, "Swarupa"), "Java");
		studentMap.put(new Student(44, "Naveen"), "Java");
		studentMap.put(new Student(44, "Naveen"), "Java");
		studentMap.put(new Student(65, "Pavan"), "FE");
		studentMap.put(new Student(54, "Sai"), "QA");
		
		System.out.println(studentMap);
	}

}
