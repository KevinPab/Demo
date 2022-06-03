package com.cogent.core.abstractsInterface;

//Method overriding rules


class A95{
	public void m1() {
		System.out.println("m1()-A");
	}
	void m2() {
		System.out.println("m2()-A");
	}
}

class B95 extends A95{
	public void m1() {
		System.out.println("m1-B");
	}
	public void m2() {
		System.out.println("m2()-B");
	}
	
}

public class Manager95 {
	

}
