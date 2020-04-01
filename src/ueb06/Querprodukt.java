package ueb06;
import java.util.Scanner;

public class Querprodukt {

    public static void main(String[] args) {
	int eingabe;
	int summe;
	int temp; //für Ausgabe
	Scanner scanner = new Scanner(System.in);
		
	while (true) { //Loop bis gültige Eingabe
		System.out.print("Bitte geben Sie eine Zahl ein: ");
		eingabe = scanner.nextInt();
		
		if (eingabe > 0 && eingabe <= 1000000) {
			summe = 1;
			break;
		} else if (eingabe == 0) {
			summe = 0;
			break;
		} else {
			System.out.println("FEHLER – Zahl ist ungueltig.");
		}
	}
	temp = eingabe;
	while (eingabe > 0) { //Solange Rest vorhanden
		summe *= eingabe % 10; //letzte Ziffer mit summe multiplizieren
		eingabe /= 10; //letzte Ziffer abschneiden
	}
		
	System.out.print("Das Querprodukt der Zahl " + temp + " beträgt " + summe);
	scanner.close();
    }
}
