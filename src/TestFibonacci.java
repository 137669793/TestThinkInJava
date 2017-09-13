
public class TestFibonacci {
	public static void Fibonacci(int t) {
		int x = 1 ;
		int y = 1 ;
		System.out.print("1.1.");
		for(int i=2; i<t; i++) {
			x += y;
			y += x;
			System.out.print(x + "." + y +".");
		}
	}
	
	public static void main(String[] args) {
		Fibonacci(20);
	}

}
