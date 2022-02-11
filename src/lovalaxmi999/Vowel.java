package lovalaxmi999;

public class Vowel {
	public static void main(String args[]) {
	String s="lova laxmi";
    int a=0;
	int b=0;
	char[] d=s.toCharArray();
	for(int i=0;i<s.length();i++)
	{
		if(d[i]=='a'||d[i]=='e'||d[i]=='o'||d[i]=='u')
		{
			
			a++;
		}
		else
		{
		
			b++;
		}
		
	}
	System.out.println(a+"vowels");
	System.out.println(b+"non vowels");
	}

}
