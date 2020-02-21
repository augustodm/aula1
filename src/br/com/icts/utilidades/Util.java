package br.com.icts.utilidades;

public class Util {
	public static String treateNumber(int number) {
		return (number < 10) ? "0" + number : String.valueOf(number);
	}

	public static void printMat(int mat[][]) {
		System.out.println("                          Tabuada\n");
		System.out.println("      01    02    03    04    05    06    07    08    09    10\n");
		for (int i = 0; i < mat.length; i++) { //linha
			String line = Util.treateNumber(i + 1) + "  ";
			for (int j = 0; j < mat.length; j++) { //coluna
				line += " [" + Util.treateNumber(mat[i][j]) + "]" + " ";
			}
			System.out.println(line);
		}
	}
}