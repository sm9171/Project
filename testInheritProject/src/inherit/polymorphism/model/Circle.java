package inherit.polymorphism.model;

public class Circle /*extends Shape*/implements IShape{
	private double radius;
	
	public Circle(){}
	
	public Circle( double radius) {
		super();
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		System.out.println("¹İÁö¸§ : "+ radius);
		/*return Math.round(Math.PI*Math.pow(radius, 2)*10)/10.0;*/
		return Math.round(IShape.PI*Math.pow(radius, 2)*10)/10.0;
	}

	@Override
	public double perimeter() {
//		return Math.round(2*Math.PI*radius*10)/10.0;
		return Math.round(2*IShape.PI*radius*10)/10.0;
	}
	
}
