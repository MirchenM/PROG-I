/*

Este programa cria um rectangulo usuando asteristicos.
Mas o tamanho, e inserido pelo usuario.


Autor: Mirchen Miguel D. Maibaze.
Turma: LEIT14.
compilar: javac Asteristicos.java 
executar: java Asteristicos


*/

//Importando a classe 
import java.util.Scanner;

	//Classe
	public class Asteristicos {
		
		//Metodo main
		public static void main(String [] args) {
			Scanner lerDado = new Scanner (System.in);
			System.out.println("Informe o numero: "); //Pedindo ao usuario para digitar um numero 
			int numero = lerDado.nextInt(); //Lendo o numero digitado pelo usuario 
			
			//Vai imprimir os asteristicos para as linhas de cima
			for(char i = 0; i < numero; i++) { 
				System.out.print("*");
			}
					System.out.println("");
					
					//Vai imprimir os asteristicos para as linhas laterais
					for(char k = 0; k < numero - 2; k++) {
						System.out.print("*");
					
							for(char j = 0; j < numero - 2; j++) {
								System.out.print(" ");
							}
								System.out.println("*"); 
					}
									//Vai imprimir os asteristicos para as linhas de baixo
									for(char z = 0; z < numero; z++) {
										System.out.print("*");
									}
										System.out.println("");
										
		System.out.println();
		System.out.print("Powered by @Mirchen Miguel");
		}
	}
	
			