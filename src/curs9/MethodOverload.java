package curs9;

public class MethodOverload {

	public static void main(String[] args) {

		System.out.println("ABC");//String
		System.out.println(123);//int
		System.out.println('c');//char
		System.out.println(2.5);//double
		
		testParametru("Ceva");
		//testParametru(123);
		
		
		multiply(3, 4);
		multiply(3.5, 4);

	}
	
	/*
	 * CRUD operations - CREATE READ UPDATE DELETE
	 * 
	 * HTTP : RestAPI
	 * 
	 * CREATE -POST
	 * READ -GET
	 * UPDATE - PUT/PATCH
	 * DELETE -DELETE
	 * 
	 * makePostRequest()
	 * makeGetRequest()
	 * 
	 * makeRequest(GET, etc)
	 * makeREquest(POST, etc)
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	

	public static void testParametru(String text) {
		System.out.println(text);
	}
	
	public static void multiply(int num1, int num2) {
		System.out.println(num1*num2);
	}
	public static void multiply(double num1, double num2) {
		System.out.println(num1*num2);
	}
	
}
