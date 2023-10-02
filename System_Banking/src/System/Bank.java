package System;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Account> accounts;

	public Bank() {
		accounts = new ArrayList<>();
	}

	// Phương thức để thêm tài khoản vào ngân hàng
	public void addAccount(Account account) {
		accounts.add(account);
	}

	// Phương thức để xóa tài khoản khỏi ngân hàng
	public void removeAccount(Account account) {
		accounts.remove(account);
	}

	// Phương thức để hiển thị tất cả các tài khoản trong ngân hàng
	public void displayAccounts() {
		System.out.println("Danh sách tài khoản:");
		for (Account account : accounts) {
			account.displayAccountInfo();
		}
	}
}
