package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Useclassstudent {
	public static void main(String args[]) {
		Student s1= new Student("lova",123,"female",23);
		Student s2=new Student("laxmi",91,"female",22);
		Student s3=new Student("hari",20,"male",19);
		Student s4=new Student("ram",45,"male",25);
		
		
		ArrayList<Student> students= new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		for(int i=0;i<students.size();i++) {
			System.out.println(students.get(i));
		}
		for(Student s:students) {
			System.out.println(s);
			
			}
		Iterator a=students.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
			
		}
		students. forEach(m->System.out.println(m));
		
	}

}
