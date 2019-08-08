public class getCircle {
	public static void main(String[] args) {
		double r=8;
		String colorString="Red";
		Circle c=new Circle(r,colorString);
		System.out.println("Area of "+c.getColor()+" Circle is "+c.area(c.getRadius()));
	}
}
