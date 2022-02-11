package Collection;

import java.util.ArrayList;
import java.util.Iterator;




public class Sample1 {
	public static void main(String args[]) {
		ArrayList<Integer> li=new ArrayList<>();
		li.add(35);
		li.add(40);
		li.add(65);
		li.add(72);
		
		for(int i=0; i<li.size();i++) {
			System.out.println(li.get(i));
		}
		for(Integer b:li) {
			System.out.print(b+" ");
			
		}
		
		
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		li.forEach(m->System.out.print(m+" "));
	}
	

}
