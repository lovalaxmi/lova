package lovalaxmi999;

public class conditiontest6 {
	String brand;
	float price;
	int legs;
	String color;
	boolean isrolling=true ;
public static void main(String args[]) {
	conditiontest6 s= new conditiontest6();
	conditiontest6 d= new conditiontest6();
	s.brand="rs brand";
	s.price=1000.7f;
	s.legs=4;
	s.color="black";
	s.isrolling =true;
	d.brand="ls brand";
	d.price=10000.6f;
	d.color="blue";
	d.isrolling=false;
	if(s.isrolling==d.isrolling) {
		System.out.println("BOTH ROLL");
	}
	else {
		System.out.println("NOPE");
	}
	float sum=d.price+s.price;
	System.out.println(sum);
			
}
}
