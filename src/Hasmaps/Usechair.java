package Hasmaps;

import java.util.HashMap;
import java.util.Iterator;

public class Usechair {
	public static void main(String atgs[]) {
		Chair s1=new Chair(600,"lovely",4,"plastic");
		Chair s2=new Chair(500,"sk",3,"rabber");
		Chair s3=new Chair(1000,"rs brand",1,"iron");
		
		HashMap<Integer,Chair> chairs=new HashMap<>();
		  chairs.put(101, s1);
		  chairs.put(102, s2);
		  chairs.put(103, s3);
		
		 for(Integer s:chairs.keySet()) {
			System.out.println(s);
		}
		 for(Chair s:chairs.values()) {
			 System.out.println(s);
		 }
		 Iterator a=chairs.keySet().iterator();
		 while(a.hasNext()) {
			 System.out.println(a.next());
		 }
		 
		 Iterator b= chairs.values().iterator();
		 while(b.hasNext()) {
			 System.out.println(b.next());
		 }
		 
		 chairs.forEach((k,v)->System.out.println(k+" "+v));
	 
		
		
		
		
	}

}
