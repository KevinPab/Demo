package com.cogent.core.abstractsInterface;

import java.util.ArrayList;
import java.util.List;

class Flower101 {

}

class Rose101 extends Flower101 {

}
interface I101{
	
}
class I101Impl implements I101{
	
}

public class Manager101 {
	public static void main(String[] args) {
		
		//Industrial convention: always create subtype using supertype in the left hand
		Rose101 r1 = new Rose101();
		Flower101 f1 = new Rose101(); // better approach
		
		I101Impl i1 = new I101Impl();
		I101 i2 = new I101Impl(); // better approach
		
		ArrayList list1 = new ArrayList();
		List list2 = new ArrayList(); // Better Approach
		
	}
}
