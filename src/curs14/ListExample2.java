package curs14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {

		List<String> list =  new ArrayList<>(Arrays.asList("zero", "unu", "doi", "trei"));
		
		list.add("patru");
		list.add("cinci");
		
		System.out.println(list.contains("opt"));
		
		list.subList(1, 4).clear();
		
		System.out.println("----------------------");
		
		for(String elem : list) {
			System.out.println(elem);
		}
		
		list.add("zero");
		System.out.println("----------------------");
		
		for(String elem : list) {
			System.out.println(elem);
		}
		
		list.set(3, "sase");
		System.out.println("get element " + list.get(3));
	}

}
