package ueb09;
public class GrossbuchstabenZaehlen {

    public static int countUpperCaseCharacters(String sentence)	{
	int count = 0;
	for (int i = 0; i < sentence.length(); i++) {
	    char c = sentence.charAt(i);
	    if (c >= 'A' && c <= 'Z') {
		count++;
	    }
	}
	return count;
    }
	
    public static int countUpperCaseCharacters2(String sentence) {
	char[] chars = sentence.toCharArray();
	int count = 0;
	for (int i = 0; i < chars.length ; i++)	{
	    char c = chars[i] ;
	    if (c >= 'A' && c <= 'Z') {
		count++;
	    }
	}
	return count;
    }
	
    public static void main(String[] args) {
		
	int counter = countUpperCaseCharacters("HALlo");
	System.out.println("Alternative1 - Großbuchstaben: " + counter);
		
	counter = countUpperCaseCharacters2("HALlo");
	System.out.println("Alternative2 - Großbuchstaben: " + counter);
		
	String a = "Hallo Welt";
	a = a.replace("l", "?");
	System. out.println(a);

	for (int i = 0; i < args.length; i++) {
	    System. out.println(args[i]);
	}
    }
}
