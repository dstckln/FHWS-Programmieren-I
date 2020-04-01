package ueb11;;

public class Zaehlen {
	
    public static int ziffernZaehlen(char[] array) {
	int ziffern=0;
		 
	for (char c: array) {
	    if (c >= '0' && c <= '9') {
		ziffern++;
	    }
	}
	return ziffern;
    }

    public static void main(String[] args) {
	int ziffern;
	//char[] array = {'I','m',' ','J','a','h','r','e',' ','1','4','9','2',' ','s','e','g','e','l','t','e',' ','C','o','l','u','m','b','u','s'};
	String text = "Im Jahre 1492 segelte Columbus nach Indien";
	char[] array = text.toCharArray();
	ziffern = ziffernZaehlen(array);
	System.out.println(text);
	System.out.println("Enthält " + ziffern + " Ziffern");
    }
}

