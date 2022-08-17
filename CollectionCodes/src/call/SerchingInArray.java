package call;

import java.util.Scanner;

public class SerchingInArray {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter size of array");
		int size=scanner.nextInt();
		int a[]= new int[size];
		//Input
		for (int i=0; i<size; i++)
		{
			System.out.println("Plese Enter "+ (i+1)+" value : ");
			a[i]=scanner.nextInt();
		}
		
		System.out.println("Enter the element to search");
		int search=scanner.nextInt();
		
		int flag=0;                       //
			
			for(int i=0; i<size;i++)
		{
			if(a[i]==search)
			{
				flag=1;
				break;
			}
		}
			
			if(flag==1)
			{
				System.out.println("Element found");
			}
		else
			{
				System.out.println("Not found");
			}
		scanner.close();	
	}

}
