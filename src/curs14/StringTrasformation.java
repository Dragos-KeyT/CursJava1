package curs14;

public class StringTrasformation {

	public static void main(String[] args) {

		transformToString();
	}
	
	public static void transformToString() {
		
		char ch = 'a';
		String chStr = String.valueOf(ch);
		String chStr2 = Character.toString(ch);
		System.out.println(chStr);
		System.out.println(chStr2);
		
		System.out.println("-------------------------");
		
		boolean bol =  (Boolean) null;
		String bolStr = Boolean.toString(bol);
		String bolStr2 = String.valueOf(bol);
		System.out.println(bolStr);
		System.out.println(bolStr2);
		
		String str = null;
		//System.out.println(str.toString());
		System.out.println(String.valueOf(str));
	}

}
