package lovalaxmi999;

public class Hirgoat extends Hiranimals {
	void sleeping() {
		System.out.println("goat sleeping");
	}
	public static void main(String args[]) {
		Hirgoat s=new Hirgoat();
		Hircat a= new Hircat();
		Hiranimals q= new Hiranimals();
		s.sleeping();
		a.drink();
		q.dog();
	}

}
