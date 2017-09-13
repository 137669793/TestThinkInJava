package test.collection;

import java.util.*;


public class Simplecoolection {
	
	public static void main(String[] args) {
		
		Collection<Integer> c = new HashSet<Integer>();
		
		for(int i=0; i<10; i++) {
			
			c.add(i);
			
		}
		
		System.out.println(c);
		
	}

}
