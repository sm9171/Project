package test.sync;

public class Account {
	private static int balance;

	public Account() {
	}

	public/* synchronized*/ void withDraw(int money){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		synchronized(this){		//동기화 블럭 처리
		if(balance>=money){
			balance-=money;
		}}
	}

	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int money) {
		balance += money;
	}

}
