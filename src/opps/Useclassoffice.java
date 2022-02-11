package opps;

public class Useclassoffice {
	public static void main(String args[]) {
		Experiance a= new Experiance(2,30000.09f);
		Experiance a1=new Experiance(3,50000.89f);
		Experiance[] experiance = {a,a1};
		Details details =new Details("lovalaxmi",7009269); 
		Office s=new Office("tcs",32123l,experiance,details);
		System.out.println(s);
	}

}
