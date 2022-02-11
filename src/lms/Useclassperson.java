package lms;

public class Useclassperson {
	public static void main(String args[]) {
		Person s=new Person();
		s.name=args[0];
		s.height=Float.parseFloat(args[1]);
		s.weight=Integer.parseInt(args[2]);
		s.contactno=Long.parseLong(args[3]);
		s.age=Integer.parseInt(args[4]);
		
		System.out.println(s.name + " "+s.height+" "+s.weight+" "+s.contactno+" "+s.age);
		
	}

}
