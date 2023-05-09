package curs15;

import java.util.Scanner;

/*
 * facem o aplicatie care primeste un cod postal de la tastatura si afiseaza
 * orasul aferent acelui cod postal
 * Daca codul nu exista arunc o exceptie CodPostalExeption
 * Daca codul exista, printez orasul aferent codului :
 *  "Orasul asocita codului" + cod + este + oras
 * In cazul exceptiei vreau sa intreb din nou pana primesc un cod valid
 * Avem nevoie de un obiect care sa tina codurile si orasele inca de la intializare
 * 
 * 
 * 
 */


public class SearchPostalCode {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		CoduriPostale codPost =  new CoduriPostale();
		
		while(true) {
			try {
				System.out.println("Introdu un cod postal :");
				int codPostal =  scan.nextInt();
				codPost.postalCodeSearch(codPostal);
				break;
				
			}catch(Exception e) {
				e.printStackTrace();
			}
	}	

		
		
	}

}
