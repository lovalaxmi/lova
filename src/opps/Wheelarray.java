package opps;

public class Wheelarray {
	int price;
	String brand;
	
	Wheelarray(int price,String brand){
		this.price=price;
		this.brand=brand;
	}
	public String toString() {
		return "wheel[brand="+brand+" "+"price="+price+"]";
				
	}
}
