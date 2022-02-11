package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class UseclassBook {
	public static void main(String args[]) {
		Book s1= new Book(200,"java",2000l);
		Book s2=new Book(300,"python",3000l);
		Book s3=new Book(400,"c",1500l);
		
		ArrayList<Book> books=new ArrayList<>();
		books.add(s1);
		books.add(s2);
		books.add(s3);
		for(int i=0;i<books.size();i++) {
			
			if(books.get(i).pages>2000)
			System.out.println(books.get(i));
			
		}
			for(Book a:books) {
		System.out.print(a.name.toUpperCase());
		}
		Iterator a=books.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
			
		}
		books.forEach(m->System.out.print(m));
		
		
		
	}

}
