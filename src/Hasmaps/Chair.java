package Hasmaps;

public class Chair {
	int price;
	String brand;
	int nooflegs;
	String material;
	Chair(int price,String brand,int nooflegs,String material){
		this.price=price;
		this.brand=brand;
		this.nooflegs=nooflegs;
		this.material=material;
		
	}
	public String toString() {
		return "chair[price="+price+"brand="+brand+"nooflegs="+nooflegs+"material="+material+"]";
	}
	

}
