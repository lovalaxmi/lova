package lovalaxmi999;

public class add2 extends OverridingAdd{
	int num2(int c,int d,int e) {
	return c+d+e;
			
	}
	public static void main(String args[]) {
		add2 d= new add2();
		System.out.println(d.num1(30,20));
		System.out.println(d.num2(23, 23, 23));
	}

}
