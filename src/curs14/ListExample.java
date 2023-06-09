package curs14;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		List<String> list =  new ArrayList<>();
		
		System.out.println(list.size());
		list.add("Oana");
		list.add("Ion");
		list.add("Maria");
		list.add("Gabriel");
		System.out.println(list.size());

		for(String nume : list) {
			System.out.println(nume);
		}
		System.out.println("----------------------");
		
		System.out.println("get element " + list.get(2));
		
		System.out.println("----------------------");

		list.add(2,"Carmen");
		
		System.out.println("get element " + list.get(2));
		for(String nume : list) {
			System.out.println(nume);
		}
		
		System.out.println("----------------------");

		System.out.println(list.indexOf("Maria"));
		
		for(String nume : list) {
			System.out.println( list.indexOf(nume) + " : " + nume);
		}
		System.out.println("----------------------");

		list.add(5, "Mara");
		
		for(String nume : list) {
			System.out.println( list.indexOf(nume) + " : " + nume);
		}
		
		list.remove(5);
		list.remove("Oana");
		
		System.out.println("----------------------");
		
		for(String nume : list) {
			System.out.println( list.indexOf(nume) + " : " + nume);
		}
		
		list.clear();
		System.out.println(list.isEmpty());
	}

}
