package curs4;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		//increment
		// nr++   --> nr = nr+1  --> nr += 1
		
		//nr++  --> Post increment 
		// ++nr == Pre increment
		
		//decrement
		//nr--   Post decremenet
		//--nr  Pre decrement
		
		System.out.println("------POST--------");
		int num = 5;
		System.out.println("Valoarea lui num inainte de increment :" + num);
		System.out.println("Valoarea lui num in POST increment :" + num++);//dupa executie face increment
		System.out.println("Valoarea lui num dupa increment :" + num);
		System.out.println("------PRE--------");
		int num2 = 11;
		System.out.println("Valoarea lui num2 inainte de increment :" + num2);
		System.out.println("Valoarea lui num2 in PRE increment :" + ++num2);
		System.out.println("Valoarea lui num dupa increment :" + num2);
		
		//decrement
		int num3  =3;
		System.out.println(num3--); //POST
		System.out.println(num3);
		
		System.out.println(--num3);//PRE

	}
}
