package curs4;

import java.util.Scanner;

/*
 * Facem un calculator simplu pentru opertiile de baza : 
 * +(adunare)
 * - (scadere)
 * * (inmultire)
 * / (impartire)
 * 
 * Intrebam userul primul nr
 * intrebam operatorul pe care vrea sa il foloseasca
 * intrebam numarul 2
 * Printam sub forma : EX: 2 + 2 = 4
 * 
 */


		//masina     masina.charAt(0) == 'm'
		//012345


public class SimpleCalcuclator {
	
	int num1, num2, result;
	char operator;
	
	public void askTheUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu primul numar :");
		num1 = scan.nextInt();
		System.out.println("Te rog introdu operatorul :");
		operator =  scan.next().charAt(0);
		System.out.println("Te rog introdu al doilea numar :");
		num2 =  scan.nextInt();	
	}
	
	
	public void calculateValues() {
		askTheUser();
		
		if(operator == '+') {
			result = num1+num2;
			printResult();
			
		}else if(operator == '-') {
			result = num1-num2;
			printResult();
			
		}else if(operator == '*' || operator == 'x') {
			result = num1*num2;
			printResult();
			
		}else if(operator == '/' || operator == ':') {
			result = num1/num2;
			printResult();
		}else {
			System.out.println("Te rog sa introduci doar : * / + -");
		}
	}
	
	public void printResult() {
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

	}

}
