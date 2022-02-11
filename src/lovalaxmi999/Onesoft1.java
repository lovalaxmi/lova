package lovalaxmi999;

public class Onesoft1 {
	public static void main(String args[]) {
		Onesoft s1=new Onesoft();
		Onesoft s2=new Onesoft();
		Onesoft s3=new Onesoft();
		s1.coursName="java";
		s1.coursefee=70000;
		System.out.println(s1.coursName+" "+s1.coursefee);
		
		s2.coursName="python";
		s2.coursefee=50000;
		System.out.println(s2.coursName+" "+s2.coursefee);
		
		s3.coursName="c++";
		s3.coursefee=20000;
		System.out.println(s3.coursName+" "+s3.coursefee);
		
		Onesoft a[]= {s1,s2,s3};
		System.out.println(a[0].coursName+" " +a[1].coursName+" "+a[2].coursName);
		System.out.println(a[0].coursefee+" "+a[1].coursefee+" "+a[2].coursefee);
		if(a[0].coursefee>a[1].coursefee) {
			System.out.println(a[0].coursName+" higher");
			}
		if(a[0].coursefee>a[2].coursefee) {
			System.out.println(a[0].coursName+"higher");
		}
		
		if(a[1].coursefee>a[0].coursefee) {
			System.out.println(a[1].coursName+"higher");
		}
		if(a[1].coursefee>a[2].coursefee) {
			System.out.println(a[1].coursName+"higher");
			}
		if(a[2].coursefee>a[0].coursefee) {
			System.out.println(a[2].coursName+"higher");
		}
		if(a[2].coursefee>a[1].coursefee) {
			System.out.println(a[2].coursName+"higher");
		}
		
	if(a[0].coursefee>a[1].coursefee) {
		System.out.println(a[0].coursefee+"high");
	}
	else
	{
		System.out.println(a[1].coursefee+"low");
	}
	if(a[0].coursefee>a[2].coursefee) {
		System.out.println(a[0].coursefee+"high");
	}
	else
	{
		System.out.println(a[2].coursefee+"low");
	}
	if(a[1].coursefee>a[0].coursefee) {
		System.out.println(a[1].coursefee+"high");
	}
	else
	{
		System.out.println(a[1].coursefee+"low");
			
		}
	if(a[1].coursefee>a[2].coursefee)
	{
		System.out.println(a[1].coursefee+"high");
		}
	else
	{
		System.out.println(a[1].coursefee+"low");
	}
	
	if((a[0].coursefee>a[1].coursefee)&&(a[0].coursefee>a[2].coursefee)) {
		System.out.println(a[0].coursefee+" "+"high");
	}
	else
	{
		System.out.println(a[0].coursefee+" "+" not high");
	}
	}

	}

