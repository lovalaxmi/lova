package polomrprisham;

public class OverridingTest2 extends Overridingtest {
	
	int add() {
		return 200;
	}
public static void main(String args[]) {
	OverridingTest2 s=new OverridingTest2();
	System.out.println(s.add());
	
}
}
