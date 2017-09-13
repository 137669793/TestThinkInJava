package test.container;

import java.util.Collections;
import java.util.TreeSet;

public class TestNumber {
	
	
	public static void main(String[] args) {
		
		Number n1 = new Number(1,3);
		
		Number n2 = new Number(2,1);
		
		Number n3 = new Number(2,3);
		
		TreeSet<Number> ts = new TreeSet<Number>();
			
		//Collections.addAll(ts, n1, n2, n3);
		Number[] nn = {n1, n2, n3};
		
		Collections.addAll(ts, nn);
		
		System.out.println(ts);
		
		
	}

}
