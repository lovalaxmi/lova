package lovalaxmi999;

public class ConstcutorStudent {
	int students;
	float fee;
	String name;
	ConstcutorStudent(int students,float fee,String name){
		this.students=students;
		this.fee=fee;
		this.name=name;
	}
	void studentList() {
		System.out.println(students+" "+fee+" "+name);
	}
	public static void main(String args[]) {
		ConstcutorStudent s= new ConstcutorStudent(12,100.3f,"laxmi");
		s.studentList();
		
	}

}
