package methods;

public class method1   {
	void add() {
		System.out.println(50+50);
	}
	void sub() {
		System.out.println(50-10);
		
	}		void name(String a,String b )
		{
     System.out.println(a+" "+b);
		}
	int data(int a,int b) {
		return a+b;
	}
	String data2(String a,String b) {
		return a+b;
	}
	
	public static void main(String args[]) {
		method1 s= new method1();
		s.add();
		s.sub();
		s.name("laxmi","lova");
		s.data(10, 20);
		s.data2("laxmi","lova");
	}
	
}

