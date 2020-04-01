package ueb07;
import java.util.Scanner;

public class Dreieck {
	
    public static void sterne(int zeilen) { //Kein Rückgabewert
	int laufindex = 1;
	int leerzeichen;
		
	for (; zeilen>=laufindex;laufindex++) {
		leerzeichen = zeilen-laufindex; //Leerzeichen abhängig von eingegebene Zahl, -1 bei jedem durchlauf
		
		for (; leerzeichen>=1; leerzeichen--) { //Leerzeichen-- ausgeben
			System.out.print(" ");
		}
		
		for (int sterne=1;sterne<=laufindex; sterne++) { //Sterne++ ausgeben
			System.out.print("* ");
		}
		System.out.println(); //Zeilenumbruch
	}
    }
	
    public static void main(String[] args) {
	int zeilen;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Bitte geben Sie die Anzahl Zeilen ein: ");
	zeilen = scanner.nextInt();
	sterne(zeilen); //Aufruf Methode
	scanner.close();
    }
}
