package opps;

public class Twostring {
	private String name;
	private int id;
	private long price;
	public String getname()
	{
		return name;
	}
	public int getid() {
		return id;
	}
	public long getprice() {
		return price;
	}
	Twostring (String name,int id,long price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
	public String toString() {
		return"TwoString[Name="+name+", Id="+id+", Price="+price+"]";
	}
}
