package test.collection;

import java.util.*;

public class TestGerbil {
	
	public static void main(String[] args) {
		
		 List<Gerbil> tg = new ArrayList<Gerbil>();
		 
		 for(int i=0; i<20; i++) {
			 
			 tg.add(new Gerbil(i));
			 
		 }
		 
		 /*
		  * tg.remove(new Gerbil(1));
		 
		 tg.remove(3);
		 
		 List<Gerbil> tg1 = tg.subList(5, 9);
				 
		 for(Gerbil g : tg1) {
			 
			 g.hop();;
			 
		 }
		 
		 System.out.println(tg.containsAll(tg1));
		 */
		 
		 Iterator<Gerbil> itg = tg.iterator();
		 
		 while(itg.hasNext()) {
			 
			 itg.next().hop();;			 
		 }
		 
		 
	}
	
	
	 
	 
	 
	 
	 
}

class Gerbil{
	     
	int name;
	
	Gerbil(int Number){
		
		this.name = Number;
	
		
	}
	
	void hop(){
		
		System.out.println("Gerbil " + name +" Hopping!");
		
	}

	public boolean equals(Gerbil g) {
		// TODO 自动生成的方法存根
		return (this.name == g.name);
		//return true;
	}
	
	
	
	
	
}
