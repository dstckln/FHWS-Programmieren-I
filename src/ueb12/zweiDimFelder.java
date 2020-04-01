package ueb12;
public class zweiDimFelder {

	public static double[] zeilenMaxima(double[][] matrix) {
		double[] zeilenMaxima = new double[matrix.length];
		double max = 0;
		
		for (int row = 0;row<matrix.length;row++) {
			for (int col = 0;col<matrix[row].length;col++) {
				if (matrix[row][col]>max) {
					max = matrix[row][col];
				}
				System.out.printf("%7.2f", matrix[row][col]);
			}
			System.out.println();
			zeilenMaxima[row] = max;
			max = 0; //max auf 0 für nächste Zeile
		}
		return zeilenMaxima;
	}
	
	public static void main(String[] args) {

		double[][] matrix = new double[(int) (1+Math.random()*10)][(int) (2+Math.random()*10)]; //2D-Array zufälliger Größe
		
		for (int row = 0;row<matrix.length;row++) { //Zufälliger Double zwischen 1-100 in Array schreiben
			for (int col = 0;col<matrix[row].length;col++) {
				matrix[row][col] = Math.random()*100;
			}
		}

		double[] zeilenMaxima = zeilenMaxima(matrix);
		
		//Ausgabe
		System.out.print("Zeilenmaxima:");
		for (int i = 0;i<zeilenMaxima.length;i++) {
			System.out.printf("%7.2f", zeilenMaxima[i]);
		}
	}

}
