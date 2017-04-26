package inherit.test;

import inherit.sample.Circle;
import inherit.sample.Rectangle;
import inherit.sample.Shape;

public class TestInheritance {
	//��Ӱ��� ������ ���� Ȯ�� �׽�Ʈ
	public void test1(){
		//�ļ� �����ڰ� ������ �� �θ��� �⺻�����ں��� �����.
		Circle cir1 =new Circle();
		Rectangle rec1 =new Rectangle();
		Circle cir2 = new Circle(12.5);
		Rectangle rec2 = new Rectangle(11.2,15.3);
		Circle cir3 = new Circle("��",33.3);
		Rectangle rec3 = new Rectangle("�簢��",10,10);
		cir1.calculator();
		cir2.calculator();
		cir3.calculator();
		cir1.information();
		cir2.information();
		cir3.information();
		
		rec1.calculator();
		rec2.calculator();
		rec3.calculator();
		rec1.information();
		rec2.information();
		rec3.information();
		
	
	}
	//��ü �迭 �׽�Ʈ
	public void test2(){
		Circle[] cArr= new Circle[3];
		Rectangle[] rArr = new Rectangle[3];
		//��ü�Ҵ�
		cArr[0]=new Circle("1. ��Ŭ",10);
		cArr[1]=new Circle("2. ��Ŭ",12);
		cArr[2]=new Circle("3. ��Ŭ",14);
		rArr[0]=new Rectangle("1. �簢��",12,12);
		rArr[1]=new Rectangle("2. �簢��",12,12);
		rArr[2]=new Rectangle("3. �簢��",12,12);
		
		//���
		
		//���
		for(int i=0;i<cArr.length;i++){
			cArr[i].calculator();
			cArr[i].information();
		}
		for(int i=0;i<rArr.length;i++){
			rArr[i].calculator();
			rArr[i].information();
		}
	}
	//java.lang.Object �� ��� Ŭ�������� �θ��̴�.
	//Object �� �����ϴ� �޼ҵ�� ��� �����ϴ�.
	public void test3(){
		Shape s= new Shape("����");
		Shape s2= s; //�ּ� ����
		
		System.out.println("s�� s2�� �ּҰ� ������? " + s.equals(s2));
		System.out.println("s : "+ s.hashCode());
		System.out.println("s2 : " + s.hashCode());
		System.out.println("s.toString() : " + s.toString());
		System.out.println("s : " + s);
		
		String st1 ="apple";
		String st2 = "banana";
		String st3 = "apple";
		System.out.println("s1.toString() : " + st1.toString());
		System.out.println("st1 : "+st1);
		System.out.println("���� ������? " + st1.equals("apple"));
		
	}
	public void test4(){
		Shape s = new Shape("����");
		Circle cir = new Circle("��", 12.3);
		Rectangle rec = new Rectangle("�簢��",10,20);
		
		System.out.println("s : " + s);
		System.out.println("cir : "+ cir);
		System.out.println("rec : "+ rec);
	}
	//��Ӱ��迡 �ִ� Ŭ������ ���� �θ� ���۷����� �ļ� ��ü�� �ּҸ� ���� �� ����
	public void test5(){
		Shape s= new Circle();
		System.out.println("s : "+ s);
		
		//�θ� ���۷����δ� �θ�͸� ������ �� ����
//		s.setRadois(10); 
		//  �ļ� ���� ����� �����Ϸ���, �θ��۷����� �ļ�Ŭ���������� ����ȯ �ؾ� ��: ��Ӱ��迡 �ִ�   Ŭ���� ������������ ����ȯ�� ����
		//DownCasting�̶�� ��: ���� ����ؾ� ��
		
		
		((Circle)s).setRadius(10);
		
		
		s= new Rectangle();
		System.out.println("s : "+ s);
		Object obj = s;
		System.out.println("obj : " +obj);
		obj= new Shape();
		obj= new Circle();
		obj= new String();
		obj= new java.util.Date();
		System.out.println("obj : "+obj);
	}
	//overriding equals() test
	public void test6(){
		Shape s1 =new Shape("����1");
		Shape s2 =new Shape("shape");
		if(s1.equals(s2))
			System.out.println("�� ��ü���� ��� �ʵ尪�� ����");
		else
			System.out.println("�� ��ü���� ��� �ʵ尪�� �ٸ���");
	}
	//equals() test
	public void test7(){
		Circle c1 =new Circle("��", 10.5);
		Circle c2 = new Circle("��",10.5);
		System.out.println("�ּҰ� ������? "+(c1 == c2));
		System.out.println("������ ��� ������? "+c1.equals(c2));
	}
	//clone() test
	public void test8(){
		Circle c1 = new Circle("circle",23.5);
		Circle copyC1 = (Circle)c1.clone();
		
		System.out.println("c1 :" +c1);
		System.out.println("copyC1 : "+copyC1);
		System.out.println("c1 : "+c1.hashCode());
		System.out.println("copyC1 : " +copyC1.hashCode());
	}
	public static void main(String[] args) {
		//��� �׽�Ʈ
		TestInheritance tin =new TestInheritance();
		tin.test8();
	}

}
