package featchData;

import java.util.LinkedList;
import java.util.List;

public class CallListBean {

	public static void main(String[] args) {
		
		
		List<ProductBeenClass> list= new LinkedList<>();
		
		ProductBeenClass p1=new ProductBeenClass(1, "Samsung", 20000);
		ProductBeenClass p2=new ProductBeenClass(2, "Nokia", 15000);
		
		List<Employee> list1= new LinkedList<>();
		Employee e1=new Employee(1, "Nagesh", 100001);
		Employee e2=new Employee(2, "Chinmay", 100002);

		list.add(p1);
		list.add(p2);
		
		list1.add(e1);
		list1.add(e2);
		
		for(ProductBeenClass p: list) {
			System.out.println(p.getId()+"  "+p.getName()+"  "+p.getPrice());
		}
		
		for(Employee e: list1) {
			System.out.println(e.getId()+"  "+e.getName()+"  "+e.getEmployeeId());
		}
	}

}
