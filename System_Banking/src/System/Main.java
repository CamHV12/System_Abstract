package System;

public class Main {
public static void main(String[] args) {
	 Bank bank = new Bank();

     // Thêm tài khoản vào ngân hàng
     Account savings1 = new SavingsAccount("123456", "Nguyễn Văn A", 1000.0, 5.0);
     Account savings2 = new SavingsAccount("789012", "Trần Thị B", 2000.0, 4.5);

     bank.addAccount(savings1);
     bank.addAccount(savings2);

     // Hiển thị danh sách tài khoản trong ngân hàng
     bank.displayAccounts();

     // Gửi tiền và rút tiền từ tài khoản
     savings1.deposit(500.0);
     savings2.withdraw(100.0);

     // Hiển thị lại danh sách tài khoản sau giao dịch
     bank.displayAccounts();
}
}
