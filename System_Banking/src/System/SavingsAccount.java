package System;

public class SavingsAccount extends Account{
	private double interestRate;

	public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
		super(accountNumber, accountHolder, balance);
		this.interestRate = interestRate;
	}

	@Override
	public void deposit(double amount) {
		double interest = amount * (interestRate / 100);
		super.balance += amount + interest;
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= super.balance) {
			super.balance -= amount;
		} else {
			System.out.println("Số dư không đủ để rút.");
		}
	}
}
