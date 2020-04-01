package ueb07;
import java.util.Scanner;

public class Fakultaet {

    public static int fakultBerechnen(int zahl) {
	int ergebnis;
	
	if (zahl==0) { //Wenn zahl=0,1 kein Schleifendurchlauf. 
		ergebnis = 0;
	} else {
		ergebnis = 1;
	}
	
	for ( ; zahl>1; zahl--) { //Letzte Multiplikation (1x) wird ignoriert.
		ergebnis *= zahl;
	}
	return ergebnis;
    }
	
    public static void main(String[] args) {
	int zahl;
	int ergebnis;
	Scanner scanner = new Scanner(System.in);
		
	System.out.print("Bitte geben Sie eine Zahl ein: ");
	zahl = scanner.nextInt();
	ergebnis = fakultBerechnen(zahl);
	System.out.println(ergebnis);
	scanner.close();
    }
}
