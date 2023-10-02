package System;

public abstract class Account {
	private String accountNumber;
	private String accountHolder;
	protected double balance;

	public Account(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	// Phương thức trừu tượng để gửi tiền
	public abstract void deposit(double amount);

	// Phương thức trừu tượng để rút tiền
	public abstract void withdraw(double amount);

	// Phương thức để hiển thị thông tin tài khoản
	public void displayAccountInfo() {
		System.out.println("Số tài khoản: " + accountNumber);
		System.out.println("Tên chủ tài khoản: " + accountHolder);
		System.out.println("Số dư: $" + balance);
		System.out.println("--------------------------");
	}

	public String getAccountNumber() {
		return accountNumber;
	}
}
