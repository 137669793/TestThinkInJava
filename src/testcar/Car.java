package testcar;

public class Car {
	String name;
	Engine e;
	
	Car(String S,Engine e){
		this.name = name;
		this.e = e;
	}
	
	public void Test() {
		e.start();
	}

	public static void main(String[] args) {
		Car c1 = new Car("c1", new YAMAHA());
		Car c2 = new Car("c2", new HONDA());
		
		c1.Test();
		c2.Test();
		

	}

}
