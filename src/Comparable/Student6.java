package Comparable;

import java.util.Comparator;

public class Student6 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.height-o2.height;
	}

}
