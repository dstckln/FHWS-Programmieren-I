package ueb04;
import java.util.Scanner;

public class Zeichenpruefung {

    public static void main(String[] args) {
	/* Deklaration + Initialisierung */
	char zeichenA;
	char zeichenB;
	int ergebnis;
	String hilfsString;
	Scanner scanner = new Scanner(System.in); //scanner Objekt erstellen
		
	/* Eingabe */
	System.out.print("Geben Sie das erste Zeichen ein (f/t): ");
	hilfsString = scanner.nextLine(); //Texteingabe
	zeichenA = hilfsString.charAt(0); //erstes Zeichen von text

	System.out.print("Geben Sie das zweite Zeichen ein (f/t): ");
	hilfsString = scanner.nextLine(); //Texteingabe
	zeichenB = hilfsString.charAt(0); //erstes Zeichen von text

	/* Bedingte Ausgabe */
	if (zeichenA == 'f' && zeichenB == 'f') {
		ergebnis = 0;
		System.out.print("Ausgabewert: " + ergebnis);
	} else if (zeichenA == 'f' && zeichenB == 't') {
		ergebnis = 1;
		System.out.print("Ausgabewert: " + ergebnis);
	} else if (zeichenA == 't' && zeichenB == 'f') {
		ergebnis = 2;
		System.out.print("Ausgabewert: " + ergebnis);
	} else if (zeichenA == 't' && zeichenB == 't') {
		ergebnis = 3;
		System.out.print("Ausgabewert: " + ergebnis);
	} else {
		System.out.print("Ungültige Eingabe!");
	} 
	scanner.close();
    }
}

