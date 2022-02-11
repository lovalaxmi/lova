package opps;

public class USeclassbus {
	public static void main(String args[]) {
		Wheel a=new Wheel("r15",20000);
		Wheel a1=new Wheel("apple",30000);
		Wheel[] wheel= {a,a1};
		Engine engine=new Engine(450000,"silver");
		Bus s=new Bus("abi bus",200,45,wheel,engine);
		System.out.println(s);
	}

}
