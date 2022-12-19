package com.test;

import java.util.ArrayList;
import java.util.List;

public class MakingListAsFinal {
	public static void main(String[] args) {
		final List<String> data = new ArrayList<>();
		data.add("a");
		data.add("b");
		System.out.println(data);
//		final int i = 3;
//		i=5;
	}

}
