package com.cogent.core.threads;

public class Manager104 {
public static void main(String[] args) {
	for(int i = 0; i <1000; i++) {
		System.out.println("Loop 1: " + i);
		
	}
	for (int i = 1000; i < 2000; i++) {
		System.out.println("Loop 2: "+i);
		System.out.println("end loop");
	}
}
}
