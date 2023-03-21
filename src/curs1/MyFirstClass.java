package curs1;

// --one line comment
//  MyFirstClass  ==> CamelCase  (UpperCamelCase) --Conventie pentru numele claselor
//  metodaMeaJava  ==> LowserCamelCase --> pentru numele metodelor sau variabile
// pentru pachete folosim doar litere mici
//com.google.numeaplicatie.orice

//My_First_Class --> conventie python (snake case)

/*Multi
 * line
 * comment
 */

public class MyFirstClass {

	String nume = "Oana"; //variabila de instanta
	int age = 1; 
	
	public static void main(String[] args) {
		
		MyFirstClass obj =  new MyFirstClass();//instantierea clasei
		
		String prenume = "Ion";//variabila locala
		
		System.out.println(prenume);
		System.out.println(obj.nume);
		
	}

}
