package curs8;

import java.util.Arrays;

public class TwoDimArray {

	public static void main(String[] args) {

		String[][] textArray =  new String[2][3];
		
		/*
		 * 							Column 0   Column 1   Column 2
		 * 		
		 *   textArray -->  row 0    Brasov     Iasi		Bacau
		 *    
		 * 					row 1    Berlin		Paris 		Roma
		 * 
		 * 
		 */
		
		textArray[0][0] = "Brasov";
		textArray[0][1] = "Iasi";
		textArray[0][2] = "Bacau";
		
		textArray[1][0] = "Berlin";
		textArray[1][1] = "Paris";
		textArray[1][2] = "Roma";
		
		System.out.println(textArray.length);
		System.out.println(textArray[0].length);
		
		for(int i = 0; i<textArray.length; i++) {
			
			System.out.println("ROW" + Arrays.toString(textArray[i]));
			
			for(int j = 0; j<textArray[0].length; j++ ) {
				
				System.out.println("Column " + textArray[i][j]);
			}
		}
		
		
	}

}
