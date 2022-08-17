package streamCallFunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OddEvenWithStream {

	public static void main(String[] args) {
List list=Arrays.asList(4,5,9,8,23,55,21,8,2,4,5,11,13,7,25);
		
	
		Set<Integer> set= new HashSet<Integer>(list).stream()
				.filter(number -> number % 2 ==0).collect(Collectors.toSet());
	    System.out.println(set);
	}

}
