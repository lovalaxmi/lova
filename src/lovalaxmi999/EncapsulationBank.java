package lovalaxmi999;

public class EncapsulationBank {
	private long accno;
	private float bal;
	private String name;
	public long getAccno() {
		return accno;
		
	}
	public void setAccno(long accno) {
		this.accno=accno;
	}
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal=bal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public static void main(String args[]) {
		EncapsulationBank s= new EncapsulationBank();
		s.setAccno(123457l);
		s.setBal(123000.2f);
		s.setName("laxmi");
		System.out.println(s.getAccno());
		System.out.println(s.getBal());
		System.out.println(s.getName());
		
		
		
	}
	

}
