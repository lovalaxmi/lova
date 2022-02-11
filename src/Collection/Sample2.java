package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample2 {
	public static void main(String args[]) {
		
	
	ArrayList<String> s=new ArrayList<>();
	s.add("laxmi");
	s.add("lova");
	s.add("radha");
	s.add("siri");
	for(int i=0;i<s.size();i++) {
		System.out.println(s.get(i));
	}
	
	for(String b:s) {
		System.out.println(b);
	}
	Iterator a=s .iterator();
	while(a.hasNext()) {
		System.out.println(a.next());
	}
	s.forEach(m->System.out.println(m));
	
	
	}
	

}
