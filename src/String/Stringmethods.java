package String;

import java.util.Arrays;

public class Stringmethods {
public static void main(String args[]) {
	String a="lovalaxmi";
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(a.charAt(5));
	System.out.println(a.indexOf(6));
	System.out.println(a.length());
	String b="risitha";
	System.out.println(a.equals(b));
	String c="LOVALAXMI ";
	System.out.println(a.equals(b));
	System.out.println(a.equalsIgnoreCase(c)); 
	System.out.println(b.concat("chandu"));
String []s={"lova","laxmi","vasi","harsha"};
	System.out.println(Arrays.toString(s));
	String d="lova laxmi chandu rishi";
	
	String []e=d.split(" ");
	System.out.println(Arrays.toString(e));
	
	String  h="laxmi";
	System.out.println(h.startsWith("l"));
	System.out.println(h.endsWith(""+ "u"));
	
	
	
	String q="fox is an animal";
	System.out.println(q.indexOf(3));
	
	String l="helloword";
	char l1[]=l.toCharArray();
	System.out.println(Arrays.toString(l1));
	
	
	
	
	
}
}
