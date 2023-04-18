package curs9;

public class TestAnimal {

	public static void main(String[] args) {

		/*Animal animal =  new Animal();
		animal.makeSound();
		
		System.out.println("---------------------");
		
		Lion leu = new Lion();
		leu.makeSound();
		leu.
();
		
		System.out.println("---------------------");

		Deer bambi =  new Deer();
		bambi.makeSound();
		bambi.eatGrass();
		
		//WebDriver driver = new ChromeDriver();
		*/
		
		Animal simba = new Lion();
		simba.makeSound();
		((Lion)simba).eatMeat();//Lion lion = new Lion();
		feedAnimal(simba);

		simba = new Deer();
		simba.makeSound();
		((Deer)simba).eatGrass();
		feedAnimal(simba);
	}
	
	public static void feedAnimal(Animal animal) {
		
		if(animal instanceof Lion) {
			System.out.println("You are getting burgers!");
		}else if(animal instanceof Deer) {
			System.out.println("You are getting salad!");
		}
		
	}
	
	

}
