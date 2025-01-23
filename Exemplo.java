/*
Este e um programa que faz operacoes matematicas basicas:
a) soma;
b) subtracao;
c) multiplicacao; e
d) divisao.

Autor: Mirchen Miguel Domingos Maibaze.
Turma: LEIT14.
Compilar: javac OperacoesMatematicasBasicas.java
Executar: java OperacoesMatematicasBasicas
2022

*/

//Importando a classe 
import java.util.Scanner; 

	//Classe 
	public class Exemplo {
		
		//Metodo principal
		public static void main(String[] args) {
			Scanner lerNum = new Scanner (System.in); //Classe Scanner 
			
			int x; //Variavel x que vai armazenar o primeiro valor 
			int y; //Variavel y que vai armazenar o segundo valor 
			
			System.out.print("Insira o valor de x: "); //Pedindo ao usuario para inserir o valor de x
			x = lerNum.nextInt(); //Variavel que vai armazenar o valor de x inserido pelo usuario
			
			System.out.print("Insira o valor de y: "); //Pedindo ao usuario para inserir o valor de y 
			y = lerNum.nextInt(); //Variavel que vai armazenar o valor de y inserido pelo usuario
			
			
			System.out.println("\t--------------------------MENSAGENS----------------------------\n"); //Inicio da impressao de mensagens
			
			System.out.println("x + y = " +Soma (x, y)); //Imprimindo na tela o resultado da soma de x por y
			
			System.out.println("x - y = " +Sub (x, y)); //Imprimindo na tela o resultado da subtracao de x por y
			
			System.out.println("x * y = " +Mult (x, y)); //Imprimindo na tela o resultado da multiplicacao de x por y 
			
			System.out.println("x / y = " +Div(x, y)); //Imprimindo na tela o resultado da divisao de x por y
			
			System.out.println("\t-----------------------------FIM------------------------------------\n"); //Fim da impressao de mensagens
		}
	
	
		//Metodo com retorno para determinar a soma entre os valores 
		public static int Soma(int a, int b) {
			return(a + b); //Retorno do resultado da soma entre os valores 
		}
		
		//Metodo com retorno para determinar a subtracao entre os valores
		public static int Sub(int a, int b) {
			return(a - b); //Retorno do resultado da subtracao entre os valores 
		}
		
		//Metodo com retorno para determinar a multiplicacao entre os valores 
		public static int Mult(int a, int b) {
			return(a * b); //Retorno do resultado da multiplicacao entre os valores 
		}
		
		//Metodo com retorno para determinar a divisao entre os valores 
		public static int Div(int a, int b) {
			if(b == 0) {
				System.out.println("Impossivel efectuar operacao!");
			}
			return(a / b); //Retorno do resultado da divisao entre os valores
		}
		
	} 