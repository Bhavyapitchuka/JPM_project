package com.tnsif.exception;

public class Test2 {
	public static void main(String[] args) {
		try {
			System.out.println(100/0);
		}
		catch(NullPointerException ez) {
			System.out.println("exception caught"+ez.getMessage());
		}
		finally {
			System.out.println("end");
		}
	}
	}

