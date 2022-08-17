package call;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CollectionManualSort {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter size of array");
		int size=scanner.nextInt();
		int value=0;
		List<Integer> list=new LinkedList<Integer>();
		for(int i=0; i<size; i++)
		{
			System.out.println("Plese Enter "+ (i+1)+" value : ");
			value =scanner.nextInt();
			list.add(value);
		}
		System.out.println(list);
		
		int index=0;
		int a[]=new int[size];
		for(Integer item: list)
		{
			a[index]= item;
			index++;
		}
		int temp=0;
		//Operations
		for(int j=0; j<(size-1);j++)
		{
		for (int i=0; i<(size-1); i++)
		{
			if (a[i]>a[i+1])
			{
				temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
		}
		//Output
		for (int i=0; i<size; i++)
		{
		System.out.println(a[i]);
		}
		scanner.close();
	}

}
