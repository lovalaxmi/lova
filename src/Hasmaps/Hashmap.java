package Hasmaps;

import java.util.HashMap;

public class Hashmap {
	public static void main(String args[]) {
		HashMap<Integer ,String>  s= new HashMap<>();
		s.put(1,"laxmi");
		s.put(2,"lova");
		s.put(3, "akash");
		
		s.forEach((k,v)->System.out.println(k+" "+v));
	}

}
