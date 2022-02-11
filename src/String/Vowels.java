package String;

public class Vowels
{
	public static void main(String args[])
	{
	 String s="lovalaxmi";
	 
	int count=0;
	for(int i=0;i<s.length();i++)
	{
		char a=s.charAt(i);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') 
		{
	
       count++;
		}	 
	 }
	System.out.println(count);
	}
	
	
	
	
}
