package com.cogent.core.abstractsInterface;

class A96{
	public void m1()throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
}

class B96 extends A96{
	public void m1() throws ClassNotFoundException {
		System.out.println("m1-B");
		Class.forName("oracle.jdbc.driver.OracleDriver");

	}
}

public class Manager96 {

}
