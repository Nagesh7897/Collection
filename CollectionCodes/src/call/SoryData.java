package call;

import java.util.Scanner;

public class SoryData {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter size of array");
		int size=scanner.nextInt();
		int a[]= new int[size];
		int temp=0;
		//Input
		for (int i=0; i<size; i++)
		{
			a[i]=scanner.nextInt();
		}
		
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
