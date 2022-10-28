package org.string;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//import java.awt.List;
//import java.util.ArrayList;

public class Hello1 {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(20);
		
//		List<Integer> li = new ArrayList();
//		for (int ref:l) {
//			if(!li.contains(ref));{
//				li.add(ref);
//			}
//		}
//		for (int object : li) {
//			System.out.println(object);
//		}
		
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.addAll(l);
		s.add(50);
		//s.removeAll(l);
		System.out.println(s);
		
	}

}
