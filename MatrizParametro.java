/*
Elabore um método Java que tenha como parâmetros de entrada duas matrizes de números 
reais e forneça como resposta o produto das mesmas. Caso não seja possível efetuar a 
multiplicação, o Método deve retornar um código de erro. Caso as dimensões não permitam 
que se efetue a multiplicação o método deve retornar o código de erro diferente de zero
*/

import java.util.*;
public class MatrizParametro {
	public static Scanner ler = new Scanner(System.in);
	
	public static int[][] lerDados (int m, int n){
		int[][] M= new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print("Digite um valor: ");
				M[i][j]= ler.nextInt();
			}
		}
		return M;
	}
	
	public static int matrizA(int[][]A) {
		System.out.println("Insira os valores da matriz A: ");
		int n = ler.nextDouble;
		int [][]a = new int [n];
		for(int i = 0; i < a.length; i++) {
			a[i] = ler.nextInt(); 
		}
		return a;
	}
	
	
	public static void main(String [] args) {
	
	}
}

	
	
		

