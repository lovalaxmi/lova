package Comparable;

public class Student implements Comparable<Student > {
	String name;
	int id;
	String branch;
	String collegeName;
	int marks;
	int height;
	
	Student(String name,int id,String branch,String collegeName,int marks,int height) {
		this.name=name;
		this.id=id;
		this.branch=branch;
		this.collegeName=collegeName;
		this.marks=marks;
		this.height=height;
	}
	public String toString() {
		return name+" "+id+" "+branch+" "+collegeName+" "+marks+" "+height;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.marks-o.marks;
	}
	
	
}
