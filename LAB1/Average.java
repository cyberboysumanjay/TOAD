public class Average {
	
	public static int average(int i1,int i2){
		return (i1+i2)/2;	
	}
	public static float average(float i1,float i2){
		return (i1+i2)/2;	
	}
	public static double average(double i1,double i2){
		return (i1+i2)/2;	
	}
	public static void main(String[] args) {
		int a=7,b=1;
		float c=2.3f,d=1.3f;
		double e=10.1,f=6.4;
		System.out.println("Integer Average " + average(a,b));
		System.out.println("Float Average " +average(c,d));
		System.out.println("Double Average " +average(e,f));
	}

}
