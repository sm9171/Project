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
			System.out.println("소비자가 "+ i + "번 물건을 소비하였습니다.");
			try {
				Thread.sleep((int)Math.random()*100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
