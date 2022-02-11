package lovalaxmi999;

public class OVerloadingParameters {
	int add1(int a, int b) {
	return a+b;
	}
	int add1(int d, int e, int f) {
		return d+e+f;
	}
	public static void main(String args[]) {
		OVerloadingParameters s= new OVerloadingParameters();
		System.out.println(s.add1(20, 30));
		System.out.println(s.add1(20,20,20));
	}

}
