package oop.staticmethod;

public class StaticMethod {
	private static String value="abcde";
	private static int b=3;
	
	public static void setValue(String a){
		value=a;
	}
	public static String getValue(){
		return value;
	}
	public static void toUpper() {
		
		value=value.toUpperCase();
	}

	public static void setChar(int a,char b) {
		char[] chArr=value.toCharArray();
		chArr[a] =b;
		value=String.valueOf(chArr);
	}

	public static int valueLength() {
		return value.length();
	}

	public static String valueConcat(String a) {
		return value.concat(a);
	}
}
