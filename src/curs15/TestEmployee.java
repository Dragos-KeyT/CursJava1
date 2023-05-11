package curs15;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		Developer developer = new Developer("Ion", 500);
		EmployeeUtils<Developer> dev =  new EmployeeUtils<Developer>(developer);
		EmployeeUtils<Manager> manager =  new EmployeeUtils<Manager>(new Manager("Oana", 1600));

		//EmployeeUtils<Tester> tester =  new EmployeeUtils<Tester>(new Tester("Ioana", 1200));

		System.out.println(dev.getSalary());
		System.out.println(manager.getSalary());
		
	}
	
}
