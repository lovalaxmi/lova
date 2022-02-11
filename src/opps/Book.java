package opps;

public class Book {
	private int price;
	private int pages;
	private String bookName;
	private String bookAuthor;
	public int getprice() {
		return price;
       }
	public int getpages() {
		return pages;
		
	}
	public String getbookName() {
		return bookName;
	}
	public String getbookAuthor() {
		return bookAuthor;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public void setpage(int page) {
		this.pages=page;
	}
		public void setbookName(String bookname) {
			this.bookName=bookname;
		}
		public void setbookAuthor(String bookAuthor) {
			this.bookAuthor=bookAuthor;
	}
		
	

}
