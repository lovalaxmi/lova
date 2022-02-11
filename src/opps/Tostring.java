package opps;

public class Tostring {
private	String name;
	private int id;
	private long fee;
	public int getid() {
		return id;
	}
	public long getfee() {
		return fee;
}
	public String getname() {
		return name;
		}
	
	public void setid(int id) {
		this.id=id;
	}
	public void setfee(long fee) {
		this.fee=fee;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public Tostring (String name,int id,long fee){
		this.name=name;
		this.id=id;
		this.fee=fee;
	}
	public String toString() {
		return "Tostring[name="+name+" "+"id="+id+" "+"fee="+fee+"]";
	}

}
