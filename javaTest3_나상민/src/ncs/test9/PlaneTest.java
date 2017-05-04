package ncs.test9;

import ncs.test10.Sales;
import ncs.test10.Secretary;

public class PlaneTest {

	public static void main(String[] args) {
		System.out.println("Plane              fuelSize");
		System.out.println("----------------------------- ");
		Airplane a=new Airplane("L747",1000);
		Cargoplane c=new Cargoplane("C40",1000);
		System.out.println(a.getPlaneName()+"                "+a.getFuelSize());
		System.out.println(c.getPlaneName()+"                 "+c.getFuelSize());
		System.out.println("100 운항");
		((Airplane)a).flight(100);
		((Cargoplane)c).flight(100);
		System.out.println("Plane              fuelSize");
		System.out.println("----------------------------- ");
		System.out.println(a.getPlaneName()+"                "+a.getFuelSize());
		System.out.println(c.getPlaneName()+"                 "+c.getFuelSize());
		System.out.println("200 주유");
		((Airplane)a).setFuelSize(a.getFuelSize()+200);
		((Cargoplane)c).setFuelSize(c.getFuelSize()+200);
		System.out.println("Plane              fuelSize");
		System.out.println("----------------------------- ");
		System.out.println(a.getPlaneName()+"                "+a.getFuelSize());
		System.out.println(c.getPlaneName()+"                 "+c.getFuelSize());
	}

}
