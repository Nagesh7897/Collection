package featchDataFromDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class CallDbCollection {

	public static void main(String[] args) throws SQLException {
		List<Employee> list=new LinkedList<>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/employid", "root", "root");
		Statement statement =con.createStatement();
		
		ResultSet set=statement.executeQuery("Select * from employee");        //   to fetch the data from employee table
		Employee emp;
		while(set.next())
		{
			emp=new Employee(0, null, 0);
			emp.setId(set.getInt(1));
			emp.setName(set.getString(2));
			emp.setSalary(4);
			
			list.add(emp);
		}
		
		for (Employee e: list)
		{
			if(e.getSalary()>=35000)
			{
				System.out.println(e.getId()+"  "+e.getName()+"  "+e.getSalary());
			}
		}
		
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
