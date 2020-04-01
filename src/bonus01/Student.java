package bonus01;

public class Student {
	private int matrikelnr;
	private String vorname;
	private String nachname;
	static int anzahlStudenten = 0;
	
	//constructor
	Student() {
		anzahlStudenten++;
	}
	
	Student(int matrikelnr, String vorname, String nachname) {
		this();
		if (matrikelnr>999999 && matrikelnr<10000000) {
			this.matrikelnr = matrikelnr;
		} else {
			System.out.println("Ungültige Matrikelnummer für Student: " + vorname + " " + nachname);
			System.exit(0);
		}
		this.vorname = vorname;
		this.nachname = nachname;
	}
	
	//getter
	public int getMatrikelnr() {
		return matrikelnr;
	}
	public String getVorname() {
		return vorname;
	}
	public String getNachname() {
		return nachname;
	}
}
