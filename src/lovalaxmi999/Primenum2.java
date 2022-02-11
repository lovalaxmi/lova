package lovalaxmi999;

public class Primenum2 {
	int pice;
	String brand;
	
	
		
	
	int resno;
	 
	public void getprimeornot() {
		
		 
		boolean flag=true;
		for(int i=2;i<this.resno;i++) {
			if((this.resno%i)==0) {
				flag=false;
			}
		}
		if((flag==true)) {
			System.out.println("its prime");
		}
		else {
			System.out.println("its not aprime num");
		}
	}
	
	}
	
	
	
	
	

	

