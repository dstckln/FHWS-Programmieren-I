package bonus02.Aufgabe3;

public class TicTacToe {

	public static void main(String[] args) {
		boolean[] bool = {true,false};
		boolean[][][] ttt = new boolean[3][3][3];
		
		for (int table = 0;table<ttt.length;table++) {
			for (int row = 0;row<ttt[0].length;row++) {
				for (int col = 0;col<ttt[1].length;col++) {
					ttt[table][row][col] = bool[(int) (Math.random()*2)];
					if (ttt[table][row][col]==true) {
						System.out.print("x ");
					} else {
						System.out.print("o ");
					}
				}
				System.out.printf("\t");
			}
			System.out.println();
		}
	}

}
