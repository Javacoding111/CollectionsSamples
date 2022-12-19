package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<String> hashSet = new TreeSet<>();
		hashSet.add("abc");
		hashSet.add("uytu");
		hashSet.add("dsa");
		hashSet.add("hhdw");

		// hashSet.add(null); does not allow
		System.out.println(hashSet);
		
		Set<String> descSet = new TreeSet<>(Collections.reverseOrder());
		descSet.add("abc");
		descSet.add("uytu");
		descSet.add("dsa");
		descSet.add("hhdw");
		
		System.out.println(descSet);

		Set<Student> studentSet = new TreeSet<>();
		studentSet.add(new Student(51, "Swarupa"));
		studentSet.add(new Student(62, "Paruchuri"));
		studentSet.add(new Student(32, "Raj"));
		studentSet.add(new Student(42, "Krishna"));

		System.out.println(studentSet);

	}

}
