/*
Autor: Mirchen Miguel D. Maibaze I14
compilar: javac
executar: java

Escreva um programa que avalia se uma palavra ou frase pode ser lida da esquerda para direita ou vicce-versa, por exemplo: osso, ana, radar, "roma e amor", etc...

*/


import java.util.Scanner;
	//classe
	public class LerPalavraDeTrasParaFrente {
		//classe Scanner
		static Scanner lerPalavra = new Scanner (System.in);
		
		public static void inverterString(String palavra) { //metodo para inverter a palavra inserida
			for(int i= palavra.length() -1; i >= 0; i--) {
				System.out.println(palavra.charAt(i));
			}
		}
		
		
		//metodo principal
		public static void main(String [] args) {
			System.out.println("Informe a palavra: ");
			String palavra = lerPalavra.nextLine();
			inverterString(palavra); //chamando o metodo que vai inverter a palavra
			
		}
	}
	
			
			
			