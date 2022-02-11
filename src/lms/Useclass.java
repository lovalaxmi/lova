package lms;

public class Useclass {
	public static void main(String args[]) {
		Mobile s=new Mobile();
		Mobile s1=new Mobile();
	//	Mobile s3=new Mobile();
	//	Mobile s4=new Mobile();
	//	Mobile s5=new Mobile();
		
		s.brand=args[0];
		s.model=args[1];
		s.imei=Long.parseLong(args[2]);
		s.weight=Integer.parseInt(args[3]);
		s.ram=Integer.parseInt(args[4]);
		s.price=Integer.parseInt(args[5]);
		s.isAndroid=Boolean.parseBoolean(args[6]);
		
		 s1.brand=args[0];
		 s1.model=args[1];
		 s1.imei=Long.parseLong(args[2]);
		 s1.weight=Integer.parseInt(args[3]);
		 s1.ram=Integer.parseInt(args[4]);
		 s1.price=Integer.parseInt(args[5]);
		 s1.isAndroid=Boolean.parseBoolean(args[6]);
		 
		
		Mobile a[]= {s,s1};
		
		System.out.println(a[0].brand+" "+a[0].model+" "+a[0].imei+" "+a[0].weight+" "+a[0].ram+" "+a[0].price+" "+a[0].isAndroid);
		System.out.println(a[1].brand+" "+a[1].model+" "+a[1].imei+" "+a[1].weight+"" +a[1].ram+" "+a[1].brand+" "+a[1].isAndroid);
	}

}
