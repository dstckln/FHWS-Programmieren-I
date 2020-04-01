package ueb05;
public class Einmaleins {

    public static void main(String[] args) {
		
	final int GRENZWERT = 10; //Alle Produkte des kleinen 1x1
	int summe;
		
	for (int reihe = 1; reihe <= GRENZWERT; reihe++) { //Schleife Reihen
		
		for (int faktor = 1; faktor <= GRENZWERT; faktor++) { //Schleife Faktoren
			summe = reihe * faktor;
			System.out.println(reihe + " x " + faktor + " = " + summe);
		}
	}
    }
}
