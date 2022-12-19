package com.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();
		hashSet.add("abc");
		hashSet.add("uytu");
		hashSet.add("abc");
		hashSet.add("dsa");
		hashSet.add("hhdw");
		hashSet.add(null);
		
		System.out.println(hashSet);
		
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(new Student(51, "Swarupa"));
		studentSet.add(new Student(51, "Swarupa"));
		studentSet.add(new Student(62, "Paruchuri"));
		studentSet.add(new Student(32, "Raj"));
		studentSet.add(new Student(42, "Krishna"));
		
		System.out.println(studentSet);
		
	}

}
