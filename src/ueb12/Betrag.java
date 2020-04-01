package ueb12;
public class Betrag {
	
	public static short absoluteValue(short x) {
		System.out.println("Short-Methode:");
		return (short) (x*sign(x));
	}
	
	public static int absoluteValue(int x) {
		System.out.println("Int-Methode:");
		return x*sign(x);
	}
	
	public static long absoluteValue(long x) {
		System.out.println("Long-Methode:");
		return x*sign(x);
	}
	
	public static double absoluteValue(double x) {
		System.out.println("Double-Methode:");
		return x*sign(x);
	}
	
	public static float absoluteValue(float x) {
		System.out.println("Float-Methode:");
		return x*sign(x);
	}
	
	public static int sign(double zahl) {
		if (zahl < 0) {
			return -1;
		} else if (zahl > 0) {
			return +1;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		long zahl = 9;
		System.out.println(absoluteValue(zahl));
	}
}