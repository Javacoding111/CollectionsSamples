package com.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomArrayList extends ArrayList {
	
	@Override
	public boolean add(Object o) {
		if(this.contains(o)) {
			return false;
		} 
		return super.add(o);
		
	}
	
	public static void main(String[] args) {
		//should not print duplicates with custom list
		CustomArrayList list = new CustomArrayList();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(5);
		System.out.println(list);
		
		//allows and prints duplicates with normal list
		List<Integer> arrayList = new ArrayList<>();
		arrayList.add(5);
		arrayList.add(10);
		arrayList.add(15);
		arrayList.add(10);
		System.out.println("With duplicates " +arrayList);
		
		//does not allow duplicates for primitives
		Set<String> set = new HashSet<>();
		set.add("abc");
		set.add("abc");
		set.add("abc");
		set.add("def");
		System.out.println(set);
		
		//Set with custom object and duplicates
		Set<Student>studentSet = new HashSet<>();
		Student s1 = new Student(1, "Swarupa");
		Student s2 = new Student(1, "Swarupa");
		Student s3 = new Student(2, "Paruchuri");
		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3);
		System.out.println("student object with duplicates " +studentSet);
	}

}
