package inherit.polymorphism.model;

public class Rectangle /*extends Shape*/implements IShape{
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Rectangle(){}
	public Rectangle(double width,double height){
		super();
		this.width=width;
		this.height=height;
	}
	@Override
	public double area() {
		System.out.println("πÿ∏È : "+width);
		System.out.println("≥Ù¿Ã : "+height);
		return Math.round(width*height*10)/10.0;
		
	}
	@Override
	public double perimeter() {
		System.out.println("πÿ∏È : "+width);
		System.out.println("≥Ù¿Ã : "+height);
		return Math.round((width+height)*10*2)/10.0;
	}
}
