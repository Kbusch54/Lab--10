package co.grandcircus;

public class Circle {

	private double radius;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public Circle(double radius) {
	}

	public double getCircumference() {

		return 2 * (radius * Math.PI);
	}

	public double getArea() {
		return Math.PI * (radius * radius);
	}

	private static String formatNumber(double x) {
		
		return String.format("%.2f", x);
	}

	public String getFormattedCircumference() {
		return "circumference: " + formatNumber(getCircumference());

	}

	public String getFormattedArea() {
		return "Area: " + formatNumber(getArea());

	}
}
