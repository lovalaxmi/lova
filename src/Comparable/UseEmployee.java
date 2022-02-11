package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseEmployee {
	public static void main(String args[]) {
		Employee a1=new Employee(101,"lova",30000,"developer",5);
		Employee a2=new Employee(102,"laxmi",20000,"hacking",3);
		Employee a3=new Employee(103,"akash",500000,"ceo",10);
		ArrayList<Employee> s=new ArrayList<>();
		s.add(a1);
		s.add(a2);
		s.add(a3);
		System.out.println(s);
		
		System.out.println("** comparatorto id**");
		Collections.sort(s,new Employe1());
		for(Employee q:s) {
			System.out.println(q);
		}
		System.out.println("**Comparatorto name");
		Collections.sort(s,new Employe2());
		Iterator a=s.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		System.out.println("** comparator salary**");
		Collections.sort(s,new Employe3());
		for(Employee w:s) {
			System.out.println(w);
		}
		System.out.println("** comparator designation**");
		Collections.sort(s,new Employee4());
		for(Employee t:s) {
			System.out.println(t);
		}
		System.out.println("** comapable**");
		Collections.sort(s);
		for(Employee f:s) {
			System.out.println(f);
		}
		
	}

}
