
public class TestVampireNumbers {

	public static void main(String[] args) {
		for(int i = 1000; i<9999; i++) {
			Vampire(i);
		}

		/*for(int k : N) {
			System.out.println(k);
		}*/
		

	}
	
	public static int[] GetNumber(int Number){
		int[] n = new int[4];
		for(int i=0; i<4; i++) {
			n[i] = Number % 10;
			Number = Number / 10;
		}
		return n;
	}
	
	public static void Vampire(int Number) {
		int[] n = GetNumber(Number);
		if( Number == (n[0] * 10 + n[1]) * (n[2] * 10 + n[3]) ||
				Number == (n[0] * 10 + n[2]) * (n[1] * 10 + n[3]) ||
				Number == (n[0] * 10 + n[3]) * (n[1] * 10 + n[2]) ||
				Number == (n[1] * 10 + n[0]) * (n[3] * 10 + n[2]) ||
				Number == (n[2] * 10 + n[0]) * (n[3] * 10 + n[1]) ||
				Number == (n[3] * 10 + n[0]) * (n[2] * 10 + n[1]) ||
				Number == (n[0] * 10 + n[1]) * (n[3] * 10 + n[2]) ||
				Number == (n[0] * 10 + n[2]) * (n[3] * 10 + n[1]) ||
				Number == (n[0] * 10 + n[3]) * (n[2] * 10 + n[1]) ||
				Number == (n[1] * 10 + n[0]) * (n[2] * 10 + n[3]) ||
				Number == (n[2] * 10 + n[0]) * (n[1] * 10 + n[3]) ||
				Number == (n[3] * 10 + n[0]) * (n[1] * 10 + n[2])) {
			System.out.println(Number);
		}
				
	}

}
