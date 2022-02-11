package lovalaxmi999;

public class Overloademploy {
	long salary(long a, long  b) {
		return a+b;
	}
	long salary(long month3,long month4,long month5) {
		return month3+month4+month5;
	
	}
	public static void main(String args[]) {
		Overloademploy r= new Overloademploy();
		System.out.println(r.salary(30000l,300000l));
		System.out.println(r.salary(35000l,35000l,40000l));
		
	}

}
