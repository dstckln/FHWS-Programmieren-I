package ueb06;
import java.util.Scanner;

public class Potenz {

    public static void main(String[] args) {
	double basis;
	int exponent;
	double potenz = 1.0;
	Scanner scanner = new Scanner(System.in);
		
	System.out.print("Bitte geben Sie die Basis ein: ");
	basis = scanner.nextDouble();
	System.out.print("Bitte geben Sie den Exponenten ein: ");
	exponent = scanner.nextInt();
		
	if (basis==0.0) {
		potenz = 0.0;
	} else if (exponent==0) {
		potenz = 1.0;
	} else if (exponent>0) {
		for (int i=0;i<exponent;i++) {
			potenz = potenz*basis;
		}
	} else if (exponent<0) {
		for (int i=-1;i>=exponent;i--) {
			potenz = potenz*basis;
		}
		potenz = 1.0/potenz;
	}
	System.out.print("Ergebnis: " + potenz);
	scanner.close();
    }
}
