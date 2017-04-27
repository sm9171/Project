package inherit.sample;

public class Circle extends Shape{
	private double radius;
	
	public Circle(){
		super();	//������ �ȿ����� ��밡��, ù �ٿ��� ������
		System.out.println("Circle() ������.");
	}
	
	public Circle(double radius){
		System.out.println("Circle(radius) ������.");
		this.radius=radius;
	}
	public Circle(String name,double radius){
		super(name);  //�θ��� �Ű����� �ִ� ������ ȣ��
//		this.name =name;    //private �̶� ���� �Ұ���
//		this.setName(name);   //�� �����̹Ƿ� ������
		this.radius=radius;
	}
	public void setRadius(double radius){
		this.radius=radius;
	}
	public double getRadius(){
		return radius;
	}
	//�߻�޼ҵ带 ��ӹ��� �ļ�Ŭ������ �ݵ�� �θ��� �߻�޼ҵ带 �ϼ����Ѿ� ��
	//�޼ҵ� ����� ����ȭ�� ������.
	@Override
	public void calculator(){
		setArea(Math.PI * Math.pow(radius, 2));
		setPerimeter(2*Math.PI*radius);
	}
	@Override
	public void information(){
		super.information();
		System.out.println("������ : "+radius);
	}
	@Override
	public String toString(){
		return super.toString()+ ", " +this.radius;
	}
	@Override
	public boolean equals(Object obj){
		boolean result = false;
		Circle other = (Circle)obj;
		if(super.equals(obj)&&this.radius==other.radius)
			result =true;
		return result;
	}
	/*@Override
		public Object clone(){
			Circle c= (Circle)super.clone();
			c.setArea(this.getArea());
			c.setName(this.getName());
			c.setPerimeter(this.getPerimeter());
			c.radius=this.radius;
			return c;
}*/
}
