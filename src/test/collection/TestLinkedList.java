package test.collection;

import java.util.*;

public class TestLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		for(int i=0; i<50; i++) {
			
			l.add(l.size()/2, i);
			
		}
		
		System.out.println(l);
		
	}

}
