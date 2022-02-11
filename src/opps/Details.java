package opps;

public class Details {
private String empname;
private int employid;
Details (String empname,int employid ){
	this.employid=employid;
	this.empname=empname;
}
public String toString() {
	return "empname="+empname+"  "+"employid="+employid;
}
}
