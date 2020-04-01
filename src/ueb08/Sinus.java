package ueb08;
import java.util.Scanner;
public class Sinus {
	
    public static double sinusBerechnen (double eingabe) {
	double nenner = 1.0;
    	double zaehler = eingabe; //Erster Reihenwert = eingabe^1
    	double summand = 1.0;
    	double summe = eingabe; //Erster Reihenwert eingabe/1! bereits der summe hinzufügen
    	
    	for (int i = 2;summand > 1E-15 || summand < -1E-15;i+=2) { //Berechnung Reihenwerte - beginnt mit 2. Reihenwert
    		zaehler = zaehler * eingabe * eingabe * (-1);//Vorzeichen ändern
    		nenner = nenner * i * (i+1);
    		summand = zaehler / nenner;
    		summe = summe + summand;
    	}
    	return summe;
    }
	
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Bitte geben Sie eine Zahl ein: ");
    	double eingabe = scanner.nextDouble();
    	eingabe = eingabe%(2*Math.PI);
    	
        double sinus = sinusBerechnen(eingabe);
        System.out.println("Sinus: " + sinus + ", Math.sin: " + Math.sin(eingabe) );
        scanner.close();
    }
}


