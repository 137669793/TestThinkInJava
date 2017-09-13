package compute;

public class Divide implements Compute{
	
	public double compute(double a, double b) {
		
		if(b == 0) {
			System.out.println("0000");
			return 0;
		}else return 
				a / b;
	}



}
