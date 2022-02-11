package lovalaxmi999;

public class Subbank extends poliBank {
	int loan(int a,int b,int c) {
		return a+b;
		
	}
	public static void main(String args[]) {
		Subbank c= new Subbank();
		System.out.println(c.loan(20,39));
		System.out.println(c.loan(23,30,10));
	}

}
