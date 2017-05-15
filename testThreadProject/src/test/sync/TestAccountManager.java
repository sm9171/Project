package test.sync;

public class TestAccountManager {

	public static void main(String[] args) {
		// 동기화(synchronized) 테스트
		Thread t1 = new AccountManager("인터넷 뱅킹");
		Thread t2 = new AccountManager("체크 카드");
		Thread t3 = new AccountManager("통장 인출");
		t1.start();
		t2.start();
		t3.start();

	}

}
