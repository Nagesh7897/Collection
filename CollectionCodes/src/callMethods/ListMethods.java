package callMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Java","Hibernate","Spring","Jsp","Servlate");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
