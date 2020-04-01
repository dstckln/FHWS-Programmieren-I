package ueb10;
import java.util.Scanner;
public class Galgenmaenchen {
    /**
     * Prüft ob Zeichen in Char-Array vorhanden ist
     * @param arrEingabe Char-Array
     * @param strEingabe Zu Prüfendes Zeichen als String
     * @return Boolean (True, False)
     */
    public static boolean pruefBuchstabeBereitsGefunden(char[] arrEingabe, String strEingabe) {
	if (new String(arrEingabe).contains(strEingabe)) {
	    return true;
	} else {
	    return false;
	}
    }
	
    public static void main(String[] args) {
	String[] arrWortlist = {"Hallowelt", "Programmieren", "Wirtschaftsinformatik", "Fachhochschule", "Wuerzburg",
				"Eclipse", "Java", "Galgenmaenchen", "Computer", "Methoden", "Schleife", "StaticVoidMain",
				"SteveJobs", "Microsoft", "SheldonCooper", "Schweinfurt", "I-phone",
				"Datenbanken", "Volkswagen", "Android", "Apple"}; //Wörter-Liste
		
	int ausgesuchtesWort = (int) (Math.random()*arrWortlist.length); //Zu Suchendes Wort zufällig bestimmen
	int wieVieleGefunden = 0; //Wie viele Buchstaben wurden gefunden
	int anzahlVersuche = 1;
	String strWort = arrWortlist[ausgesuchtesWort]; //String aus Wordlist erstellen
	String strEingabe = ""; //String für Eingabe
	String strAusgabe; //String für Ausgabe-Anzeige
	char[] arrWort = strWort.toCharArray(); //Array aus String erstellen
	char[] arrErg = new char[arrWort.length]; //Vom suchenden Wort abhängiges char Array erstellen
	char chEingabe; //eingabe
	boolean boolAlleGefunden = false;
	boolean boolBuchstabeBereitsGefunden = false;
	char[] gefundeneBuchstaben = new char[arrWort.length];
	Scanner scanner = new Scanner(System.in);

	for (int i = 0; i < arrErg.length;i++) { //Ergebnis Array mit "_" belegen
	    arrErg[i] = '_';
	}

	for (; anzahlVersuche <= 15 && boolAlleGefunden == false; anzahlVersuche++) { //Solange 15 Versuche und nicht alle Buchstaben gefunden
	    strAusgabe = String.valueOf(arrErg);
	    System.out.println(anzahlVersuche + ". Versuch: " + strAusgabe);
	    System.out.println("Eingabe Buchstabe: ");
	    strEingabe = scanner.nextLine();
	    while (strEingabe.length()==0) { //Keine Eingabe = Ungültige Eingabe
		System.out.println(anzahlVersuche + ". Versuch: " + strAusgabe);
		System.out.println("Eingabe Buchstabe: ");
		strEingabe = scanner.nextLine();
	    }
	    chEingabe = strEingabe.charAt(0);
	    strEingabe = String.valueOf(chEingabe);
	    for (int n = 0; n < gefundeneBuchstaben.length;n++) {
		boolBuchstabeBereitsGefunden = pruefBuchstabeBereitsGefunden(gefundeneBuchstaben,strEingabe); //Prüfe ob Buchstabe bereits gefunden
		if (gefundeneBuchstaben[n]==0 && boolBuchstabeBereitsGefunden==false) { //Wenn noch nicht gefunden und Array-Feld leer
		    gefundeneBuchstaben[n] = chEingabe;
		    break;
		}
	    }
			
	    for (int i = 0;i < arrWort.length;i++) {
		strEingabe = String.valueOf(chEingabe);
		String strA = String.valueOf(arrWort[i]); //Wandle char-Element in String um, um mit equalsIgnoreCase zu vergleichen
		if (strEingabe.equalsIgnoreCase(strA) && boolBuchstabeBereitsGefunden==false) { //Wenn Buchstabe in Array und noch nicht gefunden
		    arrErg[i] = arrWort[i];
		    wieVieleGefunden++; //Wie viele Buchstaben gefunden?
		}
	    }
	    if (wieVieleGefunden >= arrErg.length) { //Alle Buchstaben gefunden
		strAusgabe = String.valueOf(arrErg);
		System.out.println("Gewonnen! Das gesuchte Wort war: " + strAusgabe);
		boolAlleGefunden = true; 
	    }
	}
	if (anzahlVersuche >= 15 && boolAlleGefunden==false) {
	    strAusgabe = String.valueOf(arrWort);
	    System.out.println("Verloren! Das gesuchte Wort war: " + strAusgabe);
	}
	scanner.close();
    }
}
