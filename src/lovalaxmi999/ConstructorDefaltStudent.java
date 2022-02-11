package lovalaxmi999;

public class ConstructorDefaltStudent {
	String name;
	int id;
	void display() {
		System.out.println(name+" "+id);
	}
	public static void main(String args[]) {
		ConstructorDefaltStudent s= new ConstructorDefaltStudent();
		s.display();
	}
	

}
