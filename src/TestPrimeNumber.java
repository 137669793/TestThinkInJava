
public class TestPrimeNumber {
	public static void main(String[] args) {
		System.out.print("1 ");
		for(int i=2; i<1000; i++) {
			for(int k=2; ; k++) {
				if(k == (int)i/2+1) {
					System.out.print(i+" ");
					break;
				}
				if(i % k == 0) {
					break;
				}

			}
		}
		
	}

}
