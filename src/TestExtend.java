
public class TestExtend {
	

	public static void main(String[] args) {
		C c = new C();
	}


}

 class A{
	   A(){
		System.out.println("A");
	}
}
 
 class B{
		B(){
			System.out.println("B");
		}
	}
 
class C extends A{
		B b = new B();
	}