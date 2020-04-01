package ueb09;
public class Konkatenation {

    public static char[] konkatenieren(char arrEins[], char arrZwei[]) {
	char[] arrErgebnis = new char[arrEins.length+arrZwei.length]; //Neues Array mit Länge beider übergebenen Arrays

	for (int i = 0; i < arrEins.length; i++) { //Ergebnis Array = Inhalt 1. Array
	    arrErgebnis[i] = arrEins[i];
	}
	for (int j=0; j < arrZwei.length; j++) { //Ergebnis Array = Inhalt 2. Array
	    arrErgebnis[arrEins.length+j] = arrZwei[j]; //Index von Ergebnis Array entspricht dem des 1. Arrays
	}
	return arrErgebnis;
    }
	
    public static void main(String[] args) {
	char[] arrEins = "Test123".toCharArray();
	char[] arrZwei = "Prog1".toCharArray();
	
	char[] arrErgebnis = new char[arrEins.length+arrZwei.length];
	arrErgebnis = konkatenieren(arrEins,arrZwei);
		
	System.out.println(arrErgebnis);
    }
}
