package test.sync;

public class TestAccountManager {

	public static void main(String[] args) {
		// ����ȭ(synchronized) �׽�Ʈ
		Thread t1 = new AccountManager("���ͳ� ��ŷ");
		Thread t2 = new AccountManager("üũ ī��");
		Thread t3 = new AccountManager("���� ����");
		t1.start();
		t2.start();
		t3.start();

	}

}
