package curs2;

public class Rectangle {
	
	private int lenght;
	private int width;
	
	public Rectangle() {}
	
	public Rectangle(int lenght, int width) {
		setLenght(lenght);
		setWidth(width);
	}
	
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
		
	public int calcuateArea() {
		return lenght * width;
	}

}
