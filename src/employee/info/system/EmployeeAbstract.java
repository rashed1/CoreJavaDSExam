package employee.info.system;

public abstract class EmployeeAbstract implements Employee{
	
	//employeeId() will return employee id.
	public int getEmployeeId(){
		return employeeId();
	};
		
	//employeeName() will return employee name
	public String getEmployeeName(){
		return employeeName();
	}
		
	//assignDepartment() will assign employee to departments
	public abstract void assignDepartment();
		
	//calculate employee salary
	public abstract int calculateSalary();
		
	//employee benefit
	public abstract void benefitLayout();	
	

}
