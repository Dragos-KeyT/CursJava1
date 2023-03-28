package curs2;

public class Shape {
	
	//metoda
	public void calculateArea(int lenght, int width) {
		System.out.println("Aria este :" +lenght *width); 
	}

	//constructor
	public Shape(int lenght, int width) {
		calculateArea(lenght, width);
	}
	
}
