package mapcall;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapcalling {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "C");
		map.put(4, "Spring");
		
		for(Map.Entry entry: map.entrySet())           // For Each Simple method
		{
			System.out.print(entry.getKey() + "  ");
			System.out.println(entry.getValue());
		}

		
//		Set set=map.entrySet();                         // Iterator method explaining everything
//		Iterator iterator=set.iterator();
//		while(iterator.hasNext())
//		{
//			Map.Entry entry= (Entry) iterator.next();
//			System.out.print(entry.getKey() + "  ");
//			System.out.println(entry.getValue());
//		}
//		
	}

}
