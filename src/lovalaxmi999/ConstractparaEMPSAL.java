package lovalaxmi999;

public class ConstractparaEMPSAL {
	String name;
	int id;
	ConstractparaEMPSAL(String name,int id){
		this.name=name;
		this.id=id;
	}
	void empsalary() {
		System.out.println(name+" "+id);
	}
	public static void main(String args[]) {
		ConstractparaEMPSAL s= new ConstractparaEMPSAL("laxmi",9);
		s.empsalary();
		
	}
}
