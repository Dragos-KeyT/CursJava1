package curs9.package2;

import curs9.package1.ProtectedAccesModifier;

public class SubClassProtectedModifier extends ProtectedAccesModifier{

	//Subclasa in alt pachet: yes
	
	public static void main(String[] args) {

		SubClassProtectedModifier obj = new SubClassProtectedModifier();
		obj.printMesaj();
		
	}

}
