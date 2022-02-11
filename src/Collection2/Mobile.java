package Collection2;

public class Mobile implements Comparable<Mobile> {
	int id;
	int price;
	String brand;
	
	public Mobile(int id, int price, String brand) {
		
		this.id = id;
		this.price = price;
		this.brand = brand;
	}
	public String toString()  {
		return "Mobile[id="+id+"price="+price+"brand="+brand+"]";
		
	}
	@Override
	public int compareTo(Mobile m1) {
		//return this.id-m1.id;
		//return this.price-m1.price;
		
		return this.brand.compareTo(m1.brand);
				
		         
	}
}
