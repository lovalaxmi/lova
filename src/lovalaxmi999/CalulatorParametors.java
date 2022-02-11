package lovalaxmi999;

public class CalulatorParametors {
	int add(int a, int b) {
		return a+b;
	}
	int sub (int a, int b) {
		return a-b;
		}
	int mul(int a, int b) {
		return a*b;
	}
	int div(int a, int b) {
		return a/b;	
	}
	public static void main (String args[]) {
		CalulatorParametors a=new CalulatorParametors();
		System.out.println(a.add(10,20));
		System.out.println(a.sub(10,20));
		System.out.println(a.mul(10,20));
		System.out.println(a.div(10,20));
		
		
	}
	

}
