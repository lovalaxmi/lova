package Hasmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Useclassemploy {
	public static void main(String args[]) {
		Employ s1=new Employ(12,"laxmi",30000l);
		Employ s2=new Employ(13,"lova",35000);
		Employ s3 =new Employ(14,"siri",20000);
		

		//emp1.add(s1);
		//emp1.add(s2);
		//emp1.add(s3);
		//for(int i=0;i<emp1.size();i++) {
		//	System.out.println(emp1.get(i));
		//}
		
		
		
		
		System.out.println("*****");
		
		
		ArrayList<Employ> emp1= new ArrayList<>();
		
		HashMap<Integer,Employ> emp=new HashMap<>();
		emp.put(101, s1);
		emp.put(102, s2);
		emp.put(103, s3);
		
		
		for(Integer s:emp.keySet() ) {
			
			emp1.add(s3);
			System.out.println(s3);
			
		}
		for(Employ s:emp.values()) {
			System.out.println(s);
		}
		Iterator a=emp.keySet().iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		Iterator w=emp.values().iterator();
		
		while (w.hasNext()) {
			System.out.println(w.next());
		}
		
		emp.forEach((k,v)->System.out.println(k+" "+v));
		
		
		
	}

}
