/*
compilar: javac 
executar: java
Autor: Mirchen Miguel D. Maibaze

O presente programa simula as operacoes basicas de uma calculadora (Adicao, Subtracao, Multiplicacao e Divisao).
2022
*/

//classe Scanner
import java.util.Scanner;
	//classe
	public class CalculadoraTPN1 {
		//metodo main
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			System.out.println("i=");
			int i = ler.nextInt();
			System.out.println("j=");
			int j = ler.nextInt();
			System.out.print("+ : Adicionar, - : Subtrair, * : Multiplicar, / : Dividir");
			double result = 0;
			switch (escolha) {
				case '-' : result = i - j; break;
				case '+' : result = i + j; break;
				case '*' : result = i * j; break;
				case '/' : if(j!=0) {
							result = i/j;
				}else{
							System.out.println("Nao existe!");
				}
			}
				break;
			default: System.out.println("Opcao Invalida"); break;
			}
			System.out.println("O resultado e: " +result+);
		}
	}
	
	