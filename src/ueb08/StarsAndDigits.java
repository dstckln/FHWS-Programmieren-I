package ueb08;
import java.util.Scanner;

public class StarsAndDigits {

    public static void main(String[] args) {
	int eingabe;
	int sterne;
	int ziffer;
	Scanner scanner = new Scanner(System.in);
		
	System.out.print("Eingabe der Zahl: ");
	eingabe = scanner.nextInt();
	if (eingabe<=0) {
		System.out.print("Ungültige Eingabe!");
	} else {
		System.out.print("Anzahl der Sterne: ");
		sterne = scanner.nextInt();
		if (sterne<0) {
			System.out.print("Ungültige Eingabe!");
		} else {
			while(eingabe!=0) { 
				ziffer = eingabe%10; //letzte Ziffer
				eingabe/=10; //eingabe schrumpfen
				System.out.print(ziffer);
				
				for(int i=1;i<=sterne&&eingabe!=0;i++){ //&&eingabe!=0, weil sonst hinter letzter Ziffer noch Sterne ausgegeben würden
					System.out.print("*");
				}
			}
		} 
	scanner.close();
	}
    }
}
