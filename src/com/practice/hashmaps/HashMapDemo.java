package com.practice.hashmaps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntPredicate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class HashMapDemo {

	private Map<Person,String> map = new HashMap<>();
	
	private  void createMap()	
	{
		map.put(new Person(1,"Shamini"), "Shamini is a develope");
		map.put(new Person(2,"Swathi"), "Swathi is a develope");
	}
	
	private  String getMap(int id,String name)
	{
		return map.get(new Person(id,name));
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapDemo demo = new HashMapDemo();
		demo.createMap();
		System.out.println(demo.getMap(1, "Shamini"));
		
		Person p1 = new Person(1,"Shamini");
		Person p2 = new Person(2,"Swathi");
		
		Person p3 = new Person(3,"Preethi");
		
		Person[] persons = new Person[] {p1,p2,p3};
		
		List<Person> plist = Arrays.asList(persons);
		
		
		List<Person> per = plist.stream().filter(p->p.getId()==3).
		collect(Collectors.toList());
		
		List<Person> per1 = plist.stream().sorted(Comparator.comparing(p->p.getName())).
				collect(Collectors.toList());
		
		per1.forEach(p->System.out.println(p.getName()));
		
		
		//plist.stream().filter(p->p.getId()==3).collect(Collectors.toList());
		
		// Predicate
		//System.out.println(plist.stream().anyMatch(p->p.getId()==1));
		
		//per.stream().forEach(p->System.out.println(p.getName()));
		
		Person p4=new Person(1,"Alex");
		Person p5 = new Person(1,"Alex");
		
		System.out.println(p4.equals(p5));
		
		

	}

}
