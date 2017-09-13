package test.collection;

import java.util.*;

public class FillMovie {
	
	String next(int n) {
		
		switch(n){
		
		case 0 : return "Q";
		case 1 : return "W";
		case 2 : return "E";
		case 3 : return "R";
		case 4 : return "T";
		case 5 : return "Y";
		default : return "ERROR";
		
		}
		
	}
	
	void fill(Collection c) {
		
		for(int i=0; i<6; i++ ) {
			
			c.add(next(i));
			
		}
	
	
	
	
}

	public static void main(String[] args) {
		System.out.println(new ArrayList());
		

	}

}
