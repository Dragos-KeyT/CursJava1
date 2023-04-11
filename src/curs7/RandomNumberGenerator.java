package curs7;

import java.util.Arrays;
import java.util.Random;

/*
 * Facem un program care genereaza 6 numere intre 0 si 9 
 * le tine intr-un array
 * nu tinem numere duplicate
 * printam array-ul
 * 
 * 
 * o metoda care genereaza si le pune in array
 * o metoda care nu permite duplicat
 * o metoda care printeaza
 * 
 *   
 */


public class RandomNumberGenerator {

	public int[] generateNumbers() {
		int[] numbers =  new int[6];
		Random random = new Random();
		
		
		for(int i = 0; i<numbers.length; i++) {
			int randomNr = 0; 

			do {
				randomNr = random.nextInt(9);
				System.out.println(randomNr);
				//2
			}while(checkDuplicateNumber(numbers, randomNr));
			
			numbers[i] = randomNr;
		}
				
	/*	int i = 0;
		do {
			randomNr = random.nextInt(9);
			numbers[i] = randomNr;
			i++;
		}while(i < numbers.length);*/
		

		return numbers;
	}
	
	public boolean checkDuplicateNumber(int[] array, int nr) {

		for(int number : array) {
			if(nr == number) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {

		RandomNumberGenerator rn = new RandomNumberGenerator();
		System.out.println(Arrays.toString(rn.generateNumbers()));
		
		
	}

}
