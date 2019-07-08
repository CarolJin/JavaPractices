package singleton;

public class BankAccountTest {
	public static void main(String args[]) {
		ThreadTest t1 = new ThreadTest(new Customer("Sid"));
		ThreadTest t2 = new ThreadTest(new Customer("Sue"));
		ThreadTest t3 = new ThreadTest(new Customer("Sam"));

		t1.start();
		t2.start();
		t3.start();
	}
}

class ThreadTest extends Thread implements Runnable {
	Customer cust;

	public ThreadTest(Customer c) {
		this.cust = c;
	}

	public void run() {
		for (int i = 0; i < 4; i++) {
			try {
				BankAccount account = BankAccount.getAccount(cust);
				account.withdraw(200);
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class BankAccount {
	static BankAccount account;
	static int balance = 1000;
	static Customer cust;

	public static BankAccount getAccount(Customer cust) {
		if (account == null)
			account = new BankAccount();
		BankAccount.cust = cust;
		return account;
	}

	public static int getBalance() {
		return balance;
	}

	public synchronized void withdraw(int bal) {
		try {
			if (balance >= bal) {
				System.out.println(cust.name + " requests $" + bal);
				Thread.sleep(1000);
				balance = balance - bal;
				System.out.println(cust.name + " receives $" + bal);
			} else {
				System.out.println("Oops, we're running out of money now..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Current balance: $" + balance);
	}
}

class Customer {
	public String name;

	public Customer(String name) {
		this.name = name;
	}
}