package test.sync2;

public class Producer implements Runnable{
	private Buffer buffer;
	
	public Producer(Buffer buffer){
		this.buffer=buffer;
	}
	@Override
	public void run() {
		for(int i=1;i<11;i++){
			buffer.put(i);
			System.out.println("�����ڰ� " + i + "�� ������ �����Ͽ����ϴ�.");
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
