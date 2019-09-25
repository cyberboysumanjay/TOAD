package labworks;

public class Vehicle {
	int registrationNumber,wheels;
	public Vehicle(int r,int w) {
		this.registrationNumber=r;
		this.wheels=w;
		// TODO Auto-generated constructor stub
	}
	
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels=wheels;
	}
	public void setReg(int reg) {
		this.registrationNumber=reg;
	}
	public int getReg() {
		return registrationNumber;
	}

}