package test.sync2;

public class TestProducerConsumer {

	public static void main(String[] args) {
		// ��Ƽ�������� ������/�Һ��� ���α׷� �׽�Ʈ
		Buffer buffer = new Buffer();
		(new Thread(new Producer(buffer))).start();
		(new Thread(new Consumer(buffer))).start();

	}

}
