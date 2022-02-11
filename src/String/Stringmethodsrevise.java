package String;

import java.util.Arrays;

public class Stringmethodsrevise {
	public static void main(String args[]) {
		String s="lovalaxmi";
		String s1="Lova laxmi";
		String a="how are you akash";
		String q="";
		System.out.println("1"+s.charAt(3));
		System.out.println("2"+s.concat("123"));
		System.out.println("3"+s.concat(" "+"rishi"));
		System.out.println("4"+s.replace('a', 'e'));
		System.out.println("5"+s.replace('l', 'a'));
		System.out.println("6"+s.contains("you"));
		System.out.println("7"+a.contains("you"));
		System.out.println("8"+q.isEmpty());
		System.out.println("9"+s.isEmpty());
		System.out.println("10"+s.equals(a));
		System.out.println("11"+s.equals(q));
		System.out.println("12"+s.equalsIgnoreCase(s1));
		System.out.println("13"+s.equalsIgnoreCase(a));
		String b=String.join("_","welcome","to","india");
		System.out.println(b);
		String b1=String.join("/","welocme","to","india");
		System.out.println(b1);
		System.out.println(s.length());
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	    System.out.println(s.indexOf('i'));
	    System.out.println(s.indexOf('a'));
	    String e="hello word";
	    String[] h=e.split(" ");
	    System.out.println(Arrays.toString(h));
	    String w="lova,laxmi,vasi,pooji";
	    char[] w1=w.toCharArray();
	    System.out.println(w1);
		
	
	}

}
