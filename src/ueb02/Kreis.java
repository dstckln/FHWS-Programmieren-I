package ueb02;
public class Kreis {

    public static void main(String[] args) {

	/* Deklaration + Initialisierung */
	double radius = 1;
	double flaeche;
	double umfang;
	double volumen;

	/* Verarbeitung */
	flaeche = Math.PI * (Math.pow(radius, 2)); //Fläche = PI * radius^2
	umfang = 2 * Math.PI * radius; //Umfang = 2 * PI * radius
	volumen = (4 * Math.PI * Math.pow(radius, 3)) / 3; //Kugelvolumen = 4/3 * PI * radius^3
		
	/* Ausgabe */
	System.out.println("Der Kreis hat eine Fläche von: " + flaeche);
	System.out.println("Der Kreis hat einen Umfang von: " + umfang);
	System.out.println("Die Kugel hat ein Volumen von: " + volumen);
		
    }
}
