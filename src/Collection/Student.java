package Collection;

public class Student {
	String name;
	int id;
	String gender;
	int age;
	Student(String name,int id,String gender,int age){
		this.name=name;
		this.id=id;
		this.gender=gender;
		this.age=age;
	}
		public String toString() {
			return "Student[name="+name+"id="+id+"gender="+gender+"age="+age+"]";
		}

}
