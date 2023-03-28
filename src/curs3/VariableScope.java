package curs3;

public class VariableScope {
	
	
	/*
	 * 1. compileaza
	 * 2. le incarca in jvm
	 * 3. cauta membrii static (var sau metode care au definit in delcaratia lor
	 * cuvantul static)
	 * ...
	 * ...
	 * 4. instantiaza obiecte 
	 *  
	 */
	
	public String nume = "Oana";//variabila de instanta
	public static String culoare = "Alb";
	
	public static void main(String[] args) {
		VariableScope obj =  new VariableScope();
		
		System.out.println(culoare);
		obj.printeazaSalut();
		
		String prenume = "Ion";
	
		System.out.println(obj.nume);
		
		System.out.println(prenume);
		
	}

	public void printeazaSalut() {
		
		System.out.println("Salut " + nume);
		
	}
	
	
	
}
