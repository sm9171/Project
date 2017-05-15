package test.sync;

public class AccountManager extends Thread {
	private Account acc;
	private String name;

	public AccountManager() {
	}

	public AccountManager(String name) {
		this();
		this.name = name;
	}

	@Override
	public void run() {
		acc=new Account();
		Account.setBalance(2000);
		while (Account.getBalance() > 0) {
			System.out.println("현재 잔액 : "+Account.getBalance());
			int money = new java.util.Random().nextInt(10)*100;
			acc.withDraw(money);
			System.out.println(name+"이 인출한 금액 : "+money);
		}

	}
}
