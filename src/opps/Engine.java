package opps;

public class Engine {
	private int price;
	private String color;
	Engine(int price,String color){
		this.price=price;
		this.color=color;
	}
	public String toString() {
		return "engine[price="+price+"brand="+color+"]";
	}

}
