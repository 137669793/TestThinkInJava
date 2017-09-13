
public class TestConstructor {


	public static void main(String[] args) {
		A a = new A();
		A a2 = new A("sss");

	}
	
	static class A{
		
		A(){
			System.out.println("New A");
		}
		
		A(String S){
			System.out.println("New A " + S);
		}
	}

}
