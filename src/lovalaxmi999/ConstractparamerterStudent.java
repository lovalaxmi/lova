package lovalaxmi999;

public class ConstractparamerterStudent {
String name1;
String name2;
int id1;
int id2;
ConstractparamerterStudent(String name1,String name2, int id1,int id2){
	this.name1=name1;
	this.id1=id1;
	this.name2=name2;
	this.id2=id2;
	
}
	void display() {
		System.out.println(name1+" "+name2+" "+id1+" "+id2);
	}
	public static void main(String args[]) {
		ConstractparamerterStudent s= new ConstractparamerterStudent("laxmi","rishi",9,5);
		s.display();
	
}
}
