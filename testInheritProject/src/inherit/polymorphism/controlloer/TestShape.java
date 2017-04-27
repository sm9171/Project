package inherit.polymorphism.controlloer;

import inherit.polymorphism.model.*;


public class TestShape {

	public static void main(String[] args) {
		//	��� ������ �ǽ����� 1
//		Shape s; 		//�߻�Ŭ������ ���۷������� ���� ������.
		IShape s;		//�������̽��� ���۷������� ���� ������.
		
		s = new Circle(15.5);
		
		System.out.println("������ : " + s.area());
		System.out.println("���ѷ� : " + s.perimeter());
		
		s = new Rectangle(34.5, 42.7);
		System.out.println("�簢������ : " + s.area());
		System.out.println("�簢���ѷ� : " + s.perimeter());

	}

}
