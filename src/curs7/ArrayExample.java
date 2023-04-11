package curs7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {

		String[] textArray = new String[5]; 
	//  String[] textArray = {null, null, null, null, null}
	//  index                   0     1     2     3     4			
		System.out.println(textArray[2]);
		textArray[0] = "This";
    //  String[] textArray = {"This", null, null, null, null}
	//  index                   0     1     2     3     4			
		textArray[1] = " is";
		textArray[2] = " an" ;
		System.out.println(textArray[2]);
	//  String[] textArray = {"This", "is", "an", null, null}
		textArray[3] = " array";
		textArray[4] = "!";
	//  String[] textArray = {"This", "is", "an", "array", "!"}

	/*	try {
			System.out.println(textArray[5]);

		}catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println(obj.getMessage());
		}
		Scanner scan  =  new Scanner(System.in);
		try {
			int num  =  scan.nextInt();

		}catch(InputMismatchException obj){
			System.out.println("Te rog introdu doar numere");
			
		}*/
		
		
		
		for(int i = 0; i < textArray.length; i++) {
			
			System.out.print(textArray[i]);
		}
		System.out.println("");
		System.out.println("-------------------------------");
		
		for(String obj : textArray) {
			System.out.print(obj);
		}
		
		//TestNg --> DataProvider --> Object[][]  --> orice data type
		//Simplu[] = {1, 2}
		//Object[][] = { {1, 2}, {3, 4} }
		//object[0][0]  = 1
		//object[0][1]  = 2
		//object[1][0]  = 3
		//object[1][1]  = 4
		
		
		
		

	}

}
