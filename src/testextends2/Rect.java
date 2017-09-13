package testextends2;

public class Rect {
	
	public int a = 0;
	
	private int width , height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	Rect(int w, int h){
		this.setWidth(w);
		this.setHeight(h);
	}
	
	Rect(){
		this.setHeight(10);
		this.setWidth(10);
	}
	
	public int area() {
		return getHeight() * getWidth();
	}
	
	public int perimeter() {
		return (getHeight() + getWidth()) * 2;
	}

}
