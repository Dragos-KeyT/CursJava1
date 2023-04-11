package curs7;

public class StringComparison {

	public static void main(String[] args) {

		String first = "Java";
		String second = "Auto";
		String third =  "Java";
		String fourth = new String("Java");
		
		System.out.println("Case : ==");
		System.out.println(first == second);
		System.out.println("Case : equals");
		System.out.println(first.equals(second));
		
		System.out.println("--------------------------");
		System.out.println("Case : ==");
		System.out.println(first == third);
		System.out.println("Case : equals");
		System.out.println(first.equals(third));

		System.out.println("--------------------------");
		System.out.println("Case : ==");
		System.out.println(first == fourth);
		System.out.println("Case : equals");
		System.out.println(first.equals(fourth));
		
	}

}
