package ueb14;

public class Schachbrett {

	public static char[][] initialisiereSchachbrett() {
		char[][] schachbrett = new char[8][8];
		for (int row=0;row<schachbrett.length;row++) {
			for (int col=0;col<schachbrett[row].length;col++) {
				if (row==1 || row==6) {
					schachbrett[row][col]='B';
				} else {
					schachbrett[row][col]='L';
				}
			}
		}
		return schachbrett;
	}
	
	public static void main(String[] args) {
		char[][] schachbrett = initialisiereSchachbrett();
		for (int row=0;row<schachbrett.length;row++) {
			for (int col=0;col<schachbrett[row].length;col++) {
				System.out.print(schachbrett[row][col]);
			}
			System.out.println();
		}

	}
}
