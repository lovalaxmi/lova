package lovalaxmi999;

public class Conditiontask7 {
	String brand;
	float height;
	float width;
	String material;
	public static void main(String args[]) {
		Conditiontask7 s= new Conditiontask7();
		s.brand="rs barnd";
		s.height=10.8f;
		s.width=10.8f;
		s.material="plastic";
		if(s.height==s.width) {
			System.out.println("square board");
		}
		else
		{
			System.out.println("SQUARE BOARD");
		}
		if(s.material=="plastic"){
		System.out.println("HEAVY BOARD");
		}
		else
		{
			System.out.println("DURABLE BOARD");
		}
	}

}
