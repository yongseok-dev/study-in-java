package ch09;

public class NewCoordinate {
	private double x = 0;
	private double y = 0;

	NewCoordinate() {
	}

	NewCoordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	NewCoordinate(NewCoordinate c) {
		this(c.x, c.y);
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public boolean equalTo(Coordinate c) {
		return x == c.getX() && y == c.getY();
	}
	public String toString() {
		return "("+x+", "+y+")";
	}
}
