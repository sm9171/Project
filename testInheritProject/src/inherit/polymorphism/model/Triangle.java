package inherit.polymorphism.model;

public class Triangle implements IShape{
	private double base;
	private double height;
	
	public Triangle(){}
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	public double area(){
		System.out.println("πÿ∏È : "+base);
		System.out.println("≥Ù¿Ã : "+height);
		return (base*height)/2;
	}
	
	public double getHypotenuse(){
		System.out.println("πÿ∏È : "+base);
		System.out.println("≥Ù¿Ã : "+height);
		return Math.sqrt(base*base+height*height);
	}
	public double perimeter(){
		System.out.println("∫Ø : "+getHypotenuse());
		return base+height+this.getHypotenuse();
	}
	
}
