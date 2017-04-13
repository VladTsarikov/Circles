package by.htp.circle.entity;

public class Circle {

	private String name;
	private int x;
	private int y;
	private double radius;
	private double square;
	private double perimeter;

	public Circle(String name,int x, int y, double r){
		this.name = name;
		this.radius =r;
		this.x = x;
		this.y = y;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	@Override
	public String toString() {
		return "Circle [name=" + name + ", radius=" + radius + ", square="
				+ square + ", perimeter=" + perimeter + "]";
	}
	
	
	
	
}
