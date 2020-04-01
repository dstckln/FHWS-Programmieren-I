package ueb07;
import java.util.Scanner;

public class Runden {
	
    //Aufgabe a.)
    public static int runden(double zahl) {
	int gerundet = (int) (zahl + 0.5);
	return gerundet;
    }
	
    //Aufgabe b.)
    public static double rundenNachkomma(double zahl, int nachkomma) {
	double runder = 0.5;
	double gerundet;
	final int KOMPOS = 10; //bestimmt position des Kommas, abhängig von Anzahl Schleifendurchlauf
	int teiler = 1; //enthält Wert von KOMPOS^n
	
	for (int i=1; i<=nachkomma;i++) {
		runder /= 10;
		teiler *= KOMPOS;
	}
		
	gerundet = (zahl + runder) * teiler;
	gerundet = (int) gerundet;
	gerundet /= teiler;
	return gerundet;
    }
	
    public static void main(String[] args) {
	double zahl;
	int gerundet; //Aufgabe a.)
	double gerundetNachkomma; //Aufgabe b.)
	int nachkomma;
	Scanner scanner = new Scanner(System.in);

	// Aufgabe a.)
	System.out.print("a.) Bitte geben Sie eine zu rundende Zahl ein: ");
	zahl = scanner.nextDouble();
	gerundet = runden(zahl);
	System.out.println("a.) " + gerundet);
		
	// Aufgabe b.)
	System.out.print("b.) Bitte geben Sie eine weitere zu rundende Zahl ein: ");
	zahl = scanner.nextDouble();
	System.out.print("b.) Auf wie viel Nachkommastellen runden? ");
	nachkomma = scanner.nextInt();
	gerundetNachkomma = rundenNachkomma(zahl, nachkomma);
	System.out.println("b.) " + gerundetNachkomma);
		
	scanner.close();
    }
}
