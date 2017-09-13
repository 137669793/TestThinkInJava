package test.container;

public class Number implements Comparable<Number> {
	
	public int i, k ;
	
	Number(int i, int k){
		
		this.i = i;
		this.k = k;
		
	}

	@Override
	public int compareTo(Number o) {
		
		return (this.i + this.k - o.i - o.k);
	}

	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return ("Number i=" + i +" , k=" + k);
	}
	
	

}
