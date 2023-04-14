package curs8;

public class TestSquare {

	public static void main(String[] args) {

		Square patrat = new Square(null, null) ;
		
		//Shape patrat2 =  new Square();
		
		System.out.println(patrat.nume);
		System.out.println(patrat.culoare);
		
		
		patrat.printDetails();
		
	}

}
