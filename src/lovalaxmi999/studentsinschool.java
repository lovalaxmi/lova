package lovalaxmi999;

public class studentsinschool extends teachers {
	void students() {
		System.out.println("students");
	}
	public static void main(String args[]) {
		studentsinschool h= new studentsinschool();
		h.school();
		h.teachers();
		h.students();
	}

}
