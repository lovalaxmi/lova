package Comparable;

import java.util.Comparator;

public class Student4 implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.collegeName.compareTo(o2.collegeName);
	}
	

}
