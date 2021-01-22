package com.practice.hashmaps;

public class Person {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	/*@Override
	public int hashCode() {
		return this.id;
	}*/
	
	@Override
	public boolean equals(Object o)
	{
		Person hd = (Person)o;
		return hd.id == id;
		
	}
			

}
