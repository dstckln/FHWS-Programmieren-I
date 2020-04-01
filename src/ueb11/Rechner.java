package ueb11;

import java.util.Arrays;

public class Rechner {

    public static void main(String[] args) {

	int summe = 0;
	int[] zahlen = new int[args.length - 1];
	char operator = args[args.length - 1].charAt(0);
	
	for (int i = 0; i < (args.length - 1); i++) {
	    zahlen[i] = Integer.parseInt(args[i]);
	}

	if (operator == '+') {
	    for (int i = 0; i < zahlen.length; i++) {
		summe = summe + zahlen[i];
	    }

	} else {
	    summe = zahlen[0];
	    for (int i = 1; i < zahlen.length; i++) {
		summe = summe - zahlen[i];
	    }
	}
	System.out.println("Das Ergebnis für " + Arrays.toString(zahlen).replace(',', operator) + " lautet: " + summe);	
    }
}
