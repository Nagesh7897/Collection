package featchDataFromDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbCall {

	public static void main(String[] args) throws ClassNotFoundException  {
			 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/employid", "root", "root");
				Statement statement =con.createStatement();
				
				ResultSet rs=statement.executeQuery("Select * from employee");        //   to fetch the data from employee table
				
				while(rs.next())
				{
					System.out.println(rs.getInt("Id")+"   "+rs.getString("Name")+"   "+rs.getInt("ImpId"));
				}
				
				ResultSet rp=statement.executeQuery("Select * from product");         //   to fetch the data from Product table
				while(rp.next())
				{
					System.out.println(rp.getInt("Id")+"   "+rp.getString("ProductName")+"   "+rp.getInt("Price"));
				}

			
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
