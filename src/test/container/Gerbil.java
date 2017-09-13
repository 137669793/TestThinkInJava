package test.container;

import java.util.*;

public class Gerbil {
	
	int gerbailNumber;
	
	Gerbil(int n){
		
		this.gerbailNumber = n;
		
	}
	
	void hop() {
		
		System.out.println("Gerbil" +this.gerbailNumber + " Jumping!");
		
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		ArrayList<Gerbil> g = new ArrayList<Gerbil>();
		
		for(int i=0; i<10; i++) {
			
			g.add(new Gerbil(i));
			
		}
		
		for(Gerbil gerbil : g) {
			
			gerbil.hop();
			
		}
		

	}

}
