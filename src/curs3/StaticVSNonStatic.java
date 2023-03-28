package curs3;

public class StaticVSNonStatic {

	public static String nume;
	public static String departament = "QA";
	
	public static void main(String[] args) {

		System.out.println(nume);
		System.out.println(departament);
		System.out.println("--------------------------");
		StaticVSNonStatic person = new StaticVSNonStatic();
		person.nume = "Jhonny";
		System.out.println(person.nume + departament);
		System.out.println("--------------------------");
		StaticVSNonStatic person2 = new StaticVSNonStatic();
		person2.nume = "Ioana";
		System.out.println(person2.nume + departament);
		System.out.println("--------------------------");
		departament = "DEV";
		StaticVSNonStatic person3 = new StaticVSNonStatic();
		person3.nume = "TREI";
		System.out.println(person3.nume + departament);

		System.out.println("--------------------------");
		System.out.println("--------------------------");
		System.out.println(person.nume + departament);
		System.out.println(person2.nume + departament);
		System.out.println(person3.nume + departament);

	}

}
