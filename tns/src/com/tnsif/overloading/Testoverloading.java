package com.tnsif.overloading;

public class Testoverloading {
	public static void main(String [] args) {
		Addition a=new Addition();
		System.out.println(a.add(8, 3));
		System.out.println(a.add(5, 8, 9));
	}

}
