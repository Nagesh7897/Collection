package beanSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCall {

	public static void main(String[] args) {
		
		List<Vagitable> list=new ArrayList<Vagitable>();
		
		list.add(new Vagitable(1, "Mango", 20, 40));
		list.add(new Vagitable(2, "Apple", 10, 100));
		list.add(new Vagitable(3, "Orange", 5, 120));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
