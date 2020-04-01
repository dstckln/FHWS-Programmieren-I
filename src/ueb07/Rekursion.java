package ueb07;
import java.util.Scanner;

public class Rekursion {

    public static double potenz(double basis, int exponent) { 
		
	if (exponent == 0) {
		basis = 1.0;
	} else if (exponent > 0) {
		basis *= potenz(basis, exponent-1); //Rekursiver Methodenaufruf
	}
	return basis; 	
    }
	
    public static void main(String[] args) {
	double basis;
	int exponent;
	double ergebnis;
	Scanner scanner = new Scanner(System.in);
		
	System.out.print("Bitte geben Sie die Basis ein: ");
	basis = scanner.nextDouble();
	System.out.print("Bitte geben Sie den Exponent ein: ");
	exponent = scanner.nextInt();
		
	ergebnis = potenz(basis,exponent);
	System.out.print("Ergebnis: " + ergebnis);
	scanner.close();
    }
}
