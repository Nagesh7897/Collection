package com.vagitable.model;

import java.util.LinkedList;
import java.util.List;

public class VagitableData {

	public static List<Vagitable> VegCall() {
		
		Vagitable apple=new Vagitable();
		apple.setId(1);
		apple.setName("Apple");
		apple.setDesc("Fruit");
		apple.setPrice(120);
		apple.setQuantity(10);
		
		Vagitable orange=new Vagitable();
		orange.setId(2);
		orange.setName("Orange");
		orange.setDesc("Fruit");
		orange.setPrice(60);
		orange.setQuantity(20);
		
		Vagitable banana=new Vagitable();
		banana.setId(3);
		banana.setName("Banana");
		banana.setDesc("Fruit");
		banana.setPrice(30);
		banana.setQuantity(30);
		
		Vagitable mango=new Vagitable();
		mango.setId(4);
		mango.setName("Mango");
		mango.setDesc("Fruit");
		mango.setPrice(200);
		mango.setQuantity(50);
		
		List<Vagitable> list = new LinkedList<Vagitable>();
		list.add(apple);
		list.add(orange);
		list.add(banana);
		list.add(mango);
		
		return list;
	}

}
