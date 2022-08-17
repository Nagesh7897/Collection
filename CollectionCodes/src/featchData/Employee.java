package featchData;

public class Employee {

	int Id;
	String Name;
	int EmployeeId;
	

	public Employee(int id, String name, int employeeId) {
		super();
		Id = id;
		Name = name;
		EmployeeId = employeeId;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	
	
	
}
