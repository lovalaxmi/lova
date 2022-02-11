package opps;

public class Wheel {
	private String brand;
	private int price;
	Wheel(String brand,int price)
	{
		this.brand=brand;
		this.price=price;
	}
	public String toString() {
		return brand+" " +price; 
	}
}
