package opps;

public class Encapsilation {
	private String schoolName;
	private long students;
	private float fee;
	public String getschoolname() {
		return schoolName;
	}
	public long getstudents() {
		return students;
		
	}
	public float getfee() {
		return fee;
	}
public void setschoolName(String schoolName) {
this.schoolName=schoolName;
}
public void setstudents(long students)
{
	this.students=students;
}
public void setfee( float fee) {
	this.fee=fee;
}
}

