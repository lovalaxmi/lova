package Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class UseStudent {
	public static void main(String args[]) {
		Student s1=new Student("lova",9,"mech","kiet",79,6);
		Student s2=new Student("laxmi",5,"ece","kietw", 80,5);
		Student s3=new Student("akash",7,"cse","kiet+",60,6);
		ArrayList<Student> a=new ArrayList<>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
	for(Student b:a) {
		System.out.println(b);
	}
	System.out.println("***");
	Iterator s=a.iterator();
	while(s.hasNext()) {
		System.out.println(s.next());
	}
  System.out.println("-----------name compare-----------");
Collections.sort(a,new Student1());
for(Student d:a) {
	System.out.println(d);
}
System.out.println("***int compare***");
Collections.sort(a,new Student2());
for(Student w:a) {
	System.out.println(w);
}
System.out.println("*** comparable ****");
Collections.sort(a);
for(Student g:a) {
	System.out.println(g);
}
System.out.println("**comparator String***");
	Collections.sort(a,new Student3());	
	for(Student q:a) {
		System.out.println(q);
	}
	System.out.println("***Comare String college***");
	Collections.sort(a,new Student4());
	for(Student j:a) {
		System.out.println(j);
	}
	System.out.println("***Compareator int marks***");
	Collections.sort(a,new Student5());
	a.forEach(y->System.out.println(y));
	System.out.println("*** comerator int height***");
	
	Collections.sort(a,new Student6());
	a.forEach(u->System.out.println(u));
	
	}

}
