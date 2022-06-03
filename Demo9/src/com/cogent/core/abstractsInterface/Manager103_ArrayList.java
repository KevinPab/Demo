package com.cogent.core.abstractsInterface;

import java.util.ArrayList;
import java.util.List;

public class Manager103_ArrayList {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		List list2 = new ArrayList();
		
		list1.add(10);
		list1.add("ABC");
		list1.add(12.34);
		list1.add(true);
		list1.add('J');
		
		System.out.println(list1);
		System.out.println(list1.get(0));
		list1.add(2, "Jayant" );
		System.out.println(list1);
		
		list1.remove("Jayant");
		System.out.println(list1);
		

		
	}
}
