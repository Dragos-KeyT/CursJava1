package curs10;
/*
 * Produse de tip dulciuri
 * Avem produse individuale
 * Pt fiecare produs avem obligatoriu Pret de vanzare + TVA si nume
 * Stim ca unele produse se vand la bucata
 * Stim ca alte produse se vand la kg
 * Stim ca alte produse se vand la bax
 * (Jeleuri (kg), Ingheta (buc) si Napolitane(bax))
 * Sa scanam 3 produse is sa afisam numarul de produse + pretul total al produselor
 * 
 */


public class CasaDeMarcat {
	
	public static Produse[] array = new Produse[3]; 
	
	
	public static void pretTotal() {
		double sum = 0;
		
		for(Produse produs : array) {
			sum = sum + produs.pret();
		}
		
		System.out.println("Ai de platit :" +sum);
	}
	

	public static void main(String[] args) {

		Inghetata icecream = new Inghetata("Napoca", 4);
		Jeleuri ursuleti =  new Jeleuri("Haribo", 20, 0.5);
		Napolitane joe = new Napolitane("Joe", 20, 15, 10);
		
		//Inghetata obj =  new Inghetata(null, 0);
		
		array[0] = icecream;
		array[1] = ursuleti;
		array[2] = joe;
		
		pretTotal();
	}

}
