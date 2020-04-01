package bonus01;

public class Raum {
	private String kennung;
	private int anzahl;
	private boolean belegt;
	private Vorlesung vorlesung = null;
	private Student studenten[] = null;
	
	//constructor
	public Raum(String kennung, int anzahl, boolean belegt, Vorlesung vorlesung, Student studenten[]) {
		this.kennung=kennung;
		this.anzahl=anzahl;
		this.belegt=belegt;
		this.vorlesung = vorlesung;
		this.studenten = new Student[anzahl];
	}
	//getter
	public String getKennung() {
		return kennung;
	}
	public int getAnzahl() {
		return anzahl;
	}
	public boolean getBelegt() {
		return belegt;
	}
	public Vorlesung getVorlesung() {
		if (belegt==true) {
			return vorlesung;
		} else {
			return null;
		}
	}
	public Student[] getStudenten() {
		return studenten;
	}
	
	//setter
	public void setBelegt(boolean belegt) {
		this.belegt=belegt;
	}
	public void setVorlesung(Vorlesung vorlesung) {
		this.vorlesung=vorlesung;
	}
	//functions
	public static void belegungAbfragen(Raum raum[]) {
		for (int i = 0; i<raum.length;i++) {
			if (raum[i].getBelegt()==true) {
				if (raum[i].getVorlesung()==null) {
					System.out.println("Fehler: Raum " + raum[i].getKennung() + " ist ohne Vorlesung belegt!");
				} else {
					System.out.println(	"Raum " + raum[i].getKennung() + " ist belegt. " +
										"Vorlesung: " + raum[i].getVorlesung().name +
										" / Dozent: " + raum[i].getVorlesung().dozent + 
										" / Studiengang: " + raum[i].getVorlesung().studiengang);
				}
			} else {
				System.out.println(	"Raum " + raum[i].getKennung() + " ist frei.");
			}
		}
	}
	public void betreteRaum(Student student) {
		for (int i = 0; i < studenten.length; i++) {
			if (studenten[i] == null) {
				studenten[i] = student;
				break;
			}
		}
	}
	public void verlasseRaum(Student student) {
		for (int i = 0; i < studenten.length; i++) {
			if (this.studenten[i] == student) {
				this.studenten[i] = null;
				break;
			}
		}
	}
	public void studentenAusgeben() {
		for (int i = 0; i < studenten.length; i++) {
			if (studenten[i] == null) {
				continue;
			} else {
				System.out.println(studenten[i].getMatrikelnr() + " " + studenten[i].getVorname() + " " + studenten[i].getNachname());
			}
		}
	}
	
	//main
	public static void main(String[] args) {
		Raum[] raum = new Raum[2];
		raum[0] = new Raum("I.2.1",20,false,null,null);
		raum[1] = new Raum("I.2.5",15,false,null,null);
		
		Vorlesung[] vorlesung = new Vorlesung[2];
		vorlesung[0] = new Vorlesung("Programmieren1","Herr Rauch","Wirtschaftsinformatik");
		vorlesung[1] = new Vorlesung("Datenbanken1","Herr Rott","Informatik");
		
		//Übungsblatt Bonus
		Raum.belegungAbfragen(raum);
		
		raum[0].setBelegt(true);
		raum[0].setVorlesung(vorlesung[0]);
		Raum.belegungAbfragen(raum);	
		
		//Übungsblatt 12
		Student student1 = new Student(1234567,"Max","Mustermann");
		Student student2 = new Student(9876543,"Franck","Ribery");
		raum[0].betreteRaum(student1);
		raum[0].betreteRaum(student2);
		raum[0].studentenAusgeben();
		raum[0].verlasseRaum(student1);
		raum[0].studentenAusgeben();	
	}
}
