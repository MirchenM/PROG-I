

import java.util.*;

public class MatrizesSoma {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nr de linhas da matriz: ");
		int ln = entrada.nextInt();
		System.out.print("Digite o nr de colunas da matriz: ");
		int cl = entrada.nextInt();
		
		int [][] matriz = new int[ln][cl];
		for (int l = 0; l < ln; l++) {
			for (int c = 0; c < cl; c++) {
				System.out.print("Digite o elemento da matriz["+l+"]["+c+"]:");
				matriz[l][c] = entrada.nextInt();
			}
			System.out.println();
		}
		return matriz;
	}
}
	
