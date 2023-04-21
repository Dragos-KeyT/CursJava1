package curs10;

public class AgeVerifier {
	
	public void checkAgeLimit(int age) throws InvalidAgeEception {
		
		if(age <18) {
			
			throw new InvalidAgeEception("Invalid age to proceed!");
		}else {
			System.out.println("You are allowed!");
		}
	}
	

}
