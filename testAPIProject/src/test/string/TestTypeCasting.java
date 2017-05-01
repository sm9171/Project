package test.string;

public class TestTypeCasting {

	public static void main(String[] args) {
		// 문자열 <=> 기본자료형값 반환처리
		String v1 = 100 + "";
		System.out.println("v1.length() : " + v1.length());
		String v2 = String.valueOf(100);
		System.out.println("v1 : " + v1 + " , v2 : " + v2);
		String v3 = String.valueOf(false);
		String v4 = String.valueOf('T');
		String v5 = String.valueOf(new char[] { 'j', 'a', 'v', 'a' });
		String v6 = String.valueOf(3.5);
		String v7 = String.valueOf(2.5f);
		String v8 = String.valueOf(100L);

		boolean bool = Boolean.getBoolean("false");
		boolean bool2 = Boolean.parseBoolean("true");
		int ival = Integer.parseInt("100");
		int ival2 = Integer.valueOf("200");
		double dval = Double.parseDouble("23.5");
		
		System.out.println("bool : " + bool);
		System.out.println("bool2 : " + bool2);
		System.out.println("ival : " + ival);
		System.out.println("ival2 : " + ival2);
		System.out.println("dval : " + dval);
	}

}
