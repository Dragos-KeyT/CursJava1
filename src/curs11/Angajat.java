package curs11;

public interface Angajat {
	
	//public static final String salariu = "100";
	
	public void setName(String name);
	public String getName();
	
	public void setEmail(String email);
	public String getEmail();
	
	public void testCeva();
	
	default void printNumeDepartament() {
		System.out.println("QA");
	}
	
}
