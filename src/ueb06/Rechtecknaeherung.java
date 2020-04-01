package ueb06;
import java.util.Scanner;
public class Rechtecknaeherung {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.print("Geben sie die Anzahl Rechtecke an: ");
	int anzahlRechtecke = scanner.nextInt();

	double pi = 0.0;
	double rechteck = 0.0;
	double hoehe = 0.0;
	double radius = 1.0;
		
	for (int i = 1; i <= anzahlRechtecke; i++) {
		rechteck = ((double) i) / ((double) anzahlRechtecke);
		hoehe = Math.sqrt (radius - rechteck*rechteck);

		pi += 4.0*(radius/anzahlRechtecke)*hoehe;
	} 
	pi += 4/(double)(anzahlRechtecke);
	System.out.println(anzahlRechtecke + " Rechtecke ergeben Pi = " + pi);
	
	scanner.close();
	}
}
