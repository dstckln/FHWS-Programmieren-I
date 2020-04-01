package ueb02;
public class Tausch {

    public static void main(String[] args) {
		
	/* Deklaration + Initialisierung */
	int x = 5;
	int y = 7;
	int temp; //Wert zwischenspeichern
		
	/* Verarbeitung */
	System.out.println("X vor dem Tausch " + x); //Vor dem Tausch
	System.out.println("Y vor dem Tausch " + y);
		
	temp = x; //Tausch
	x = y;
	y = temp;
		
	/* Ausgabe */
	System.out.println("X nach dem Tausch " + x); //Nach dem Tausch
	System.out.println("Y nach dem Tausch " + y);
    }
}
