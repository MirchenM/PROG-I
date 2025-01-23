/*
O presente programa simula as operacoes basicas de uma calculadora (Adicao, Subtracao, Multiplicacao e Divisao).

Autor: Mirchen Miguel D. Maibaze
2022
*/

import java.util.Scanner;
	public class Calculadora {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			System.out.print("i=");
			int i = ler.nextInt();
			System.out.print("j=");
			int j = ler.nextInt();
			System.out.println("+ : Adicionar, - : Subtrair, * : Multiplicar, / : Dividir");
			char escolha = ler.next().charAt(0);
			double result = 0;
			switch (escolha) {
				case '-' : result = i - j; break;
				case '+' : result = i + j; break;
				case '*' : result = i * j; break;
				case '/' : if(j!=0) {
								result = i/j;
							}else{
								System.out.println("Erro!");
							}
							break;
				default: System.out.println("Escolha recusada! Tente novamente.");
				break;
			}
			System.out.println("O resultado e: " +result);
		}
	}