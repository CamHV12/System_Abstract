package System;

public class AreaTriangle extends Shape {
	private double base;
	private double height;

	public AreaTriangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double getCalculateAcreage() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}

}
