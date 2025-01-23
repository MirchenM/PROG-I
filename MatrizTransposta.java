/*
Faca um programa que dada a seguinte matriz A, gere a matriz transporta dela A^T. Matriz
transposta e a que se obtem trocando-se ordenadamente as linhas pelas colunas.

Autor: Mirchen Miguel Domingos Maibaze
Turma: LEIT14;
Compilar: javac MatrizTransposta.java
Executar: java MatrizTransposta

*/

//Importando as classes
import java.util.*;

//Classe 
public class MatrizTransposta {
	
	//Metodo Principal 
	public static void main(String[] args) {
		
		
		Scanner lerDado = new Scanner(System.in);
		System.out.print("Digite o numero de linhas da matriz: "); //Pedindo ao usuario para digitar o numero de linhas da matriz 
		ln = entrada.nextInt();
		System.out.print("Digite o numero de colunas da matriz: "); //Pedindo ao usuario para digitar o numero de colunas da matriz 
		cl = entrada.nextInt();
		
		int [][] matriz = new int[ln][cl];
		for (int l = 0; l < ln; l++)
		{
			for (int c = 0; c < cl; c++)
			{
				System.out.print("Digite os elementos da matriz["+l+"]["+c+"]:");
				matriz[l][c] = lerDado.nextInt();
			}
			System.out.println();
		}
		System.out.println("\tMatriz inserida\t"); 
		for (int l = 0; l < 2; l++)
		{
			for (int c = 0; c < 2; c++)
			{
				System.out.print("\t"+matriz[l][c]+"\t	");
			}
			System.out.println();
		}
		if (ln != cl)
			System.out.println("Esta matriz nao pode ser transposta");
		else
		{
			for (int i = 0; i < ln; i++)
			{
				for (int j = 0; j < cl; j++)
				{
					
				}
			}
		}
	}
}