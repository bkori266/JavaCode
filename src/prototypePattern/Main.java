package prototypePattern;

public class Main {
	
	public static void main(String args[]) throws CloneNotSupportedException {
		Shape circle=new Circle();
		circle.setColor("Green");
		circle.setHeight(10);circle.setWidth(20);
		
		
		System.out.println(circle);
		
		Shape circle2=circle.clone();
		circle2.setColor("Yellow");
		System.out.println(circle2);
		
	}

}
