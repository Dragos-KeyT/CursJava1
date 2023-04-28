package curs12;

public class TestPropertiesFile {

	public static void main(String[] args) {

		PropertiesFileProcessor obj =  new PropertiesFileProcessor();
		obj.writePropertiesFile();
		obj.readPropertiesFile("email");
		
		obj.updatePropertiesFile("email", "email.updatat");
		obj.readPropertiesFile("email");

		obj.deleteFromProperties("email");
		obj.readPropertiesFile("email");

	}

}
