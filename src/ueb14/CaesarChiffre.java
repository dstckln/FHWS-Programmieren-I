package ueb14;

public class CaesarChiffre {

	public static char[] decryption(char[] cArr, int abstand) {
		for (int i=0;i<cArr.length;i++) {
			if ((cArr[i]<'A' || cArr[i]>'Z') || abstand<0) {
				return null;
			}
			cArr[i]=(char)(((int)cArr[i]+abstand-65)%26 + 65);
		}
		return cArr;
	}
	
	public static void main(String[] args) {
		String text;
		text = "JAVA";

		char[] cArr=text.toCharArray();
		char[] ergebnis = decryption(cArr,5);

		if (ergebnis==null) {
			System.out.println("Fehler!");
		} else {
			for (int i=0;i<ergebnis.length;i++) {
				System.out.print(ergebnis[i]);
			}	
		}
	}
}
