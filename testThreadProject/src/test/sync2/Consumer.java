package test.sync2;

public class Consumer implements Runnable {
	private Buffer buffer;

	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			int number = buffer.get();
			System.out.println("�Һ��ڰ� "+ i + "�� ������ �Һ��Ͽ����ϴ�.");
			try {
				Thread.sleep((int)Math.random()*100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
