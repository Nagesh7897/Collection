package mathematicalOperationWithList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MathematicalOperation {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		List<Model> list=new LinkedList<>();
		
		Model model=new Model();
		System.out.println("Please Enter Two numbers For Operation");
	    model.setA(scanner.nextInt());
	    model.setB(scanner.nextInt());
		list.add(model);
		System.out.println("Enter your choice");
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Mult");
		System.out.println("4. Div");
		
		int choice=scanner.nextInt();
		
		for(Model opration:list)
			
			if(choice==1)
			{
				System.out.println(opration.getA()+opration.getB());
			}
			else if(choice==2)
			{
				System.out.println(opration.getA()-opration.getB());
			}
			else if(choice==3)
			{
				System.out.println(opration.getA()*opration.getB());
			}
			else if(choice==4)
			{
				System.out.println(opration.getA()/opration.getB());
			}
			else
			{
				System.out.println("Invalid Input");
			}
		
		scanner.close();
		
	}

}
