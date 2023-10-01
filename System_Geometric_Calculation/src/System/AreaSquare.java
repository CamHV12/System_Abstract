package System;

public class AreaSquare extends Shape {
	private double side;

	public AreaSquare(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getCalculateAcreage() {
		return side * side;
	}

}
