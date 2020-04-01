package ueb03;
public class Wuerfelwurf {

    public static void main(String[] args) {
	/* Deklaration + Initialisierung */
	double zufallszahl; //0 - 0.9999999999999999
	int wuerfel;
		
	/* Verarbeitung */
	zufallszahl = Math.random() * 6 + 1; //1 - 6.999999999999999
	wuerfel = (int) zufallszahl; //cast um abzurunden/abzuschneiden = int 1 - 6
		
	/* Bedingte Ausgabe */
	if (wuerfel == 1) {
		System.out.println("Eins gewürfelt");
	} else if (wuerfel == 2) {
		System.out.println("Zwei gewürfelt");
	} else if (wuerfel == 3) {
		System.out.println("Drei gewürfelt");
	} else if (wuerfel == 4) {
		System.out.println("Vier gewürfelt");
	} else if (wuerfel == 5) {
		System.out.println("Fünf gewürfelt");
	} else if (wuerfel == 6) {
		System.out.println("Sechs gewürfelt");
	}	
    }
}
