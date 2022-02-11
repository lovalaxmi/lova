package lovalaxmi999;

public class CalucaltorAll {
 div() {
	int a=32;
	int b=456;
	int c=a/b;
	System.out.println(c);
	
}
void mul() {
	int a=32;
	int b=32;
	int c=a*b;
	System.out.println(c);
}
void add() {
	int a=34;
	int b=43;
	int c=a+b;
	System.out.println(c);
	
}
void sub() {
	int a=43;
	int b=12;
	int c=a-b;
	System.out.println(c);
	
}
public static void main(String args[]) {
	CalucaltorAll r= new CalucaltorAll();
	r.div();
	r.mul();
	r.sub();
	r.add();
	
}
}
