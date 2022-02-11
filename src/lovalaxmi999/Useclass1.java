package lovalaxmi999;

public class Useclass1 {
	public static void main(String args[]) {
		Ac s1=new Ac();
		Ac s2=new Ac();
		s1.name="samsung";
		s1.price=18000l;
		s1.rating=4.5f;
		s1.weitht=46;
		s1.ison =true;
		
		s2.name="lg";
		s2.price=16000l;
		s2.rating=4.8f;
		s2.weitht=50;
		s2.ison=false;
		Ac a[]= {s1,s2};
		if(a[0].price>a[1].price) {
			System.out.println(a[0].name+" "+" price higher");
		}
		
	}

}
