package thread.silsub.munjae1;

public class Increment implements Runnable {

	private int i;

	public Increment(int i) {
		this.i = i;
	}

	@Override
	public void run() {

		for (int j = 1; j <= i; j += 2) {
			System.out.println(i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
