package day12;

public class Circle extends Shape {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public Circle() {
		super();
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	public void calculationArea() {
		super.area = Math.PI * this.radius * this.radius;
	}
	
	@Override
	public void print() {
		System.out.println(super.getName()+"의 면적은: "+super.area);
	}
	
	 
	
	
}
