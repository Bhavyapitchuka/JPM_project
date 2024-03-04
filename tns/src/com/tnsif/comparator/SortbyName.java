package com.tnsif.comparator;
import java.util.comparator;
public class SortbyName implements Comparable<Student> {

	public int compareTo(Student a1, Student a2) {
		
		return a1.name.compareTo(a2.name);
	}

	
}
