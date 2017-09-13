package testinterface;

public class Print implements InterfaceA, InterfaceB {

	@Override
	public void PrintLowerLetter() {
		// TODO 自动生成的方法存根
		for(int i=97; i<=122; i++) {
			System.out.print((char)i);
		}
		
	}

	@Override
	public void PrintCapitalLetter() {
		// TODO 自动生成的方法存根
		for(int i=65; i<=90; i++) {
			System.out.print((char)i);
		}
		
	}
	
	
	public static void main(String[] args) {
		InterfaceA a = new Print();
		InterfaceB b = new Print();
		a.PrintCapitalLetter();
		b.PrintLowerLetter();
		
	}

}
