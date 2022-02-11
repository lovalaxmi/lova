package Collection;

public class Mobile {
	String brand;
	String model;
	int ram;
	int price;
	boolean isAndroid;
	public String getbrand() {
		return brand;
		}
	public String getmodel() {
		return model;
	}
	public int getram() {
		return ram;
	}
	public boolean  getisAndroid() {
    return isAndroid;
}
	public int getprice() {
		return price;
	}
	public String setbrand() {
		return brand;
	}
	public String setmodel() {
		return model;
	}
	public int setram() {
		return ram;
	}
	public boolean setisAndroid() {
	return isAndroid;
}
	public int setprice() {
		return price;
	}
	Mobile(String brand,String model,int ram ,int price,boolean isAndroid ){
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.ram=ram;
		this.isAndroid=isAndroid;
	}
	
	
	
	
	
}