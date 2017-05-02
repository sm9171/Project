package test.util;

import java.util.Date;

public abstract class TestDate {

	public static void main(String[] args) {
		// java.util.Date 클래스 테스트
		Date today = new Date();
		Date when = new Date(10000000L);
		System.out.println("today : " + today.getTime());
		System.out.println("today : " + today.toString());
		System.out.println("when : " + when);
	}

}
