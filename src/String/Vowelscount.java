package String;

import java.util.Arrays;

public class Vowelscount {
	public static  void main(String args[]) {
		
	
	String s="in132lova6575678900";
	int count =0;
	for(int i=0;i<s.length();i++) {
		char a=s.charAt(i);
		if(a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'|a=='7'||a=='8'||a=='9'||a=='0')
		{
			count++;
		}
		
	}
	System.out.println(count);
	
	System.out.println(s.indexOf("l"));
	char[] d=s.toCharArray();
	System.out.println(Arrays.toString(d));
	
	String x="lova123, laxmi, rishi";
	String j[]=x.split(" ");
	System.out.println(Arrays.toString(j));
	String z[]= {"laxmi","lova","ram"};
	System.out.println(Arrays.toString(z));
	
	
	}
}
