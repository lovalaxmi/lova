package Comparable;

import java.util.Comparator;

public class Employee4 implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.designation.compareTo(o2.designation);
	}

}
