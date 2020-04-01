package ueb11;

public class Autoverwaltung {

	//Übungsblatt 12
	private static double berechneUmsatz(double durchschnittspreis) {
		double umsatz = durchschnittspreis * Auto.produzierteAutos;
		return umsatz;
	}
	
	private static double berechneDurchschnittspreis(Auto[] fuhrpark) {
		double durchschnittspreis = 0;
		double summe = 0;
		double summand = 0;
		final double UST = 1.19;
		for (int i = 0;i<fuhrpark.length;i++) {
			summand = fuhrpark[i].getPreis()*UST;
			summe += summand;
		}
		durchschnittspreis = summe/Auto.produzierteAutos;
		return durchschnittspreis;
	}
	
	public static void main(String[] args) {

		final int ANZAHL_AUTOS = 3;

		Auto[] fuhrpark = new Auto[ANZAHL_AUTOS];
		fuhrpark[0] = new Auto("BMW","blau",150,3000,2010,25000.0,8); 
		fuhrpark[1] = new Auto("VW","silber",90,2000,2007,9000.0,6);
		fuhrpark[2] = new Auto("AUDI","schwarz",80,2500,2015,30000.0,9);	

		System.out.println("Umsatz: " + berechneUmsatz(berechneDurchschnittspreis(fuhrpark)));
		
		Auto meisteHubraum = new Auto(); //eigenes Objekt für Auto mit meisten Hubraum
		System.out.println("Marke: " + meisteHubraum.autoMitMeistenHubraum(fuhrpark).getMarke());
		System.out.println("Farbe: " + meisteHubraum.autoMitMeistenHubraum(fuhrpark).getFarbe());
		System.out.println("PS: " + meisteHubraum.autoMitMeistenHubraum(fuhrpark).getPS());
		System.out.println("Hubraum: " + meisteHubraum.autoMitMeistenHubraum(fuhrpark).getHubraum()+"ccm");
		System.out.println("Baujahr: " + meisteHubraum.autoMitMeistenHubraum(fuhrpark).getBaujahr());
		System.out.println("Verbrauch: " + meisteHubraum.autoMitMeistenHubraum(fuhrpark).getVerbrauch()+"l auf 100km");
		System.out.println("Preis: " + meisteHubraum.autoMitMeistenHubraum(fuhrpark).getPreis()+" Euro");
	}
}
