public class Circle {
	private double radius=0;
	private String colour="";
	public Circle() {
		
	}
	
	public Circle (double radius,String color){
		this.radius=radius;
		this.colour=color;
	}
	
	public void setRadius(double r) {
		radius=r;
	}

	public double getRadius() {
		return radius;
	}

	public void setColor(String c) {
		colour=c;
	}

	public String getColor() {
		return colour;
	}

	public double area(double radius){
		return Math.PI*radius*radius;
	}
}

