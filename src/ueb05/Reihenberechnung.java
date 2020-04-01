package ueb05;
public class Reihenberechnung {

    public static void main(String[] args) {
		 
	final double GRENZWERT = Math.pow(10, -5);
	int laufindex = 1; // k
	double summand = 0.0;
	double summe = 0.0;
	
	do { 
		
		summand = 1.0/Math.pow(laufindex, 2);
		summe += summand;

		//System.out.println(laufindex + ". Durchlauf - Ergebnis: " + summand);
		System.out.printf(laufindex + ". Durchlauf - Ergebnis: %f\n", summand); //printf, da sonst Ausgabe mit Wissensch. Notation
		laufindex++;
			
	} while (summand > GRENZWERT);
		
	summe *= 6.0; // Reihe multiplizieren
	laufindex -= 1; // Weil Fußgesteuerte Schleife
	System.out.println("Das Summenergebnis lautet: " + summe + " - Die Schleife ist " + laufindex + " mal durchlaufen.");
    }
}
