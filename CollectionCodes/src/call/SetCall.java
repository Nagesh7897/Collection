package call;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCall {

	public static void main(String[] args) {

		Set set=new HashSet();        // Stores Unique Values randomly  (Reject duplicates)
		set.add("Jsp");
		set.add("Hibernate");
		set.add("Spring");
		set.add("Hibernate");
		set.add("ZZZ");
		set.add("zzz");
       	System.out.println(set);
       	
       	
       	Set sets=new TreeSet<>();        // Stores Unique Values in alphabetical Order (Reject duplicates)
		sets.add("Jsp");
		sets.add("Hibernate");
		sets.add("ZZZ");
		sets.add("Spring");
		sets.add("zzz");
		sets.add("Hibernate");
		
       	System.out.println(sets);
	}

}
