package ueb11;

public class Auto {
	private String marke, farbe;
	private int ps, hubraum, baujahr;
	private double preis, verbrauch;
	static int produzierteAutos;
	
	//Konstruktor
	public Auto() {
		produzierteAutos++;
	}
	
	public Auto (String marke, String farbe, int ps, int hubraum, int baujahr, double preis, double verbrauch) {
		this(); //produzierte Autos
		this.marke=marke;
		this.farbe=farbe;
		this.ps=ps;
		this.hubraum=hubraum;
		this.baujahr=baujahr;
		this.preis=preis;
		this.verbrauch=verbrauch;
	}

	//getter
	public String getMarke() {
		return marke;
	}
	public String getFarbe() {
		return farbe;
	}
	public int getPS() {
		return ps;
	}
	public int getHubraum() {
		return hubraum;
	}
	public int getBaujahr() {
		return baujahr;
	}
	public double getVerbrauch() {
		return verbrauch;
	}
	public double getPreis() {
		return preis;
	}
	
	//setter
	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}
	public void setPS (int ps) {
		if (ps <= 0) {
			System.out.println("PS: Ungültige Eingabe!");
		} else {
			this.ps = ps;
		}
	}
	public void setVerbrauch (double verbrauch) {
		if (verbrauch <= 0) {
			System.out.println("Verbrauch: Ungültige Eingabe!");
		} else {
			this.verbrauch = verbrauch;
		}
	}
	public void setPreis(double preis) {
		if (preis <= 0) {
			System.out.println("Preis: Ungültige Eingabe!");
		} else {
			this.preis = preis;
		}
	}
	
	//Funktionen
	public Auto autoMitMeistenHubraum(Auto[] fuhrpark) {
		Auto auto = new Auto();
		int hubraumVergleich = 0;
		for (int i=0; i<fuhrpark.length;i++) {
			if (fuhrpark[i].getHubraum() > hubraumVergleich) {
				hubraumVergleich = fuhrpark[i].getHubraum();
				auto = fuhrpark[i];
			}
		}
		return auto;
	}
	}

