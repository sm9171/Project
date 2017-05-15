package test.sync2;

public class Buffer {
	private int number;
	private boolean empty = true;
	
	public synchronized int get(){
		while(empty){
			try {
				wait();
				System.out.println("���� ������ ��ٷ� �ּ���.");
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
				System.out.println("�� ��������� �Һ�� ������ ��ٷ� �ּ���.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		empty=false;
		this.number= number;
		notifyAll();
	}
}
