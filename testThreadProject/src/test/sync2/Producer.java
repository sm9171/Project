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
			System.out.println("생산자가 " + i + "번 물건을 생산하였습니다.");
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
