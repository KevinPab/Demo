package com.cogent.core.abstractsInterface;

interface Shape100{
	void draw();
}
class Circle100 implements Shape100{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}
class Triangle100 implements Shape100{
	@Override
	public void draw() {
		System.out.println("Triangle");
	}
}
class Rectangle100 implements Shape100{
	@Override
	public void draw() {
		System.out.println("Rectangle");
	}
}

public class Manager100 {
	void makingShape(Shape100 shape) {
		shape.draw();
	}
	public static void main(String[] args) {
		Manager100 m = new Manager100();
		m.makingShape(new Rectangle100());
	}

}
