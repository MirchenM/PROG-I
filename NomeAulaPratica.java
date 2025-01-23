/*

Autor: Mirchen Miguel Domingos Maibaze
Classe String
compilar: javac
executar: java
Exercicio 16
Faça um programa que permita ao usuário digitar o seu nome e em seguida imprima 
o nome do usuário de trás para frente utilizando somente letras maiúsculas. Dica: 
lembre−se que ao informar o nome o usuário pode digitar letras maiúsculas ou 
minúsculas

*/

import java.util.Scanner;

	//classe
	public class NomeAulaPratica {
	
		//metodo principal
		public static void main(String [] args) {
			String nome;
			Scanner lerNome = new Scanner (System.in);
			System.out.println("Insira o nome: ");
			nome = lerNome.nextLine();
			System.out.println(nome);
			
			
			//para imprimir o nome informado em letras minusculas
			System.out.println(nome.toLowerCase());
			
			//para imprimir o nome informado em letras maiusculas
			System.out.println(nome.toUpperCase());
			
			//para inverter o nome de tras para frente
			for(int i = nome.length() -1; i>= 0; i--) {
				System.out.print(nome.charAt(i));
			}
		}
	}
	