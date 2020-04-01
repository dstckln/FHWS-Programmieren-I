package ueb10;
import java.util.Scanner;

public class BSprache {

    public static String spielen(String strEingabe) {
	char[] arrEingabe = strEingabe.toCharArray();
	char[] arrVokale = {'a','e','i','o','u'};
	int counter = 0; //Anzahl Vokale 
	int j = 0; //Index für Ergebnis Array
	String strAusgabe; //Rückgabe-String
		
	for (int i = 0;i < arrEingabe.length;i++) { //Anzahl Vokale zählen, um Länge vom Ergebnis Array zu bestimmen
	    for (int v = 0;v < arrVokale.length;v++) {
		if (arrEingabe[i] == arrVokale[v]) {
		    counter++;
		}
	    }
	}
		
	counter *= 2; //mal 2, da Vokal noch einmal hinten dran kommt
	char[] arrAusgabe = new char[arrEingabe.length+counter]; //Array mit b-Satz
	
	for (int i = 0;i < arrEingabe.length;i++) { //Erstelle B-Satz
		
	    arrAusgabe[j] = arrEingabe[i];
		
	    for (int v = 0;v < arrVokale.length;v++) {
		if (arrEingabe[i] == arrVokale[v]) {
		    j++;
		    arrAusgabe[j] = 'b';
		    j++;
		    arrAusgabe[j] = arrEingabe[i];
		}
	    }
	    j++;
	}
		
	strAusgabe = String.valueOf(arrAusgabe);
	return strAusgabe;
    }
	
    public static void main(String[] args) {
	String strEingabe;
	String strAusgabe;
	Scanner scanner = new Scanner(System.in);
		
	System.out.print("übergebene Zeichenfolge: ");
	strEingabe = scanner.nextLine();
	
	strAusgabe = spielen(strEingabe);
	
	System.out.print("zurückgelieferte Zeichenfolge: " + strAusgabe);
	scanner.close();
    }
}
