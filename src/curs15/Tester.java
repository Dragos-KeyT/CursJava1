package curs15;

public class Tester<T> {
	
	T age;
	
	public Tester(T age) {
		this.age = age;
	}

	public void printAge() {
		
		System.out.println("Data type este " + age.getClass().getName());
	}
	
}
