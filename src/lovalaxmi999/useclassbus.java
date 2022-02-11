package lovalaxmi999;

public class useclassbus {
	public static void main(String args[]) {
		Bus s1=new Bus();
		Bus s2=new Bus();
		Bus s3=new Bus(); 
		Bus s4= new Bus();
		Bus s5 =new Bus();
		Bus s6=new Bus();
		Bus s7=new Bus();
		s1.name="abi bus";
		s1.busNum=1;
		s1.passangers=100l;
		s1.isjournygood=true;
		
		s2.name="kaveri bus";
		s2.busNum=2;
		s2.passangers=150l;
		s2.isjournygood=true;
		
		s3.name="lovely bus";
		s3.busNum=1;
		s3.passangers=200l;
		s3.isjournygood=true;
		
		s4.name="royal bus";
		s4.busNum=3;
		s4.passangers=2500l;
		s4.isjournygood=false;
		
		s5.name="red bus";
		s5.busNum=4;
		s5.passangers=300l;
		s5.isjournygood=true;
		
		s6.name="star bus";
		s6.busNum=1;
		s6.passangers=1000l;
		s6.isjournygood=true;
		
		s7.name="double bus";
		s7.busNum=1;
		s7.passangers=100l;
		s7.isjournygood=true;
		
	    Bus a[]= {s1,s2,s3,s4,s5,s6,s7};
	    for(int i=0;i<a.length;i++) {
	    	System.out.println(a[i].name+" "+a[i].busNum+a[i].passangers+" "+a[i].isjournygood);
	    	
	    }
	    
		
	}

}
