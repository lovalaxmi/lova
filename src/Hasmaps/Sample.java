package Hasmaps;

import java.util.HashMap;
import java.util.Iterator;

public class Sample {
	public static void main(String args[]) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(101,"lova");
		hm.put(102, "laxmi");
		hm.put(103,"siri");
		
		for(Integer i:hm.keySet()) {
			System.out.println(i);
			
		}
		for(String i:hm.values()) {
			System.out.println(i);
		}
		
		Iterator s=hm.keySet().iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		Iterator a=hm.values().iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		
		hm.forEach((k,v)->System.out.println(k+" "+v));
		
	}

}
