package curs6;

import java.util.Scanner;

public class SwitchExample {
/*
 * intreb userul un calificativ si printez in functie de raspuns:
 * A--> Felicitari!
 * B--> Destul de bine!
 * C--> Suficient!
 * D--> Insuficient!
 * Daca introduce alt calificativ: Calificativ invalid!
 * 
 */
	public static void main(String[] args) {

		Scanner scan =  new Scanner(System.in);
		System.out.println("Te rog sa introduci un calificativ :");
		String nota  = scan.next();
		
		switch(nota.toUpperCase()) {
		
			case "A" :
				System.out.println("Felicitari!");
				break;
			case "B":
				System.out.println("Destul de bine!");
				break;
			case "C":
				System.out.println("Suficient!");
				break;
			case "D":
				System.out.println("Insuficient!");
				break;
			default:
				System.out.println("Calificativ invalid!");
		}
		
	}

}
