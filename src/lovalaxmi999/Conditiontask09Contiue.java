package lovalaxmi999;

public class Conditiontask09Contiue {
	public static void main(String args[]) {
		
		Conditiontask01 s=new Conditiontask01 ();
		Conditiontask01  a=new Conditiontask01 ();
		Conditiontask01  d=new Conditiontask01 ();
		Conditiontask01 f=new Conditiontask01 ();
		Conditiontask01 g=new Conditiontask01 ();
		s.teachers =10;
		s.isschoolisgood=true;
		s.fee=30000.5f;
		s.schoolName="chaitany";
		s.section='a';
		s.schoolStrength=10000l;
		
		a.teachers=20;
		a.isschoolisgood =true;
		a.section='b';
		a.schoolStrength=20000l;
		a.schoolName="prathiba";
		a.fee=20000.87f;
		
		d.teachers=30;
		d.isschoolisgood=true;
		d.schoolName="gayathri";
		d.section='c';
		d.fee=10000.65f;
		d.schoolStrength=17000l;
		
		f.teachers=20;
		f.fee=2300.09f;
		f.isschoolisgood =true;
		f.schoolStrength=20000l;
		f.section='a';
		f.schoolName="roy";
		f.schoolName="zph";
		
		g.fee=2300.0f;
		g.isschoolisgood=true;
		g.schoolName="laxmi";
		g.schoolStrength=1222l;
		g.section='c';
		g.teachers=34;
		System.out.println(d.fee+" "+d.schoolName+" "+d.schoolStrength+" "+d.section+d.teachers);
		
		Conditiontask01 s2[]= {s,d,a,f,g};
	System.out.println(s.schoolName);
	System.out.println(s2[0].schoolName+" "+s2[0].fee+" "+s2[0].schoolStrength+" "+s2[0].teachers+" "+s2[0].section+" "+s2[0].isschoolisgood);
    System.out.println(s2[1].fee+" "+s2[1].schoolName+" "+s2[1].schoolStrength+" "+s2[1].fee+" "+s2[1].isschoolisgood);
	 System.out.println(s2[2].fee+" "+s2[2].schoolName+" "+s2[2].schoolStrength+" "+s2[2].fee);
System.out.println(s2[0].schoolName+(s2[0].fee>s2[1].fee)+" "+(s2[0].fee>s2[2].fee)+" "+(s2[0].fee>s2[3].fee)+" "+(s2[0].fee>s2[4].fee));
System.out.println(s2[1].schoolName+" "+(s2[1].fee>=s2[0].fee)+" "+(s2[1].fee>=s2[2].fee)+" "+(s2[1].fee>=s2[3].fee)+" "+(s2[1].fee>=s2[4].fee));
System.out.println(s2[2].schoolName+" "+(s2[2].fee>s2[0].fee)+" "+(s2[2].fee>s2[1].fee)+" "+(s2[2].fee>s2[3].fee)+" "+(s2[2].fee>s2[4].fee));
	
if(s2[0].fee>s2[1].fee)
{
	System.out.println(s2[0].schoolName+":"+"high");
	
}

if(s2[0].fee>s2[2].fee) {
	System.out.println(s2[0].schoolName+"greater");
}
else
{
	System.out.println(s2[0].schoolName+"lesser");
	
}
if(s2[0].fee>s2[1].fee) {
	System.out.println(s2[0].schoolName+"greater");
}
else
{
	System.out.println(s2[0].schoolName+"lesser");
}
	if((s2[0].fee>s2[1].fee)&&(s2[0].fee>s2[2].fee)&&(s2[0].fee>s2[3].fee)&&(s2[0].fee>s2[4].fee)){
		System.out.println(s2[0].schoolName+"highfee");
	}
	else
	{
		System.out.println(s2[0].schoolName+"low fee");
	}
	if((s2[1].fee>s2[0].fee)&&(s2[1].fee>s2[2].fee)&&(s2[1].fee)
	}
}
