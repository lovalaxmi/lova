package opps;

public class Address
{
	 int dNo;
	 String city;
	 long pincode;
	 
	 Address (int dNo,String city,long pincode)
	 {
		 this.dNo=dNo;
		 this.city="vizag";
		 this.pincode=531116l;
	 }
	 public String toString()
	 {
		 return dNo+city+pincode;
	 }

}
