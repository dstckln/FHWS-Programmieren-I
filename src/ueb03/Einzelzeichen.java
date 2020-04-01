package ueb03;
import java.util.Scanner;

public class Einzelzeichen {

    public static void main(String[] args) {
		
	/* Deklaration + Initialisierung */
	char zeichen;
	String text;
	Scanner scanner = new Scanner(System.in); //scanner Objekt erstellen
		
	/* Eingabe */
	System.out.print("Geben Sie ein Zeichen ein: ");
	text = scanner.nextLine(); //Texteingabe
	zeichen = text.charAt(0); //erstes Zeichen von text

	/* Ausgabe */
	if (zeichen == '0' || zeichen == '1') { //Prüfung '' statt "" bei Char
		System.out.println("binäre Ziffer!");
		System.out.println("hexa Ziffer!");
		System.out.println("oktale Ziffer!");
	} else if (zeichen >= '2' && zeichen <= '7') {
		System.out.println("hexa Ziffer!");
		System.out.println("oktale Ziffer!");
	} else if (zeichen >= 'A' && zeichen <= 'F') {
		System.out.println("Großbuchstabe!");
		System.out.println("hexa Ziffer!");
	} else if ((zeichen >= '8' && zeichen <= '9') || (zeichen >= 'a' && zeichen <= 'f')) {
		System.out.println("hexa Ziffer!");
	} else if (zeichen >= 'G' && zeichen <= 'Z') {
		System.out.println("Großbuchstabe!");
	} else {
		System.out.print("Unbekannt!");
	}
	scanner.close();
    }
}
