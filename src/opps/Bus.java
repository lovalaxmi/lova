package opps;

import java.util.Arrays;

public class Bus {
	private String name;
	private int ticketPrice;
	private int sets;
	private Wheel[] wheel;
	private Engine engine;
	
	public String getbusName() {
		return name;
	}
	public int getticketPrice() {
		return ticketPrice;
	}
	public int getsets() {
		return sets;
	}
		public  Wheel[] getwheel() {
			return wheel;
		}
	
Bus(String name,int ticketPrice,int sets,Wheel[] wheel,Engine engine){
	this.name=name;
	this.ticketPrice=ticketPrice;
	this.sets=sets;
	this.wheel=wheel;
	this.engine=engine;
	
}
public String toString() {
	return "Bus[name="+name+" "+"ticketPrice="+ticketPrice+" "+"sets="+sets+" "+"wheel="+Arrays.toString(wheel)+"engine="+engine+"]";
}

}
