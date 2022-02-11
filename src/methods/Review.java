package methods;

public class Review {
	String data() {
		return ("lova"+" "+"laxmi");	
		}
	int data1() {
		return 10+20;
	}
	long data2() {
		return (100000l+20000l);
	}
	float data3() {
		return 123.09f+123.09f;
	}
	String a() {
		return ("bc"+"cd");
	}
	
	
	public static void main(String args[]) {
		Review s= new Review();
		System.out.println(s.data());
		System.out.println(s.data1());
		System.out.println(s.data2());
		System.out.println(s.data3());
	    System.out.println(s.a());
		
	}

}
