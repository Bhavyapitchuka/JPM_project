package com.tnsif.exception;
import java.util.Scanner;
public class TestDemo {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the rollno");
	int rollno=sc.nextInt();
	if(rollno<0) {
		throw new ArithmeticException("rollnumber cannot be negative");
	}
	else {
		System.out.println("valid rollnumber");
	}
	}
}
