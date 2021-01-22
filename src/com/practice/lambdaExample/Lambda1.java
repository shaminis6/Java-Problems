package com.practice.lambdaExample;

import java.util.Comparator;

public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<String> stringComparator = new Comparator<String>() {
			public int compare(String o1,String o2) {
				return o1.compareTo(o2);
			}
			
		};
		
		int compare = stringComparator.compare("hello", "hello");
		System.out.println(compare);
		
		// using lambda
		
		Comparator<String> stringComparator1 = (String o1,String o2)->
					{ return o1.compareTo(o2);};
					
		// Simplified version
		Comparator<String> stringComparator2 = (o1,o2)->
					o1.compareTo(o2);		
		System.out.println(stringComparator2.compare("hello", "world"));

	}

}
