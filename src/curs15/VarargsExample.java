package curs15;

public class VarargsExample {

	public static void main(String[] args) {

		printCeva("A", "B", "C");
		printCeva("A");
		printCeva("A", "B", "C", "D", "E", "F");
		printCeva(123, 23);
		printCeva('a', 'x', '&');
		printCeva(true, '!', "Some text", 23.90, 3);
		
		printCeva2(32,false,"A", "B", "C", "D", "E", "F");

	}

	public static <T> void printCeva(T...values) {
		for(T value : values) {
			System.out.println(value);
		}
	}
	//varargs trebuie sa fie tot timpul ultimul din lista de parametri
	//poti sa ai doar un singur varargs
	public static void printCeva2(int num, boolean flag, String...values) {
		for(String value : values) {
			System.out.println(value);
		}
	}
	
	//JavascriptExecutor jse = new...
	//jse.executeScript("script JS", WebElement...obj)
	
	
	/*
	public static void printCeva(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void printCeva(String a, String b, String c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	} */
	
	
}
