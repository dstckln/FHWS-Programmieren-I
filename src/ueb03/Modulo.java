package ueb03;
import java.util.Scanner;

public class Modulo {

    public static void main(String[] args) {
		
	/* Deklaration + Initialisierung */
	final int MODULO = 100;
	int inputZahl;
	int ergebnis;		
	Scanner scanner = new Scanner(System.in); //Objekt scanner erstellen
		
	/* Eingabe */
	System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
	inputZahl = scanner.nextInt(); //Eingabeaufforderung Zahl
		
	/* Verarbeitung */
	ergebnis = inputZahl % MODULO; //modulo von Eingabe
		
	/* Bedingte Ausgabe */
	if (ergebnis == 0) {
		System.out.print(inputZahl + " ist ganzzahlig durch " + MODULO + " teilbar. " + 
				 "Der Rest beträgt " + ergebnis);
	} else {
		System.out.print(inputZahl + " ist nicht ganzzahlig durch " + MODULO + " teilbar. " + 
						 "Der Rest beträgt " + ergebnis);
	}
		
	scanner.close(); //scanner schließen
    }
}
 