package lovalaxmi999;

public class CalulatorWithReturn{
  int div() {
	int a=32;
	int b=456;
	int c=a/b;
	System.out.println(c);
	return c;
	
}
int mul() {
	int a=32;
	int b=32;
	int c=a*b;
	System.out.println(c);
	return c;
}
int  add() {
	int a=34;
	int b=43;
	int c=a+b;
	System.out.println(c);
	return c;
	
}
int sub() {
	int a=43;
	int b=10;
	int c=a-b;
	System.out.println(c);
	return c;
	
}
public static void main(String args[]) {
	CalulatorWithReturn r= new CalulatorWithReturn();
	r.div();
	r.mul();
	r.sub();
	r.add();
	
}
}
