package ueb10;
public class CmdProg {

    public static void main(String[] args) {
	if (args.length!=2) {
	    System.out.print("Fehler: Zu viele Argumente!");
	} else {
	    int summe = Integer.valueOf(args[0]) * Integer.valueOf(args[1]);
	    System.out.print("Summe: " + summe);
	}
    }
}
