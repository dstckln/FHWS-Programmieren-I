package ueb04;
import java.util.Scanner;

public class Matrikelnummer {

    public static void main(String[] args) {
	
	/* Deklaration + Initialisierung */
	int matrikelnummer;
	int ersteZweiStellen;
	Scanner scanner = new Scanner(System.in);
	
	/* Eingabe */
	System.out.print("Bitte geben Sie Ihre Matrikelnummer ein: ");
	matrikelnummer = scanner.nextInt();
	
	/* Verarbeitung */
	ersteZweiStellen = matrikelnummer / 100000;
		
	/* Bedingte Ausgabe */
	if (matrikelnummer > 9999999 || matrikelnummer < 1000000) {
		System.out.println("Fehler: Matrikelnummer muss siebenstellig sein!");
	} else if (ersteZweiStellen == 50 || ersteZweiStellen == 51 || ersteZweiStellen == 61) {
		System.out.println("Gültige Matrikelnummer!");
	} else {
		System.out.println("Fehler: Das ist keine gültige Matrikelnummer!");
	}
	scanner.close();	
    }
}
