package test.thread;

public class ThreadSample2 /*extends Thread*/ implements Runnable{
	public ThreadSample2(){}
	@Override
	public void run() {
		for(int i=1;i<501;i++){
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
