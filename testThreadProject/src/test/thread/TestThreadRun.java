package test.thread;

public class TestThreadRun {

	public static void main(String[] args) {
		// ��Ƽ������ �׽�Ʈ
		ThreadSample1 samp1=new ThreadSample1();
		ThreadSample2 samp2=new ThreadSample2();

		//Thread �� ��ӹ��� Ŭ������ ����
		/*Thread t1 = samp1;
		Thread t2 = samp2;*/
		
		//Runnable �� ��ӹ��� Ŭ������ ����
		Thread t1=new Thread(samp1);
		Thread t2=new Thread(samp2);
		
		System.out.println("t1 priority : " + t1.getPriority());
		System.out.println("t2 priority : " + t2.getPriority());
		t1.setPriority(8);
		System.out.println("t1 priority : " + t1.getPriority());
		System.out.println("t2 priority : " + t2.getPriority());
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
	}

}
