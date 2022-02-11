package opps;

public class Costamclass {
	private int id;
	private String name;
	private Address add;
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	
	public Address getadd() {
		return add;
	}
	Costamclass(int id,String name,Address add){
		this.id=id;
		this.name=name;
		this.add=add;
}
	public String toString () {
		return id+name+add;
	}

}
