package lovalaxmi999;

public class Useclass {
	public static void main(String args[]) {
		Mobile s1=new Mobile();
		Mobile s2=new Mobile();
		Mobile s3=new Mobile();
		Mobile s4=new Mobile();
		Mobile s5=new Mobile();
		s1.name="opp";
		s1.brand="ms brand";
		s1.price=70000l;
		s1.batteryLife=9;
		s1.iswaterproof=true;
		
		s2.name="apple";
		s2.brand="xs brand";
		s2.batteryLife=3;
		s2.price=50000l;
		s2.brand="rs brand";
		s2.iswaterproof=true;
		
		s3.name="realme";
		s3.brand="rl brand";
		s3.iswaterproof=false;
		s3.price=24000l;
		s3.batteryLife=5;
		
		s4.name="lenovo";
		s4.brand="ll brand";
		s4.price=5000l;
		s4.batteryLife=7;
		s4.iswaterproof=false;
		
		s5.name="royal";
		s5.brand="rr brand";
		s5.price=12000l;
		s5.batteryLife=5;
		s5.iswaterproof=false;
		
	Mobile	 a[]= {s1,s2,s3,s4,s5};
	
		
		
		
		
		System.out.println(a[0].batteryLife+" "+a[0].brand+" "+a[0].name+" "+a[0].price+" "+a[0].iswaterproof);
		
		
		
		System.out.println(a[1].name+" "+a[1].brand+" "+a[1].price+" "+a[1].batteryLife+" "+a[1].iswaterproof);
	    System.out.println(a[2].name+" "+a[2].brand+" "+a[2].price+" "+a[2].batteryLife+" "+a[2].iswaterproof);
	    //condition
		if(a[0].price>10000) {
			System.out.println(a[0].name+" "+"greater than 10000");
		}
		if(a[1].price>10000)
		{
			System.out.println(a[1].name+" "+"greate than 10000");
		}
		if(a[2].price>10000) {
			System.out.println(a[2].name+" "+"greater than 10000");
		}
       if(a[3].price>10000) {
    	   System.out.println(a[3].name+" "+" greater than 10000");
       }
       if((a[0].batteryLife>a[1].batteryLife)&&(a[0].batteryLife>a[2].batteryLife)&&(a[0].batteryLife>a[3].batteryLife)&&(a[0].batteryLife>a[4].batteryLife))
{
	    System.out.println(a[0].name+" "
	    		+ " "+"heavy life time");
	    
		}
       if((a[1].batteryLife>a[0].batteryLife)&&(a[1].batteryLife>a[0].batteryLife)&&(a[1].batteryLife>a[2].batteryLife)&&(a[1].batteryLife>a[3].batteryLife)&&(a[1].batteryLife>a[4].batteryLife)) {
    	   System.out.println(a[1].name+" "+"heavy life time ");
       }
       
       
	}
}
