package application;

import br.com.icts.utilidades.Util;

public class Program {
	public static void main(String[] args) {
		int[][] mat = new int[10][10];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = (i + 1) * (j + 1);
			}
		}
		Util.printMat(mat);
	}

	// sequencia de fibonacci
	// mudar a tabuada para x elevado a y

}
