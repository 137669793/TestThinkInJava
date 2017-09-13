
public class TestDog {
	public static void main(String[] args) {
		Dog spot = new Dog("spot", "Ruff!");
		Dog spot1 = new Dog("spot", "Ruff!");
		Dog scruffy = new Dog("scruffy", "Wurf!");
		spot.Bark();
		scruffy.Bark();
		System.out.print(spot.equals(spot1));
	}

}

class Dog{
	public boolean equals(Object obj) {
		Dog D = (Dog)obj;
		if(this.name == D.name || this.sound == D.sound) {
			return true;
		}
		return false;
		
	}
	String name;
	String sound;
	public void Bark() {
		System.out.println(name +"  " + sound);
	}
	Dog(String name, String sound){
		this.name = name;
		this.sound = sound;
	}
	
}
