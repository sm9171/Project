package test.sync2;

public class Buffer {
	private int number;
	private boolean empty = true;
	
	public synchronized int get(){
		while(empty){
			try {
				wait();
				System.out.println("값이 없으니 기다려 주세요.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		empty = true;
		notifyAll();
		return number;
	}
	public synchronized void put(int number){
		while(!empty){
			try {
				wait();
				System.out.println("값 들어있으니 소비될 때까지 기다려 주세요.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty=false;
		this.number= number;
		notifyAll();
	}
}
