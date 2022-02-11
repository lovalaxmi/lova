package Hasmaps;

public class Employ {
	int id;
	
	String name;
	long salary;
	
	Employ(int id,String name,long salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		
		
	}
	public String toString() {
		return "Employ[id="+id+"name="+name+"salary="+salary+"]";
	}
	
	
}
