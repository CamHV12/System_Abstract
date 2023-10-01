package System;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Contact contact = new AddressBook("", "", "", "");
		Contact contact1 = new AddressBook("1", "1", "1", "1");
		AddressBook addressBook = new AddressBook();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("1. Thêm :");
			System.out.println("2. Xóa :");
			System.out.println("3. Hiển thị :");
			System.out.println("4. Tìm kiếm :");
			System.out.println("Bạn muốn chọn :");
			int chon = sc.nextInt();
			switch (chon) {
			case 1: {
				System.out.println("Thêm vào danh bạ");
				addressBook.add(contact);
				addressBook.add(contact1);
				break;
			}
			case 2: {
				System.out.println("Xóa khỏi danh bạ");
				addressBook.remove(contact);
				break;
			}
			case 3: {
				System.out.println("Hiển thị danh bạ");
				addressBook.displayInfo();
				break;
			}
			case 4: {
				sc.nextLine();
				while (true) {
					System.out.println(
							"Bạn muốn tìm kiếm: (1-theo name) || (2-theo address) || (3-theo phone) || (4-theo email)");
					String bien = sc.nextLine();
					switch (bien) {
					case "1":
					case "2":
					case "3":
					case "4":
						System.out.println("Nội dung bạn tìm kiếm:");
						String value = sc.nextLine();
						while (value != null) {
							addressBook.find(value, bien);
							break;
						}
						break;

					default:
						System.out.println("Hãy chọn lại!!");
					}
				}
			}
			default:
				System.out.println("Hãy chọn lại đi bạn!!");
			}
		}
	}
}
