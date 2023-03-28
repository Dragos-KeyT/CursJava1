package curs3;

/*
 * Facem un program care citeste de la tastatura 3 numere
 * verifica care dintre numere este cel mai mare si printeaza in consola
 * daca 2 numere sunt egale, va printa : Some numbers are equal
 */
import java.util.*;

public class GreatestOfThreeNumbers {
	
	int number1, number2, number3;
	
	//int number1;
	//int number2;
	//int number3;
	
	public void askForThreeNumbers() {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Please enter nr 1:");
		number1 =  scan.nextInt();
		System.out.println("Please enter nr 2:");
		number2 =  scan.nextInt();
		System.out.println("Please enter nr 3:");
		number3 =  scan.nextInt();
	}
	
	public void compareTheNumbers() {
		askForThreeNumbers();
		/*
		 * if(){
		 * 	//code care se executa daca conditia din IF este TRUE
		 * }else if(){
		 * //code care se executa daca conditia din ELSE IF este TRUE
		 * }
		 */
		
		//AND -si - &&
		//OR --sau - ||
		
		/*
		 *  scan = operator;
		 *  
		 *  if(operator == "+"){
		 *  	num1 + num2;
		 *  }else if(operator == '*' || operator == 'x' )          //*  x
		 * 	 num * num2
		 * 
		 */	
		
		if(number1 > number2 && number1 > number3) {
			
			System.out.println("Nr 1 is the greatest");
			
		}else if(number2 > number1 && number2 > number3) {
			
			System.out.println("Nr 2 is the greatest");
		}else if(number3 > number1 && number3 > number2) {
			
			System.out.println("Nr 3 is the greatest");

		}else {
			System.out.println("Some numbers are equal!");
		}
	}
}
