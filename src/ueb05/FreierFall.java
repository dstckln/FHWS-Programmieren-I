package ueb05;
import java.util.Scanner;

public class FreierFall {

    public static void main(String[] args) {

	int vergangeneZeit;
	final double FB = 9.80665; //Fallbeschleunigung
	double strecke;
	Scanner scanner = new Scanner(System.in);
		
	System.out.print("Bitte Falldauer in Sekunden eingeben: ");
	vergangeneZeit = scanner.nextInt();

	for (int i = 1; i <= vergangeneZeit; i++) {
		strecke = (0.5*FB)*Math.pow(i, 2);
		System.out.println("a.) Zeit: " + i + " Sekunden: Zurückgelegte Strecke: " + strecke + " m");
	}
		
	for (int i = 1; i <= vergangeneZeit; i+=5) { // Ausgabe jede 5. Sekunde
		strecke = (0.5*FB)*Math.pow(i, 2);
		System.out.println("b.) Zeit: " + i + " Sekunden: Zurückgelegte Strecke: " + strecke + " m");
	}
		scanner.close();
	}
}
