package com.cogent.core.abstractsInterface;
/*
class Square {
	void draw() {
		System.out.println("Square");
	}
}

public class Manager99 {
	public static void main(String[] args) {
		Square square = new Square();
		new Manager99().makingShape(square);
	}
	void makingShape(Square square) {
		square.draw();
	}
}
*/
class Circle99 {
	void draw() {
		System.out.println("Circle");
	}
}

public class Manager99 {
	public static void main(String[] args) {
		Circle99 circle = new Circle99();
		new Manager99().makingShape(circle);
	}
	void makingShape(Circle99 circle) {
		circle.draw();
	}
}