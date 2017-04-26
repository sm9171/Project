package inherit.sample;

public class Rectangle extends Shape{
	private double width, height;
	public Rectangle(){
		System.out.println("Rectangle() ������.");
	}
	public Rectangle(double width, double height){
		System.out.println("Rectangle(width, height) ������.");
		this.width=width;
		this.height=height;
	}
	public Rectangle(String name,double width, double height){
		super(name);
		this.width=width;
		this.height=height;
		System.out.println("Rectangle(name, width, height) ������");
	}
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
	@Override
	public void calculator(){
		setArea(width*height);
		setPerimeter((width+height)*2);
	}
	@Override
	public void information(){
		super.information();
		System.out.println("�ʺ� : " + width);
		System.out.println("���� : " + height);
	}
	@Override
	public String toString(){
		return super.toString() + ", "+ this.width+", "+this.height;
	}
	@Override
	public boolean equals(Object obj){
		boolean result = false;
		Rectangle other = (Rectangle)obj;
		if(super.equals(obj)&&this.width==other.width&&this.height==other.height)
			result =true;
		return result;
	}
	@Override
	public Object clone(){
		Rectangle r= new Rectangle();
		r.setArea(this.getArea());
		r.setName(getName());
		r.setPerimeter(getPerimeter());
		r.width=this.width;
		r.height=this.height;
		return r;
	}
}
