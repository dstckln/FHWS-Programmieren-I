package ueb02;
public class Uhrzeit2 {

    public static void main(String[] args) {
		
	/* Deklaration + Initialisierung */
	int stunden = 12;
	int minuten = 0;
	int sekunden = 0;
	double sekSeitMitternacht;
	double sekBisMitternacht;
	double sekTagGesamt;
	double tagProzent;
		
	/* Verarbeitung */
	sekSeitMitternacht = ((stunden*60) * 60) + (minuten*60) + sekunden; //HH:MM:SS Uhr in Sek.
	sekTagGesamt = ((23*60) * 60) + (59*60) + 59; //23:59:59 Uhr in Sek.
	sekBisMitternacht = sekTagGesamt - sekSeitMitternacht; //Sek. bis Mitternacht
	tagProzent = 100 * sekSeitMitternacht / sekTagGesamt; //Wie viel % des Tages sind vergangen
		
	/* Ausgabe */
	System.out.println("4a.) Es ist " + stunden + ":" + minuten + ":" + sekunden + " Uhr." +
						" Seit Mitternacht sind " + sekSeitMitternacht + " Sek. vergangen.");
		
	System.out.println("4b.) Es ist " + stunden + ":" + minuten + ":" + sekunden + " Uhr." +
			" Bis Mitternacht sind es " + sekBisMitternacht + " Sek.");
		
	System.out.println("4c.) Es ist " + stunden + ":" + minuten + ":" + sekunden + " Uhr." +
			" Prozentual sind " + tagProzent + "% des tages vergangen.");
    }
}
