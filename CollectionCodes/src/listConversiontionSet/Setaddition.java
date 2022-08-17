package listConversiontionSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Setaddition {

	public static void main(String[] args) {
		List list=Arrays.asList(4,5,9,8,23,55,21,8,2,4,5,11,13,7,25);
		
		List<Integer> listnew=new LinkedList<>(list);
		Set<Integer> set=new HashSet<>(list);   //Sorted
        //System.out.println(set.size());
		// System.out.println(list.size());
		
		int a[]=new int[list.size()];
		int sum=0;
		int i=0;
		
		for(Integer x:listnew)
		{
			a[i]=x;
			i++;
		}
		
		for(i=0; i<listnew.size();i++)
		{
		sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
