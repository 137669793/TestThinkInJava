package Interface;

public class Test2 extends Test1 {
	
	int a = 2 ;
	
	public void print() {
		System.out.println(a);
	}
	
	Test2(){
		print();
	}
	
	
	public static void main(String[] args) {
		Test2 t = new Test2();
	}

}