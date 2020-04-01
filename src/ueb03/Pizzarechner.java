package ueb03;
import java.util.Scanner;

public class Pizzarechner {

    public static void main(String[] args) {
	
	/* Deklaration + Initialisierung */
	final double PI = Math.PI;
	double durchmesserPizza1;
	double durchmesserPizza2;
	double radiusPizza1;
	double radiusPizza2;
	double preisPizza1;
	double preisPizza2;
	double flaechePizza1;
	double flaechePizza2;
	double verhaeltnisPizza1;
	double verhaeltnisPizza2;
	Scanner scanner = new Scanner(System.in); //scanner Objekt erstellen
		
	
	/* Eingabe */ 
	System.out.print("Pizza 1: Bitte geben Sie den Durchmesser ein: ");
	durchmesserPizza1 = scanner.nextInt(); //Eingabe Durchmesser Pizza1
	System.out.print("Pizza 1: Bitte geben Sie einen Preis ein: ");
	preisPizza1 = scanner.nextDouble(); //Eingabe Preis Pizza1
		
	System.out.print("Pizza 2: Bitte geben Sie den Durchmesser ein: ");
	durchmesserPizza2 = scanner.nextInt(); //Eingabe Durchmesser Pizza2
	System.out.print("Pizza 2: Bitte geben Sie einen Preis ein: ");
	preisPizza2 = scanner.nextDouble(); //Eingabe Preis Pizza2
		
		
	/* Verarbeitung */ 
	radiusPizza1 = durchmesserPizza1 / 2; //Radius berechnen
	radiusPizza2 = durchmesserPizza2 / 2; 
		
	flaechePizza1 = PI * (Math.pow(radiusPizza1,2)); //Fläche berechnen
	flaechePizza2 = PI * (Math.pow(radiusPizza2,2)); 
		
	verhaeltnisPizza1 = flaechePizza1 / preisPizza1; //Verhältnis Fläche:Preis berechnen
	verhaeltnisPizza2 = flaechePizza2 / preisPizza2;
		
		
	/* Bedingte Ausgabe */
	if (verhaeltnisPizza1 == verhaeltnisPizza2) {
		System.out.println("Das Größen-/Preisverhältnis beider Pizzen sind gleich");
	} else if (verhaeltnisPizza1 > verhaeltnisPizza2) {
		System.out.println("Pizza1 hat das bessere Größen-/Preisverhältnis.");
	} else {
		System.out.println("Pizza2 hat das bessere Größen-/Preisverhältnis.");
	}
	scanner.close(); //scanner schließen
    }
}
