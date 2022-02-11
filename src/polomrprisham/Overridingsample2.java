package polomrprisham;

public class Overridingsample2 extends Overridingsample1 {
	int add(int a ,int b) {
		return a+b;
	}
	public static void main(String args[]) {
		Overridingsample2 s=new Overridingsample2();
		System.out.println(s.add(10, 20));
	}
	

}
