package ueb14;

public class Differenz {

	public static double istDifferenz(double zahl1, double zahl2) {
		double ergebnis;
		if (zahl1>=zahl2) {
			ergebnis = zahl1-zahl2;
		} else {
			ergebnis = zahl2-zahl1;
		}
		return ergebnis;
	}
	
	public static void main(String[] args) {
		System.out.println(istDifferenz(-66,7));
	}
}
