package lovalaxmi999;

public class primenum {
	public static void main(String args[]) {
		int num=5;
	boolean flage=true;
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			flage=false;
		}}
	if(flage==true) {
		System.out.println("its prime");
				
		}
	else {
		System.out.println("its not a prime");
	}
	}

}
