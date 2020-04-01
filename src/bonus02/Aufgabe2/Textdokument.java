package bonus02.Aufgabe2;

public class Textdokument {
	//ausgabe
	public static void print(char[][] text) {
		for (int row = 0;row<text.length;row++) {
			if (text[row]==null) { 
				System.out.print("null");
			} else {
				for (int col = 0;col<text[row].length;col++) {
					System.out.print(text[row][col]);
				}
			}
			System.out.println();
		}
	}
	//a.)
	public static int zaehleZeichen(char[][] text) {
		int counter = 0;
		for (int row=0;row<text.length;row++) {
			if (text[row]==null) {
				continue;
			} else {
				for (int col=0;col<text[row].length;col++) {
					if (text[row][col]!=' ') {
						counter++;
					}
				}
			}
		}
		return counter;
	}
	//b.)
	public static boolean vertauscheZeilen(char[][] text, int zeile1, int zeile2) {
		
		if (zeile1>text.length || zeile2>text.length) {
			return false;
		}
		char[] tmpRow = text[zeile1];
		text[zeile1] = text[zeile2];
		text[zeile2] = tmpRow;
		return true;
	}
	//c.)
	public static char[][] einfuegeTextdokument (char[][] text1, char[][] text2, int zeile) {
		if (zeile>text1.length) {
			return null;
		}
		char[][] newDoc = new char[text1.length+text2.length][];
		int rowTmp = 0;
		for (int rowText1=0;rowText1<text1.length;rowText1++) {
			if (rowText1==zeile) {
				rowTmp=rowText1;
				for (int rowText2=0;rowText2<text2.length;rowText2++) {
					newDoc[rowTmp]=text2[rowText2];
					rowTmp++;
				}
			}
			newDoc[rowTmp]=text1[rowText1];
			rowTmp++;
		}
		return newDoc;
	}
	public static void main(String[] args) {
		final int ROW = 4;

		char[][] text = new char[ROW][];
		String txtZeile1 = "Das hier ist ein test";
		String txtZeile2 = "Bonusblatt 2";
		String txtZeile3 = "für Programmieren1";
		String txtZeile4 = "Studienfach Wirtschaftsinformatik an der FHWS";
		text[0] = txtZeile1.toCharArray();
		text[1] = txtZeile2.toCharArray();
		text[2] = txtZeile3.toCharArray();
		text[3] = txtZeile4.toCharArray();
		//c.)
		char[][] text2 = new char[ROW][];
		String txt2Zeile1 = "Neuer Text";
		String txt2Zeile2 = "Wird hier eingefügt";
		String txt2Zeile3 = "lol";
		String txt2Zeile4 = "irgendein text";
		text2[0] = txt2Zeile1.toCharArray();
		text2[1] = txt2Zeile2.toCharArray();
		text2[2] = txt2Zeile3.toCharArray();
		text2[3] = txt2Zeile4.toCharArray();
		print(text);
		//a.)
		int counter = zaehleZeichen(text);
		System.out.println("Anzahl Zeichen: " + counter);
		//b.)
		if (vertauscheZeilen(text,2,3)==false) {
			System.out.println("Fehler bei Tausch!");
		} else {
			System.out.println();
			System.out.println("Nach Tausch:");
			print(text);
		}
		//c.)
		char[][] newDoc = einfuegeTextdokument(text,text2,1);
		if (newDoc==null) {
			System.out.println("Fehler bei Texteinfügen!");
		} else {
			print(newDoc);
		}
	}
}
