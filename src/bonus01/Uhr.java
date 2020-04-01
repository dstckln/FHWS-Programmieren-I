package bonus01;

public class Uhr {
	private int stunden;
	private int minuten;
	private int sekunden;
	
	//Konstruktor
	public Uhr(int stunden, int minuten, int sekunden) {
		if ((stunden>=24 || stunden<0) || (minuten>=60 || minuten<0) || (sekunden>=60 || sekunden<0)) {
			this.stunden=12;
			this.minuten=0;
			this.sekunden=0;
		} else {
			this.stunden = stunden;
			this.minuten = minuten;
			this.sekunden = sekunden;
		}
	}
	
	//getter
	public int getStunden() {
		return stunden;
	}
	public int getMinuten() {
		return minuten;
	}
	public int getSekunden() {
		return sekunden;
	}
	
	//setter
	public void setUhr(int stunden, int minuten, int sekunden) {
		if ((stunden>=24 || stunden<0) || (minuten>=60 || minuten<0) || (sekunden>=60 || sekunden<0)) {
			System.out.println("Fehlerhafte Zeitangabe!");
		} else {
			this.stunden=stunden;
			this.minuten=minuten;
			this.sekunden=sekunden;
		}
	}
	
	public void naechsteSek() {
		this.sekunden+=1;
		if (this.sekunden>59) {
			this.sekunden=0;
			this.minuten+=1;
			if (this.minuten>59) {
				this.minuten=0;
				this.stunden+=1;
				if (this.stunden>=24) {
					this.stunden=0;
					this.minuten=0;
					this.sekunden=0;
				}
			}
		}
	}
	
	public long getTagesSek() {
		long sekSeitMitternacht = ((stunden*60) * 60) + (minuten*60) + sekunden;
		return sekSeitMitternacht;
	}
	
	public static void main(String[] args) {
		int std=0, min=23, sek=7;
		
		Uhr[] weltzeit = new Uhr[24];
		
		for (int i = 0; i < weltzeit.length;i++) {
			weltzeit[i] = new Uhr(std++,min,sek);
		}
		
		for (int i = 0; i < weltzeit.length; i++) {
			weltzeit[i].naechsteSek();
			System.out.println(weltzeit[i].getStunden() + ":" + weltzeit[i].getMinuten() + ":" + weltzeit[i].getSekunden() + "   " + weltzeit[i].getTagesSek());
		}
	}
	
}
