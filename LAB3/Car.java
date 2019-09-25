package labworks;

public class Car extends Vehicle {
	int a,b;
	public Car(int r, int w) {
		super(r, w);
	}
	public int getA() {
		return a;
	}
	public void setA(int wheels) {
		this.a=wheels;
	}
	public void setB(int reg) {
		this.b=reg;
	}
	public int getB() {
		return b;
	}
}
