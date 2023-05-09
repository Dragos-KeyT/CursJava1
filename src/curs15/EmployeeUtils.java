package curs15;

public class EmployeeUtils <T extends Employee> {

	T employee;
	
	public EmployeeUtils(T employee) {
		this.employee =  employee;
	}
	
	public int getSalary() {
		return employee.salary;
	}
	
}
