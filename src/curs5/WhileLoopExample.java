package curs5;
/*
 * facem un program care calculeaza salariul pe o saptamana
 * intrebam userul cate ore a lucrat
 * calculam doar daca numarul de ore este intre 1 si 40
 * daca numar de ore este invalid il rugam sa mai introduca o data
 * pana va introduce un numar valid
 * 
 */

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("cate ore ai lucrat saptamana aceasta ?");
		int oreLucrate =  scan.nextInt();
		int ratePerHour = 15;
		
	/*	while(oreLucrate >= 1 && oreLucrate <=40) {
			System.out.println("Salariul de platit este :" + oreLucrate*ratePerHour);
			break;
		}*/
		
		while(oreLucrate <1 || oreLucrate > 40) {
			System.out.println("Nr de ore invalid te rog mai introdu o data :");
			oreLucrate = scan.nextInt();
		}
		
		System.out.println("Salariul de platit este :" + oreLucrate*ratePerHour);

	}

}
