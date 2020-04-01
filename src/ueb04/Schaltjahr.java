package ueb04;
import java.util.Scanner;

public class Schaltjahr {

    public static void main(String[] args) {
	/* Deklaration + Initialiserung */
	int eingabe;
	Scanner scanner = new Scanner(System.in);
	
	/* Eingabe */
	System.out.print("Bitte geben Sie eine Jahreszahl ein: ");
	eingabe = scanner.nextInt();
		
	/* Bedingte Ausgabe */
	if((eingabe % 4 == 0) && ((eingabe % 100 != 0) || (eingabe % 400 == 0))){
		System.out.println("Gültiges Schaltjahr!");
	} else {
		System.out.println("Kein Schaltjahr!");
	}
	scanner.close();
    }
}
