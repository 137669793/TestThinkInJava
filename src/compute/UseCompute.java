package compute;

public class UseCompute {
	
	static double compute(Compute com, double a, double b) {
		return com.compute(a, b);
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(compute(new Add(), 5, 6));
		System.out.println(compute(new Minus(), 5, 6));
		System.out.println(compute(new Multi(), 5, 6));
		System.out.println(compute(new Divide(), 5, 6));
		
	}

}
