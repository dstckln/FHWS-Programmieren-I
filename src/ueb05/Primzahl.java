package ueb05;
import java.util.Scanner;

public class Primzahl {

    public static void main(String[] args) {

	int eingabe;
	boolean prim = true;
	Scanner scanner = new Scanner(System.in);
		
	System.out.print("Bitte zu untersuchende Zahl eingeben: ");
	eingabe = scanner.nextInt();
	
	for (int divisor=2; prim==true && divisor<eingabe; divisor++) { 
		if (eingabe % divisor==0) { //Prüfen Rest 0
			prim=false; //Keine Primzahl sobald Rest 0 -> Abbruch
		}
	}
		
	if (prim && eingabe!=1) { // Die 1 seperat abfragen
		System.out.print("Untersuchte Zahl ist Primzahl!");
	} else {
		System.out.print("Untersuchte Zahl ist keine Primzahl!");
	}
	scanner.close();
    }
}
