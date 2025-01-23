/*

Dada a matriz {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}, faca um programa que:
a) calcule a soma da ultima linha da matriz;
b) calcule o produto da ultima coluna;
c) calcule o produto de todos os elementos da matriz;
d) o produto de todos os elementos da matriz; e
e) determine o produto dos elementos da diagonal primaria.
E por fim, apresente os resultados na tela


Autor: Mirchen Miguel D. Maibaze
Compilar: javac MatrizOperacoesT2.java 
Executar: java MatrizOperacoesT2
Turma: LEIT 14

*/

//Importacao da classe
import java.util.*;

	//Classe  
	public class MatrizOperacoesT2 {
	
		//Metodo com retorno para calcular a soma dos elementos da ultima linha da matriz
		public static int Soma(int[][]M) { 
			int soma = 0; //Variavel que vai armazenar a soma dos elementos da ultima linha da matriz
			for(int j = 0; j < M[3].length; j++){
				soma = (soma + M[3][j]);
			}
			return soma; //Retorno da soma dos elementos da ultima linha da matriz 
		}
	
		//Metodo com retorno para o calculo do produto dos elementos da ultima coluna da matriz
		public static int ProdutoUltima(int[][]M) { 
		int Pr = 1; //Variavel que vai armazenar o produto dos elementos da ultima coluna da matriz
		for(int i = 0; i < M.length; i++) {
			Pr = (Pr * M[i][3]);
		}
		return Pr; //Retorno do produto dos elementos da ultima coluna da matriz
	}
	
	//Metodo com retorno para o calculo do produto de todos os elementos da matriz 
	public static int ProdutoTodos(int[][]M) { 
		int ProT = 1; //Variavel que vai armazenar o produto de todos os elementos da matriz
		for(int i = 0; i < M.length; i++){
			for(int j = 0; j < M[i].length; j++){
				ProT = (ProT * M[i][j]);
			}
		}
		return ProT; //Retorno do produto de todos os elementos da matriz 
	}
	
	//Metodo com retorno para determinar o produto dos elementos da diagonal primaria
	public static int DiagonalPrimaria(int[][]M) { 
		int PD = 1; //Variavel que vai armazenar o produto dos elementos da diagonal primaria
		for(int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length; j++) {
				if(j == i) {
					PD = (PD * M[i][j]);
				}
			}
		}
		return PD; //Retorno do produto dos elementos da diagonal primaria
	}
	
	//Metodo principal
	public static void main(String [] args) {
		System.out.println("\t-------------------------------MATRIZ-------------------------------------\n");
			int M [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; //Matriz dada 
			for(int linha = 0; linha < 4; linha++) {
				for(int coluna = 0; coluna < 4; coluna++) {
					System.out.print("\t"+M[linha][coluna]+"\t	");
				}
			System.out.println(); //Imprimindo a matriz na tela na forma matricial 
			}
			
		
		System.out.println("\t-----------------------IMPRESSAO DE MENSAGENS----------------------------\n"); //Inicio da impressao de mensagens 	
		
		//System.out.println(Arrays.deepToString(M));
		
		System.out.println("Soma da ultima linha dos elementos da matriz e: " +Soma(M)); //Impressao  do valor da soma da ultima linha da matriz 
		
		System.out.println("O produto dos elementos da ultima coluna da matriz e: " +ProdutoUltima(M)); //Impressao do produto dos elementos da ultima coluna da matriz 
		
		System.out.println("O produto de todos os elementos da matriz e: " +ProdutoTodos(M)); //Impressao do produto de todos os elementos da matriz 
		
		System.out.println("O produto da diagonal secundaria da matriz e: " +DiagonalPrimaria(M)); //Impressao do produto da diagonal secundaria da matriz 
		
		System.out.println("\t----------------------FIM DA IMPRESSAO DE MENSAGENS-----------------------\n"); //Fim da impressao de mensagem 
		
	}
	
}