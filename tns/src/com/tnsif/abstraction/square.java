package com.tnsif.abstraction;

public abstract class square extends shape {
	private float side;
	public square() {
		side=2.0f;
	}
	public square(float side) {
		this.side=side;
	}
	@Override
	void calarea() {
		super.area=side*side;
	}
	@Override
	public String toString() {
		return "square [side=" + side + "]";
	}
	
}
