package curs9.package1;

public class ProtectedAccesModifier {

	/*
	 * Scopul lui este in acealsi pachet si subclase din pachete diferite
	 * clasele NU pot fi declarate ca protected
	 * 
	 * Aceasi clasa : yes
	 * Alta clasa in acealsi pachet : yes
	 * Subclasa in acealasi pachet : yes
	 * 
	 * Subclasa in alt pachet : yes
	 * Alta clasa in alt pachet : no
	 * 
	 * 
	 */
	
	protected String mesaj = "Protected Acces";
	
	protected void printMesaj() {
		System.out.println(mesaj);
	}
	
	
	
	public static void main(String[] args) {

		ProtectedAccesModifier obj = new ProtectedAccesModifier();
		obj.printMesaj();
		
	}

}
