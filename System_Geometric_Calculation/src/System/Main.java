package System;

public class Main {
	public static void main(String[] args) {
		/*
		 * Bài tập 1: Lớp hình học trừu tượng.Hãy tạo một lớp trừu tượng Shape đại diện
		 * cho các hình học và có phương thức trừu tượng để tính diện tích. Sau đó, tạo
		 * các lớp con để triển khai Shape cho hình tròn, hình vuông và hình tam giác.
		 * Tạo một mảng đối tượng Shape và tính tổng diện tích của tất cả các hình.
		 */
		AreaCircle circle = new AreaCircle(3.5);
		AreaSquare square = new AreaSquare(6);
		AreaTriangle triangle = new AreaTriangle(6.8, 2.4);

		System.out.println("Diện tích hình học:");
		System.out.println("Diện tích hình tròn:" + circle.getCalculateAcreage());
		System.out.println("Diện tích hình vuông:" + square.getCalculateAcreage());
		System.out.println("Diện tích hình tam giác:" + triangle.getCalculateAcreage());
		System.out.println("Tổng diện tích của tất cả các hình:" + circle.getCalculateAcreage()
				+ square.getCalculateAcreage() + triangle.getCalculateAcreage());

	}
}
