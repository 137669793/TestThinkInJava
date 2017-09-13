package testextends2;

public class PlainRect extends Rect {
	
	public int a = 1 ;
	
	private int startX;
	
	private int startY;

	public int getStartX() {
		return startX;
	}

	public void setStartX(int startX) {
		this.startX = startX;
	}

	public int getStartY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}
	
	PlainRect(int x, int y, int w, int h){
		super(w, h);
		this.setStartX(x);
		this.setStartY(y);
	}
	
	PlainRect(){
		super(0, 0);
		this.setStartX(0);
		this.setStartY(0);
	}
	
	public boolean isInside(int x, int y) {
		return x>=startX&&x<=(startX+getWidth())&&y<startY&&y>=(startY-getHeight());
	}
	
	public static void main(String[] args) {
		
		PlainRect p = new PlainRect(10,10,20,10);
		
		System.out.println(p.isInside(23, 13));
		
		System.out.println(p.area());
		
		System.out.println(p.perimeter());
		
		System.out.println(p.a);
		
	}

}
