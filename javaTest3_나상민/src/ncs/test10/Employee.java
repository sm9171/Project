package ncs.test10;

public class Employee {
	private String name;
	private int number;
	private String department;
	private int salary;
	public Employee(){}
	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	public double tax(){
		return getSalary();
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public String getDepartment() {
		return department;
	}
	public int getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
