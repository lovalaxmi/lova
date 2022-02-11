package lovalaxmi999;

public class Encclg {
	private long students;
	private float fee;
	private String name;
	public long getStudents() {
		return students;
	}
	public void setStudents(long students) {
		this.students=students;
	}
	public float getFee() {
		return fee;
		
	}
	public void setFee(float fee) {
		this.fee=fee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
		}
	public static void main(String args[]) {
		Encclg s= new Encclg();
		s.setStudents(16000l);
		s.setFee(50000.98f);
		s.setName("laxmi");
		System.out.println(s.getStudents());
		System.out.println(s.getFee());
		System.out.println(s.getName());
		
	
	}
}
