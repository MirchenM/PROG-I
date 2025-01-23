/*

Este e um programa que de dois numeros inseridos pelo usuario ele diz:
a) Se eles sao diferentes ou iguais; e
b) Qual o maior e qual o menor entre os valores inseridos.

Autor: Mirchen Miguel Domingos Maibaze.
Turma: LEIT14.
Compilar: javac ComparaNumero2.java
Executar: java ComparaNumero2
2022

*/

//Importando a classe 
import java.util.Scanner;

	//Classe 
	public class ComparaNumero2 {
		
		//Metodo Principal
		public static void main(String[] args) {
			Scanner lerDados = new Scanner (System.in); //Classe Scanner 
			
			int num1; //Variavel para armazenar o primeiro numero
			int num2; //Variavel para armazenar o segundo numero
			
			System.out.println("Insira o primeiro numero: "); //Pedindo ao usuario para inserir o primeiro numero 
			num1 = lerDados.nextInt(); //Variavel que vai armazenar primeiro numero inserido pelo usuario
			
			System.out.println("Insira o segundo numero: "); //Pedindo ao usuario para inserir o segundo numero
			num2 = lerDados.nextInt(); //Variavel que vai armazenar o segundo numero inserido pelo usuario
			
			compara(num1, num2); //Chamando o metodo para comprar se os numeros sao iguais ou diferentes
			
		}
	
	
		//Metodo sem retorno para comparar dois numeros e dizer se sao iguais ou diferentes e imprimir o menor deles, assim como o maior deles
		public static void compara(int valor1, int valor2) {
			int valor_menor; //Variavel para armazenar o menor valor
			int valor_maior; //Variavel para armazenar o maior valor
			
			if(valor1 == valor2) { //Comparando se o valor1 e igual ao valor2
				
				System.out.println("Os valores inseridos sao iguais!"); //Imprimindo na tela a seguinte mensagem: os valores sao iguais!
				
			}else{
				
				System.out.println("Os valores inseridos sao diferentes!"); //Imprimindo na tela a seguinte mensagem: os valores sao diferentes!
				
				
			if(valor1 < valor2) { //Comparando se o valor1 e menor em relacao ao valor2 
				
				valor_menor = valor1;
				valor_maior = valor2;
				
			}else{
				
				valor_menor = valor2;
				valor_maior = valor1;
				
			}
			
			System.out.println("\t--------------------------MENSAGENS----------------------------\n"); //Inicio da impressao de mensagens
			
			System.out.println("O menor dos valores e: " +valor_menor); //Imprimindo na tela o maior dos valores 
			System.out.println("O maior dos valores e: " +valor_maior); //Imprimindo na tela o maior dos valores 
			
			System.out.println("\t----------------------------FIM-----------------------------------\n"); //Fim da impressao de mensages
			
			}
			
		}
		
	}

