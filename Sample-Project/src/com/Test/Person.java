package com.Test;

import java.util.Comparator;

public class Person implements Comparable<Person> {
	 String name;
	private int age;
	
	//constructors,getters,setters
	@Override
	public int hashCode() {
		
		int res = 17;
		
		res = 31 * res + (name == null ? 0 : name.hashCode());
		
		res = 31 * res + age;
		
		return res;
		
	}

	@Override
	public int compareTo(Person o) {

		return this.age-o.age;
	}
	

}

class NameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {

		return o1.name.compareTo(o2.name);
	}
	
}

