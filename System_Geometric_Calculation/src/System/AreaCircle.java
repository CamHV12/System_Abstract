package System;

public class AreaCircle extends Shape {
	private double radius;

	public AreaCircle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getCalculateAcreage() {
		// TODO Auto-generated method stub
		return radius * radius * Math.PI;
	}

}
