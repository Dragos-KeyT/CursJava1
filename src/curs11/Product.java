package curs11;

public abstract class Product {
	
	public String nume;
	
	public abstract int calculatePrice();
	
	public void productRating() {
		System.out.println("Best product!");
	}
	

}
