package test.thread;

public class ThreadSample1 /*extends Thread*/ implements Runnable{
	public ThreadSample1(){}
	@Override
	public void run(){
		for(int i=1;i<501;i++){
			System.out.println("¡Ú");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
