package curs10;

import java.util.Scanner;

public class TestAgeVerifier {

	public static void main(String[] args) throws InvalidAgeEception {

		AgeVerifier obj =  new AgeVerifier();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age :");
		
		int age = scan.nextInt();
		
		try {
			obj.checkAgeLimit(age);

		}catch (InvalidAgeEception e) {
			System.out.println("You are too young!");
		}
		
		
		
	}

}
