package polomrprisham;

public class Sample2 {
String data1(String a,String b) {
	return (a+b);
}
int data1(int a,int b,int c) {
	return a+b+c;
}
	public static void main(String args[]) {
		Sample2 s= new Sample2();
		System.out.println(s.data1("laxmi", "lova"));
		System.out.println(s.data1(12, 13, 14));
	}
}

