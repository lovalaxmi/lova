package polomrprisham;

public class sample {
	int  sample1(int a, int b) {
		return (a+b);
	}
	int sample1(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String args[]) {
		sample s=new sample();
		System.out.println(s.sample1(20, 20));
		System.out.println(s.sample1(32, 23, 20));
	}

}
