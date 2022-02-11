package lovalaxmi999;

public class Encapsulationoffice {
	private String officename;
	private long employStringth;
	private float employsalary;
public String getOfficename() {
	return officename;
}
public void setOfficenmae(String officename ) {
	this.officename=officename;
}
public long getEmploystringth() {
	return employStringth;
}
public void setEmploystringth(long employStringth) {
	this.employStringth=employStringth;
}
public float getEmploysalary() {
	return employsalary ;
	
}
public void setEmploysalary(float employsalary) {
	this.employsalary=employsalary;
}
public static void main(String args[]) {
	Encapsulationoffice s= new Encapsulationoffice();
	s.setOfficenmae("tcs");
	s.setEmploystringth(12000l);
	s.setEmploysalary(30000.09f);
	
	System.out.println(s.getOfficename());
	System.out.println(s.getEmploystringth());
	System.out.println(s.getEmploysalary());
	
}
}
