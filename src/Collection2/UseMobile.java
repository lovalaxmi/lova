package Collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class UseMobile {
	public static void main(String args[]) {
		Mobile s1= new Mobile(105,60000,"sony");
		Mobile s2= new Mobile(103,50000,"apple");
		Mobile s3=new Mobile(102,70000,"Apple");
	//	 
		ArrayList<Mobile> mob=new ArrayList<>();
		mob.add(s1);
		mob.add(s2);
		mob.add(s3);
	System.out.println(mob);
		Collections.sort(mob);
		Iterator d=mob.iterator();
		while(d.hasNext()) {
			System.out.println(d.next());
		}
		System.out.println("**");
		//Collections.sort(mob, new Test2Mobile());
		
		
		//Iterator e=mob.iterator();
	//	while(e.hasNext()) {
		//	System.out.println(e.next());
		
	//	}
		System.out.println("list");
		Object collectors;
		List<Mobile>t=mob.stream().filter(f->f.brand.equalsIgnoreCase("apple")).collect(Collectors.toList());
		System.out.println(t);
		List<Mobile> pricelist=mob.stream().filter(s->s.price>50000).collect(Collectors.toList());
		System.out.println(pricelist);
		List<Integer> pricemap=mob.stream().map(i->i.price).collect(Collectors.toList());
		System.out.println(pricemap);
		long g=pricelist.stream().count();
		System.out.println(g);
		
         }
		}


