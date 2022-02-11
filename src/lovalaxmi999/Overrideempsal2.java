package lovalaxmi999;

public class Overrideempsal2 extends Overrideempsalary {
	long empsalary2(long month1,long month2,long month3) {
		return month1+month2+month3;
	}
	public static void main(String args[]) {
		Overrideempsal2 s= new Overrideempsal2();
		System.out.println(s.empsalary(20000l,20000l));
		System.out.println(s.empsalary2(10000l,10000,100000));
	}

}
