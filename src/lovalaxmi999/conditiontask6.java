package lovalaxmi999;

public class conditiontask6 {

	String brand;
	
	String model;
	String color;
	public static void main(String args[]) {
		
	
	conditiontask6 s=new  conditiontask6();
	conditiontask6 d= new conditiontask6();
	conditiontask6 a= new conditiontask6();
	s.brand="yzx";
	s.model="ls";
	s.color="white";
	
	d.brand="tvs";
	d.model="rvs";
	d.color="blue";
	
	a.brand="xl";
	a.model="pulser";
	a.color="black";

	
	String arr1[]= {s.brand ,s.model,s.color};
    String arr2[]= {d.brand,d.model,d.color};
	String arr3[]= {a.model,a.model,a.color};
	System.out.println(arr1);
	System.out.println(arr2);
	System.out.println(arr3);
	
	}
}
