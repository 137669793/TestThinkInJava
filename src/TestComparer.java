import java.util.Random;

public class TestComparer {
	public static void main(String[] args) {
	Random rand = new Random(21);
	int Number1 = rand.nextInt(100);
	int Number2 ;
	for(int i = 0 ; ; i++ ) {
		System.out.print(Number1);
		Number2 = rand.nextInt(i+1);
		if(Number2 < Number1) {
			System.out.print(" > ");
		}else if(Number1 < Number2) {
			System.out.print(" < ");
		}else System.out.print(" = ");
		System.out.print(Number2);
		Number1 = Number2;
	}
	}
}


