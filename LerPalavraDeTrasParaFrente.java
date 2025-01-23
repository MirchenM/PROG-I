/*
O presente programa em JAVA pede que o usuario insira uma palavra e que depois de inserida, a mesma sera imprimida na tela de pras para frente.
compilar: javac
executar: java
Autor: Mirchen Miguel Domingos Maibaze I14

*/

import java.util.Scanner;
	public class LerPalavraDeTrasParaFrente {
		//Classe Scanner estatica
		static Scanner lerPalavra = new Scanner(System.in);

		//Metodo para inverter a palavra inserida 
		public static void inverterString(String palavra) {
			//Atribuicao de valores
			for (int i = palavra.length() - 1; i >= 0; i--) {
				System.out.print(palavra.charAt(i));
			}
		}

		//Metodo principal
		public static void main(String[] args) {
		System.out.print("Insira a palavra: "); //Pedindo ao usuario para inserir uma palavra
		String palavra = lerPalavra.nextLine();
		inverterString(palavra); //Chamando o metodo para inverter a palavra
		
		}
		
	}
	
			
			
			