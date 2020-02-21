package application;

import br.com.icts.utilidades.Util;

public class Program {
public static void main(String[] args) {
	System.out.println("                          Tabuada");
	System.out.println();
	int[][] mat = new int [10][10];
	int count = 0;
	
	for (int i = 0; i < mat.length; i++) {
		for (int j = 0; j < mat.length; j++) {
			mat[i][j] = (i +1) * (j +1) ;
		}
	}
	System.out.println("      1     2     3     4     5     6     7     8     9     10");
	for (int i = 0; i < mat.length; i++) {
		System.out.println();
		count++;
		System.out.print(Util.treateNumber(count) + "  ");
	for (int j = 0; j < mat.length; j++) {
		System.out.print(" [" + Util.treateNumber(mat[i][j]) + "]" + " ");
	}
	}
	
	
	
}
}
