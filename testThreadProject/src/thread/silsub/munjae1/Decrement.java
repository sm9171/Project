package thread.silsub.munjae1;

public class Decrement implements Runnable {
	private int min;
	private int max;

	public Decrement(int min, int max) {
		this.min = min;
		this.max = max;

	}

	@Override
	public void run() {

		for (int k = max; k >= min; k--) {
			System.out.println(k);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
