package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortComparable {
	
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(103, "Swarupa"));
		studentList.add(new Student(123, "Swapna"));
		studentList.add(new Student(98, "Swathi"));
		
//		Collections.sort(studentList);
		System.out.println(studentList);
	}

}
