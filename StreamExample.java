package com.java8features;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> names=new ArrayList<String>();
		names.add("Ajit");
		names.add("Nita");
		names.add("aswathy");
		names.add("aditya");
		names.add("steve");
		long count=names.stream().filter(str->str.length()<6).count();
		System.out.println("There are "+count+" strings with length less than 6");
	}

}
