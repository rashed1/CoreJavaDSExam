package employee.info.system;

public class EmployeeInfo extends EmployeeAbstract{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 */

	/*
	 * declare few static and final fields and some non-static fields
	 * 
	 * 
	 */
	static String companyName;
	
	private String performance;
	private double salary;
	private int employeeId;
	private int year;
	private double pension;
	private String employeeName;
	private String department;
	
	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId){
		this.employeeId = employeeId;
		
	}
    public EmployeeInfo(String name, int employeeId){
    	this.employeeId = employeeId;
		this.employeeName = name;
	}
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployeBonus(double salary, String performance ){
		double bonus=0.0;
		
		if (performance == "best"){
    		 bonus = salary * (10/100);
    	}
    	else if (performance == "average"){
    		bonus = salary * (8/100);
    	}
    	else if(performance == "poor")   {
    		bonus = 0.0;
    	}
		
		return bonus;
		
	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployePension(int y, double s){
		int year = y;
		double salary = s;
		double total=0;
		double percentage = (double) y * (5/100);
		
		total = salary * percentage;
		
		return total;
	}
	@Override
	public int employeeId() {
		// TODO Auto-generated method stub
		return employeeId;
	}
	@Override
	public String employeeName() {
		// TODO Auto-generated method stub
		return employeeName;
	}
	@Override
	public void assignDepartment() {
		// TODO Auto-generated method stub
		if (employeeId> 1 && employeeId < 10){
			department = "administration";
		}
		if (employeeId> 10 && employeeId < 20){
			department = "sales";
		}
		if (employeeId> 20 && employeeId < 30){
			department = "customer service";
		}
		
	}
	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		int salary = 0;
		if (department == "administration"){
			salary = 50000;
		}
		if (department == "sales"){
			salary = 30000;
		}
		if (department == "customer service"){
			salary = 40000;
		}
		
		
		return salary;
	}
	@Override
	public void benefitLayout() {
		// TODO Auto-generated method stub
		if (department == "administration"){
			System.out.println("Full benefit package");
		}
		if (department == "sales"){
			System.out.println("All benefits excluing dental and vision");
		}
		if (department == "customer service"){
			System.out.println("All benefits excluding vision");
		}
	}


	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		EmployeeInfo.companyName = companyName;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPension() {
		return pension;
	}
	public void setPension(double pension) {
		this.pension = pension;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	}