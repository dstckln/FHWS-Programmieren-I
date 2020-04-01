package ueb09;
import java.util.Scanner;
public class ArithmetischesMittel {

    public static void main(String[] args) {
	int anzahlWerte;
	double max = Double.MIN_VALUE; //Achtung vertauscht; dummy Wert
	double min = Double.MAX_VALUE;
	double arithMittel = 0;
	double stdAbweichung = 0;
	Scanner scanner = new Scanner(System.in);
		
	System.out.print("Anzahl der einzulesenden Werte: ");
	anzahlWerte = scanner.nextInt();
		
	if (anzahlWerte <= 0) {
	    System.out.println("Ungültiger Wert!");
	} else {
	    double werteArray[] = new double[anzahlWerte]; //Eingegebene Zahl bestimmt Arraygröße
			
	    //Arithemtisches Mittel
	    for (int i=0;i<werteArray.length;i++) {
		System.out.print(i+1 + ". Wert: "); //+1 nur für Ausgabe, da Array mit 0 beginnt
		werteArray[i] = scanner.nextDouble();
		if (werteArray[i] < min) min = werteArray[i];
		if (werteArray[i] > max) max = werteArray[i];
			arithMittel += werteArray[i];
		}
		arithMittel /= anzahlWerte;
			
		//Standardabweichung
		for (int i=0;i<werteArray.length;i++) {
		    stdAbweichung +=Math.pow(werteArray[i]-arithMittel,2); 
		}
		stdAbweichung /= anzahlWerte;

		System.out.println("Kleinster Wert: " + min);
		System.out.println("Größter Wert: " + max);
		System.out.println("Arithemtisches Mittel: " + arithMittel);
		System.out.println("Standardabweichung: " + stdAbweichung);
	}
	scanner.close();
    }
}
