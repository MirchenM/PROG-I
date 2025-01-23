/*
Exercicio 7. Seja dada a sucessao:

an = {a1 = 3
	 {an+1 = - 1/4 an se n > 1

a) Elabore o programa java recursivo.
b) Determine o 5 termo.

Autor: Mirchen Miguel Domingos Maibaze
Turma: LEIT14
Compilar: javac SucessaoRecursiva.java
Executar: java SucessaoRecursiva


*/

//Importando as classes 
import java.util.Scanner;

	//Classe
	public class SucessaoRecursiva {
		
		//Metodo pra determinar os casos possiveis da sucessao 
		public static int Sucessao (int n) {
			for (int i = 0; i < n; i++) {
				if( n < 1) { //Caso favoravel 
					return 3;
				} else {
					return (n+1) * (-1/4);
				}
			}
			return (n+1) * (-1/4);
		}
		
		//Metodo principal 
		public static void main (String [] args) {
			int n;
			Scanner lerValor = new Scanner (System.in);
			System.out.println("Insira o valor de n: ");
			n = lerValor.nextInt();
			Sucessao(n);
		}
	}
	
		