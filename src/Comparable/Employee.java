package Comparable;

public class Employee implements Comparable<Employee>  {
	int id;
	String name;
	int salary;
	String designation;
	int experiance;
	Employee(int id,String name,int salary,String designation,int experiance){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
		this.experiance=experiance;
	}
	public String toString() {
		return "name="+name+" "+"id="+id+" "+"salary="+salary+" "+"designation="+designation+" "+"experiance="+experiance;
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.experiance-o.experiance;
	}
	
	

}
