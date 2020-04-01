package ueb09;
public class Lottoziehung {
	
    public static int[] sortOhneDupl(int[] array) {
	int temp;
		
	for (int i = 0; i < array.length; i++) {
	    for (int n = 1; n < array.length-i; n++) { //Ignoriert nach 1. Durchlauf letzte Stelle - weil dort immer größte Zahl steht
		if (array[n] < array[n-1]) { //Vergleiche 2. Stelle mit 1. Stelle
		    temp = array[n-1]; //Sichere 1. Stelle
		    array[n-1] = array[n]; //Überschreibe 1. Stelle mit 2. Stelle
		    array[n] = temp; //Überschreibe 2. Stelle mit 1. Stelle
		}
	    }
	}
		
	for (int i = 0; i < array.length-1; i++) { //Duplikate entfernen
	    if (array[i] == array[i+1]) { //Vergleich 1. Stelle mit 2. Stelle
		array[i] = (int) (Math.random()*49+1); //Neuer Wert
		sortOhneDupl(array); //Neu sortieren, solange bis keine Duplikate gefunden
	    }
	}
	return array;
    }
	
    public static void main(String[] args) {
	int[] lottozahlen=new int[6];

	for (int i = 0; i < lottozahlen.length; i++) { //Lottozahlen bestimmen
	    lottozahlen[i] = (int) (Math.random()*49+1); 
	}
	sortOhneDupl(lottozahlen); //Sortieren
		
	for (int i = 0; i<lottozahlen.length; i++) { //Ausgabe
	    System.out.println(lottozahlen[i]);
	}
    }
}
