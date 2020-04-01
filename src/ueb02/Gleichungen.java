package ueb02;
public class Gleichungen {

    public static void main(String[] args) {
	
	/* Deklaration + Initialisierung */
	double p = 2;
	double q = 5;
	double x1;
	double x2;
	double potenz1;
	double potenz2;
		
	/* Verarbeitung */
	potenz1 = Math.pow(p/2, 2) - q; //Formel: x1 = -p/2 + wurzel(p/2)^2 - q
	x1 = -(p/2) + Math.sqrt(potenz1); //Funktion zum Wurzel ziehen

	potenz2 = Math.pow(p/2, 2) - q; //Formel: x2 = -p/2 - wurzel(p/2)^2 - q
	x2 = -(p/2) - Math.sqrt(potenz2);
		
	/* Ausgabe */
	System.out.println("x1 = " + x1);
	System.out.println("x2 = " + x2);
    }
}
