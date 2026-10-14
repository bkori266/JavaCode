package prototypePattern;

public abstract class Shape implements Cloneable {
	
	private int height;
	private int width;
	private String color;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Shape [height=" + height + ", width=" + width + ", color=" + color + "]";
	}
	
	public Shape clone() throws CloneNotSupportedException {
		return (Shape)super.clone();
		
	}
	

}
