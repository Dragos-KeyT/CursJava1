package curs9.package1;

class DefaultAccesModifier {

	/*
	 * Default inseamna ca nu specificam niciun access modifier
	 * Scopul este limitat la pachetul in care se afla
	 * 
	 * Same class : yes
	 * SubClass in same package : yes
	 * Other class in same package : yes
	 * 
	 * SubClass in other package : no
	 * Other class in other package : no
	 * 
	 */
	
	String mesaj = "Default modifier";
	
	void printMesaj() {
		System.out.println(mesaj);
	}
	
	public static void main(String[] args) {
		DefaultAccesModifier obj = new DefaultAccesModifier();
		obj.printMesaj();
	}
	
}
