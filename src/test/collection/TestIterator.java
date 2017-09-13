package test.collection;

import java.util.*;

public class TestIterator {
	
	public static void main(String[] srgs) {
		
		Collection c1 = new ArrayList<String>(Arrays.asList("AAA", "BBB", "CCC"));
		
		Collection c2 = new HashSet<Character>(Arrays.asList('A', 'B', 'C'));
				
		Collection c3 = new TreeSet<Integer>(Arrays.asList(1, 2, 3, 4));
		
		print(c1);
		
		print(c2);
		
		print(c3);

		
	}
	
	
	static void print(Collection c) {
		
		Iterator I = c.iterator();
	
		while(I.hasNext()) {
			
			System.out.print(I.next() + " ");
			
		}
		
		System.out.println();
		
	}

}
