package lovalaxmi999;

public class Polimorphisim {
	void sum(int a,int b) {
		System.out.println(a+b);	
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String args[]) {
		Polimorphisim s= new Polimorphisim();
		s.sum(10,68);
		System.out.println(s.sum(20,30,10));
	}

}
