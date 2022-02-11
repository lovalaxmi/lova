package lovalaxmi999;

public class forloopskip2 {
public static void main(String args[]) {
	for(int i=0;i<=10;i=
			i+2)
	{
			System.out.println(i);
	}
	System.out.println("----Arrqay---------");
	int a[]= {1,2,3,4,5};
	for(int i=(a.length-1);0<=i;i--) {
	System.out.println(a[i]);	
	}
	System.out.println("------array in String-----");
	
	String s[]= {"laxmi","lova","raji","bhanu"};
	for(int i=0;i<s.length;i++) {
		System.out.println(s[i]);
	}
	System.out.println("====char in array====");
	char c[]= {'a','b','c','d','e'};
	for(int i=0;i<c.length;i++) {
		System.out.println(c[i]);
	}
	System.out.println("====reverse====");
	String s1[]= {"laxmi","lova","akash","rishi"};
	for(int i=(s1.length-1);0<=i;i--) {
		System.out.println(s1[i]);
	}
	System.out.println("=====100 numbers====");
	int sum=0;
	for(int i=1;i<=100;i++)
	{	
	sum=sum+i;
		}
	System.out.println(sum);
}

}