/*
Autor: Mirchen Miguel Domingos Maibaze
Classe String
compilar: javac
executar: java

Exercicio 20
Escreva uma classe em Java que represente o nome de uma Instituição, composto 
de três strings (nome próprio, nome do meio e nome da família). Deve no fim imprimir 
somente as iniciais, imprimir também as iniciais do nome próprio e do meio e o nome 
de família completo. Por exemplo, se o nome da pessoa representado por essa 
classe for “ Instituto de Transportes e Comunicação”, deve ser apresentado ”itc” e 
”I.T.Comunicação”. Para facilitar, considere armazenar os três nomes em strings 
separadas.

*/

//classe Scanner
import java.util.Scanner;
	//classe
	public class NomeMeioFamilia {
		//metodo principal
		public static void main(String [] args) {
			String nome_proprio;
			String nome_meio;
			String nome_familia;
			Scanner ler = new Scanner (System.in);
			System.out.print("Insira o nome proprio: ");
			nome_proprio = ler.nextLine();
			System.out.print("Insira o nome do meio: ");
			nome_meio = ler.nextLine();
			System.out.print("Insira o nome da familia: ");
			nome_familia = ler.nextLine();
			
			//imprime a inicial do nome proprio
			System.out.print(nome_proprio.charAt(0));
			
			//imprime a iniciar do nome do meio
			System.out.print(nome_meio.charAt(0));
			
			//imprime o nome da familia 
			System.out.print(nome_familia);
		}
	}
	