package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastCollections {
	public static void main(String[] args) {
		
		//Fail fast
//		List<String> list = new ArrayList<>();
//		list.add("abc");
//		list.add("def");
//		Iterator<String> itr = list.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			list.add("ghi");
//		}
		
		//Fail Safe
		List<String> list = new CopyOnWriteArrayList();
		list.add("abc");
		list.add("def");
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			list.add("ghi");
		}
	}

}
