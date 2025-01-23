/*

Este e um programa que cria uma matriz do tipo mxn e apresenta:
a) a matriz na tela;
b) a soma total dos elementos da matriz e apresente o resultado na tela;
c) a soma dos elementos da diagonal principal da matriz e apresente o resultado na tela.

Autor: Mirchen Miguel Domingos Maibaze.
Turma: LEIT14.
Compilar: javac MatrizMxN.java
Executar: java MatrizMxN

*/


//Importando a classe
import java.util.*;

	//Classe 
	public class MatrizMxN{
	
		//Classe Scanner estatica 
		public static Scanner ler= new Scanner(System.in);
	
			//Metodo com retorno para criar Matriz
			public static int[][] PreencherMatriz (int m, int n){
				int[][] M = new int[m][n];
				for(int i = 0; i < m; i++){
					for(int j = 0; j < n; j++){
						System.out.print("Digite um valor: "); //Pedindo ao usuario para digitar um valor via teclado 
							M[i][j]= ler.nextInt();
					}
				}
				return M; //Retorno da Matriz preenchida
			}
	
			//Metodo com retorno para determinar a soma total da Matriz 
			public static int somaTotal(int[][]V){
				int soma = 0; //Variavel soma que vai armazenar o resultado da soma total dos elementos da Matriz 
				for(int i = 0; i < V.length; i++){
					for(int j = 0; j < V[i].length; j++){
						soma = soma + V[i][j];
					}
				}	
				return soma; //Retorno da soma total 
			}
	
			//Metodo com retorno para determinar a soma dos elementos da diagonal principal da Matriz 
			public static int somaDiagonal(int[][]s){
				int soma = 0; //Variavel soma que vai armazenar o resultado da soma dos elementos da diagonal principal da Matriz 
				if(s.length == s[0].length){
					for(int i = 0; i < s.length; i++){
						for(int j = 0; j < s[i].length; j++){
							if(i == j){
								soma = soma + s[i][j];
							}
						}
					}
				}
				return soma; //Retorno da soma diagonal 
			}
	
			//Metodo sem retorno para imprimir a Matriz 
			public static void ImprimirMatriz(int[][]A){
				for(int i = 0; i <A.length; i++){
					for(int j = 0; j < A[i].length; j++){
						System.out.print(A[i][j]+ "\t");
					}
					System.out.println(); //Imprimindo a matriz na sua forma matricial 
				}
			}
			
			//Metodo principal 
			public static void main(String[] args){
				int[][] s = PreencherMatriz(4,4);
		
				System.out.println("\t--------------------------MENSAGENS----------------------------\n"); //Inicio da impressao de mensagens
				
				ImprimirMatriz(s); //Chamando o metodo para imprimir a matriz  
				
				System.out.println("Soma total: "+ somaTotal(s)); //Imprimindo a soma total dos elementos da matriz
				
				System.out.println("Soma diagonal: "+ somaDiagonal(s)); //Imprimindo a soma dos elementos da diagonal principal da matriz 
				
				System.out.println("\t-----------------------------FIM------------------------------------\n"); //Fim da impressao de mensagens
					
			}
	
	}