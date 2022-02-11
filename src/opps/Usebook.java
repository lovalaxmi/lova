package opps;

public class Usebook {
	public static void main(String args[]) {
		Book s=new Book();
		s.setprice(1000);
		s.setpage(2000);
		s.setbookName("java");
		s.setbookAuthor("laxmi");
		System.out.println(s.getprice()+" "+s.getpages()+" "+s.getbookName()+" "+s.getbookAuthor());
	}

}
