package call;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorsCall {

	public static void main(String[] args) {
		
		
		List<Integer> list=new LinkedList<Integer>();        
		list.add(50);
		list.add(35);
		list.add(12);
		Iterator<Integer> var = list.iterator();
		while(var.hasNext())
		{
	      	System.out.println(var.next());	
		}
		
//OR     Easy Method
//		for (int store:list)
//		{
//			System.out.println(store);
//		}
 
	}

}
