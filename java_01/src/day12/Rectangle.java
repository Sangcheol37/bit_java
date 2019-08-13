package day12;

public class Rectangle extends Shape {

	private double width;
	private double hight;

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public Rectangle(String name, double width, double hight) {
		super.setName(name);
		this.width = width;
		this.hight = hight;
	}
	
	public Rectangle() {
		super();
	} 


	@Override
	public void calculationArea() {
		super.area = this.hight*this.width;
	}
	
	@Override
	public void print() {
		System.out.println(super.getName()+"의 면적은: "+super.area);
	}
}
