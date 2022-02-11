package methods;

public class Arguments
{
	 void add() {
		  int a=90,b=10;
		  System.out.println(a+b);
      }
	 void add3(int c,int d) {
		 System.out.println(c+d);
	 }
		 
		 int add1() {
			 int a1=100;
			 int b1=20;
			 return a1+b1;
			  }
		 int add2 (int x,int m ,int n) {
			return x+m+n;
			 
		 }
		 public static void main(String args[]) {
			 Arguments k=new Arguments();
			 k.add();
			 k.add3(16,20);
			System.out.println( k.add1());
			System.out.println (k.add2(10, 20, 30));
			 
		 }
	 
		
		
		

}
