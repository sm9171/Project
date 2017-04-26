package inherit.sample;

public class Shape {
	private String name;	//�̸�
	private double area;	//����
	private double perimeter;	//�ѷ�
	
	public Shape(){
		System.out.println("Shape() ������.");
	}
	
	public Shape(String name){
		System.out.println("Shape(name) ������.");
		this.name =name;
	}
	
	public String getName() {
		return name;
	}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	public void calculator(){

	}

	public void information() throws NullPointerException, ArithmeticException{
		System.out.println("�����̸� : " +name);
		System.out.println("���� : "+area);
		System.out.println("�ѷ� : " + perimeter);
	}
	@Override
	public String toString(){
		return this.name+", "+this.area+", "+this.perimeter;
	}
	
	@Override
	public boolean equals(Object obj){
		//this�� �����ϴ� ��ü���� �ʵ��� obj�� �����ϴ� ��ü���� �ʵ���� ������ ��� ��ġ�ϴ��� ��
		boolean result = false;
		Shape other= (Shape)obj;
		if(this.name.equals(other.name)&& this.area == other.area && this.perimeter==other.perimeter)
			result =true;
		return result;
	}
	/*public Shape copyShape() throws CloneNotSupportedException{
	return (Shape)this.clone();
}*/
	@Override
	public Object clone(){
		Shape s = new Shape();
		s.name= this.name;
		s.area= this.area;
		s.perimeter=this.perimeter;
		
		return s;
}
}
