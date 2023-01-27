package exercise.basic.banking1;

public class Account {
	private String accountName;
	private int balance;

	public Account(String accountName, int balance) {
		this.accountName = accountName;
		this.balance = balance;
	}

	public String getAccountName() {
		return this.accountName; // return "";
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getBalance() {
		return this.balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean deposit(int amount) { // 입금 메서드
		boolean flag = true; // 입금 성공했을때
		if (amount <= 0) {
			flag = false;
		} else {
			this.balance += amount;
		}
		return flag;
	}

	public boolean withdraw(int amount) { // 출금메서드
		boolean flag = true; // 출금 성공했을때
		if (this.balance < amount) {
			flag = false;
		} else {
			this.balance -= amount;
		}
		return flag;
	}

}
