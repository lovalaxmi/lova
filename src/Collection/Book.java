package Collection;

public class Book {
	int price;
	String name;
	long pages;
	Book(int price,String name,long pages){
		this.price=price;
		this.name=name;
		this.pages=pages;
		}
	public String toString() {
		return "Book[price="+price+"name="+name+"pages="+pages+"]";
	}

}
