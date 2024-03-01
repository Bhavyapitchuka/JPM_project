package com.tnsif.exception;

import java.io.IOException;

public class Test3 {
public static void main(String[] args) {
	ThrowsDemo t=new ThrowsDemo();
	try {
		t.display();
	}catch(IOException e) {
		System.out.println(e);
	}
}
}
