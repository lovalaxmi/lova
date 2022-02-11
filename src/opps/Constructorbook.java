package opps;

public class Constructorbook {
	String bookName;
	long price;
	int pages;
	Constructorbook(String bookName,long price, int pages){
		this.bookName=bookName;
		this.pages=pages;
		this.price=price;
	}
	void display() {
		System.out.println(bookName+" "+pages+" "+price);
	}

}
