package lovalaxmi999;

public class MethodTest {
	void add()
			{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}
    void sub() 
    {
    	int s=12;
    	int d=12;
    	int v=s-d;
    	System.out.println(v);	
    	}
    void mul() {
    	int a=12;
    	int c=12;
    	int d=a*c;
    	System.out.println(d);
    	
    }
    int div() {
    	int s=12;
    	int b=34;
    	int c=s/b;
    	System.out.println(c);
    	return c;
    	
    }
    
    public static void main(String args[]) {
		MethodTest d= new MethodTest();
		d.add();
		d.sub();
		d.mul();
		d.div();
	}
}
