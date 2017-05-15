package thread.silsub.munjae1;


public class TestThread1 {

	public static void main(String[] args) {
		Decrement dec=new Decrement(12,45);
		Increment inc=new Increment(50);
		
		
		Thread t1=new Thread(dec);
		Thread t2=new Thread(inc);
		t1.start();
		t2.start();
	}
}
