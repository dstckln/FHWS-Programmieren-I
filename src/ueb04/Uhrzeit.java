package ueb04;
import java.util.Scanner;

public class Uhrzeit {

    public static void main(String[] args) {
		
	/* Deklaration + Initialisierung */
	int stunden;
	int minuten;
	int sekunden;
	Scanner scanner = new Scanner(System.in);

	/* Eingabe */
	System.out.print("Bitte geben Sie die Stunden ein: ");
	stunden = scanner.nextInt();
	System.out.print("Bitte geben Sie die Minuten ein: ");
	minuten = scanner.nextInt();
	System.out.print("Bitte geben Sie die Sekunden ein: ");
	sekunden = scanner.nextInt();

	/* Ausgabe */
	if (stunden >= 24 || minuten >= 60 || sekunden >= 60) {
		System.out.print(stunden + ":" + minuten + ":" + sekunden + " Uhr " + "ist keine gültige Uhrzeit!");
	} else {
		System.out.println("Es ist " + stunden + ":" + minuten + ":" + sekunden + " Uhr.");
	}
	scanner.close();
    }
}
