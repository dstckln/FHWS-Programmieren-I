package ueb14;

public class Punkt {
	int a;
	int b;
	int c;
	
	public Punkt(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	
	public double berechneAbstand() {
		double abstand = 0;
		abstand = Math.sqrt((Math.pow(this.a, 2) + Math.pow(this.b, 2) + Math.pow(this.c, 2)));
		return abstand;
	}
	
	@Override
	public String toString() {
		return "a=" + this.a + ", b=" + this.b + ", c=" + this.c;
	}
	
	public static void main(String[] args) {
		Punkt punkt = new Punkt(2,5,7);
		System.out.println(punkt.berechneAbstand());
		System.out.println(punkt.toString());
	}
}
