/*

Este e um programa que a base de metodos:
a) cria dois vectores A e B; e 
b) efectua o somatorio entre eles.

Autor: Mirchen Miguel Domingos Maibaze.
Turma: LEIT14.
Compilar: javac ExercicioVetorAB.java
Executar: java ExercicioVetorAB
2022

*/


//Importando a classe
import java.util.Scanner;

	//Classe 
	public class ExercicioVetorAB {
		
		//Classe Scanner global
		public static Scanner lerDado = new Scanner (System.in);
	
			//Metodo com retorno para declaracao, criacao e recepcao de valores no vetor A
			public static int [] VectorA() {
				System.out.print("Insira o numero de elementos do vector A: "); //Pedindo ao usuario para inserir o numero de elementos que farao parte do vector A
				int n = lerDado.nextInt(); //Lendo o numero de elementos inseridos pelo usuario na variavel n 
				int []a = new int [n]; //Inserindo elementos no vector A
				for(int i = 0; i < a.length; i++) {
					System.out.print("A["+i+"] = ");
						a[i] = lerDado.nextInt();
				}
					return a; //Retorno do vector A
			}
	
			//Metodo com retorno para declaracao, criacao e recepcao de valores no vetor B
			public static int [] VectorB() {
				System.out.print("Insira o numero de elementos do vector B: "); //Pedindo ao usuario para inserir o numero de elementos que farao parte do vector B
				int n = lerDado.nextInt(); //Lendo o numero de elementos inseridos pelo usuario na variavel n 
				int []b = new int [n]; //Inserindo os elementos no vector B
				for(int i = 0; i < b.length; i++) {
					System.out.print("B["+i+"] = ");
						b[i] = lerDado.nextInt();
				}
				return b; //Retorno do vector B 
			}
	
	
			//Metodo sem retorno retorno que vai efectuar o somatorio dos vectores A e B 
			public static void Somatorio(int []a, int []b) {
				int somat = 0; //Inicializacao da variavel que vai armazenar o somatorio dos vetores A e B
				for(int i = 0; i < a.length; i++) { //acedendo aos valores presentes no vetor A
					for(int j = 0; i < b.length; i++) { //Acedendo aos valores presentes no vetor B 
						somat = (a[i] + b[(b.length) - 1]); //Efectuando o somatorio entre os vetores
					}
				}
			}
	
			//Metodo principal
			public static void main(String [] args) {
				int [] a = VectorA(); //Chamando o vector A
				int [] b = VectorB(); //Chamando o vector B
				Somatorio(a,b); //Chamando o metodo que vai efectuar o somatorio dos vectores A e B
			}
	}