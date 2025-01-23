/*

compilar: javac
executar: java
Autor: Mirchen Miguel D. Maibaze
Turma: LEIT14
*/

import java.util.Scanner;
	//classe
	public class NomeParametro {
		
		//classe scanner estatica
		static Scanner lerNome = new Scanner (System.in);
		
		//metodo MeuNome que vai retornar uma String com o nome introduzido pelo usuario como parametro
		public static String MeuNome(String n) {
			return n; //retorno do nome
		}
		//metodo principal
		public static void main(String [] args) {
			System.out.println("Introduza o nome: "); //pedindo ao usuario para inserir um nome 
			String nome = lerNome.nextLine();
			
			String MeuNome = MeuNome(nome);
			System.out.println("O seu nome e: " +MeuNome); //impressao da mensagem
		}
	}
	