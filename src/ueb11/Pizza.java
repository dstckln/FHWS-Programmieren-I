package ueb11;

public class Pizza {
    static int anzahlGebackenePizzen = 0;
    private String name;
    private int[] durchmesser;
    private double[] preis;
    //error Strings
    private String errName = "Fehler: Sie müssen einen Namen vergeben!";
    private String errDurchmesser = "Fehler: Sie haben einen ungültigen Durchmesser vergeben!";
    private String errPreis = "Fehler: Sie haben einen ungültigen Preis vergeben!";

    //Standard-Konstruktor
    private Pizza() {
	anzahlGebackenePizzen++;
    }

    //Konstruktor
    public Pizza(String name, int[] durchmesser, double[] preis) {
	this();
		
	if (checkName(name)==true) {
	    this.name = name;
	} else {
	    System.out.println(errName);
	    System.exit(0);
	}
		
	if (checkDurchmesser(durchmesser)==true) {
	    this.durchmesser = durchmesser;
	} else {
	    System.out.println(errDurchmesser);
	    System.exit(0);
	}
		
	if (checkPreis(preis)==true) {
	    this.preis = preis;
	} else {
	    System.out.println(errPreis);
	    System.exit(0);
	}

	} 
	//getter
	public String getName() {
		return name;
	}
	public int[] getDurchmesser() {
		return durchmesser;
	}
	public double[] getPreis() {
		return preis;
	}
	//setter
	public void setName(String name) {
		if (checkName(name)==true) {
			this.name = name;
		} else {
			System.out.println(errName);
			System.exit(0);
		}
	}
	
	public void setDurchmesser(int alterDurchmesser, int neuerDurchmesser) {
		if (neuerDurchmesser<=0) {
			System.out.println(errDurchmesser);
			System.exit(0);
		} else {
			for (int i = 0; i<durchmesser.length;i++) {
				if (durchmesser[i]==alterDurchmesser) {
					durchmesser[i]=neuerDurchmesser;
				}
			}
		}
	}
	
	public void setPreis(double alterPreis, double neuerPreis) {
		if (neuerPreis < 0) {
			System.out.println(errPreis);
			System.exit(0);
		} else {
			for (int i = 0; i<preis.length;i++) {
				if (preis[i]==alterPreis) {
					preis[i]=neuerPreis;
				}
			}
		}
	}
	
	//checker
	public boolean checkName(String name) {
		boolean boolName=true;
		if (name.isEmpty()) {
			boolName=false;
		}
		return boolName;
		
	}
	
	public boolean checkDurchmesser(int durchmesser[]) {
		boolean boolDurchmesser=true;
		for (int i = 0; i<durchmesser.length;i++) {
			if (durchmesser[i] <= 0) {
				boolDurchmesser=false;
				break;
			}
		}
		return boolDurchmesser;
	}
	
	public boolean checkPreis(double preis[]) {
		boolean boolPreis=true;
		for (int i = 0; i<preis.length;i++) {
			if (preis[i] < 0) {
				boolPreis=false;
				break;
			}
		}
		return boolPreis;
	}

}
