package com.tnsif.abstraction;

public abstract class shape {

	protected float area;
	
	abstract void calarea();
	void show() {
		System.out.println("area of a shape"+area);
	}
}
