package innerclasses;

public class InnerTest1 {
	
	private String name;
	
	InnerTest1(String name){
		
		this.name = name;
		
	}
	
	class inner{
		
		void play() {
			
			System.out.println("InnerClass");
			
		}
		
		void ToString() {
			
			System.out.println(name);
			
		}
		
	}
	
	inner to() {
		
		return new inner();
		
	}
	
	public static void main(String[] args) {
		
		InnerTest1 it = new InnerTest1("Out");
		
		it.to().play();
		
		it.to().ToString();
		
	}

}
