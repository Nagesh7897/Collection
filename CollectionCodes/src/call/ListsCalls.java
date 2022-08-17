package call;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListsCalls {

	public static void main(String[] args) {
		
		List list=new LinkedList();        //
		list.add(1);
		list.add(2);
		list.add(1);
       	System.out.println(list);
       	
       	
       	List liste=new ArrayList<>();        //
		liste.add("Jsp");
		liste.add("Hibernate");
		liste.add("Spring");
       	System.out.println(liste);
       	
	}
}
