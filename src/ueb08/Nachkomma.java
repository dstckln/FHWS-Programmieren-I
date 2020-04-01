package ueb08;
import java.util.Scanner;

public class Nachkomma {

    public static double gebrochenerAnteil(double eingabe) {
	double ergebnis = eingabe % 1;
	return ergebnis; 
    }
	
    public static void main(String[] args) {
	double eingabe;
	double ergebnis;
	Scanner scanner = new Scanner(System.in);
		
	System.out.print("Bitte geben Sie eine Zahl ein: ");
	eingabe = scanner.nextDouble();
	ergebnis = gebrochenerAnteil(eingabe);

	System.out.print("Der Aufruf der Methode mit dem Zahlenwert " + eingabe + " würde die Zahl " + ergebnis + " liefern.");
	scanner.close();
    }
}
