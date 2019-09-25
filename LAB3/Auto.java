package labworks;

public class Auto extends Vehicle {	
	int a,b;
	public Auto(int r, int w) {
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
