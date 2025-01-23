/*

Autor: Mirchen Miguel D. Maibaze
Classe String
compilar: javac ContaEspacosVogais.java
executar: java ContaEspacosVogais
2022

Exercicio 17
Dada uma string com uma frase informada pelo usuário (incluindo espaços em branco), conte:
a) quantos espaços em branco existem na frase.
b) quantas vezes aparecem as vogais a, e, i, o, u.

*/

//Importando a classe 
import java.util.Scanner;

	//Classe
	public class ContaEspacosVogais {
		
		//Metodo principal
		public static void main(String [] args) {
			int espacos_branco = 0; //Variavel que vai contar os espacos em branco presentes na frase 
			int a = 0, e = 0, i = 0, o = 0, u = 0; //Variaveis que vao contar quantas vezes cada uma aparece na frase e se estao presentes na mesma 
			String frase; //Variavel que vai armazenar a frase inserida pelo usuario 
			
			Scanner lerFrase = new Scanner (System.in); //Classe Scanner 
			
			System.out.print("Insira uma frase: "); //Pedindo ao usuario para inserir uma frase via teclado 
			frase = lerFrase.nextLine(); //Lendo a frase inserida pelo usuario
			System.out.println(frase); //Imprimindo a frase inserida pelo usuario


			//Vai contar  os espacos em branco presentes na frase
			for(int x = 0; x <= frase.length() -1; x++) {
				if(frase.charAt(i) == ' ') {
					espacos_branco++; //Vai ditar o numero de espacos em branco presentes na frase
				}
				
				//Vai verificar se a vogal "a" esta presente na frase e dizer quantas vezes ela aperece
				if(frase.charAt(x) == 'a' || frase.charAt(x) == 'A') { 
					a++;
					
				//Vai verificar se a vogal "e" esta presente na frase e dizer quntas vezes ela aparece 
				}else if(frase.charAt(x) == 'e' || frase.charAt(x) == 'E') { 
					e++;
					
				//Vai verificar se a vogal "i" esta presente na frase e dizer quantas vezes ela aparece
				}else if(frase.charAt(x) == 'i' || frase.charAt(x) == 'I') { 
					i++;
					
				//Vai verificar se a vogal "o" esta presente na frase e dizer quantas vezes ela aparece 
				}else if(frase.charAt(x) == 'o' || frase.charAt(x) == 'O') { 
					o++;
					
				//Vai verificar se a vogal "u" esta presente na frase e dizer quantas vezes ela aparece
				}else if(frase.charAt(x) == 'u' || frase.charAt(x) == 'U') { 
					u++;
					
				}	
				
			}
			
			System.out.println();
			
			System.out.println("\t--------------------------MENSAGENS----------------------------"); //Inicio da impressao de mensagens
			
			System.out.println("A frase contem: " + espacos_branco +  "espacos em brancos"); //Imprimindo na tela o numero de espacos em branco que a frase contem 
			
			System.out.println("A vogal A aparece: " + a + "vezes"); //Imprimindo na tela o numero de vezes que a vogal A aparece
			
			System.out.println("A vogal E aparece: " + e + "vezes"); //Imprimindo na tela o numero de vezes que a vogal E aparece
			
			System.out.println("A vogal I aparece: " + i + "vezes"); //Imprimindo na tela o numero de vezes que a vogal I aparece
			
			System.out.println("A vogal O aparece: " + o + "vezes"); //Imprimindo na tela o numero de vezes que a vogal O aparece
			
			System.out.println("A vogal U aparece: " + u + "vezes"); //Imprimindo na tela o numero de vezes que a vogal U aparece
			
			System.out.println("\t----------------------------FIM-----------------------------------\n"); //Fim da impressao de mensages
			
		}
	}
			
			