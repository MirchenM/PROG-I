/*
O programa em java pede que o usuario defina um intervalo de valores e faz uma varredura no mesmo procurando por numeros primos e os imprime na tela.

Autor: Mirchen Miguel D. Maibaze
2022
*/

import java.util.Scanner;
public class ExerN2 {
	public static void main(String [] args) {
		int inicio; //variavel que vai determinar o inicio do intervalo de valores dado pelo usuario 
		int fim; //variavel que vai determinar o fim do intervalo de valores dado pelo usuario
		int primo =0;
		Scanner lerDados = new Scanner (System.in);
		System.out.print("Insira o valor de partida: ");
		inicio = lerDados.nextInt();
		System.out.print("Insira o valor final do intervalo: ");
		fim = lerDados.nextInt();
		System.out.println(); //Quebra de linha
		for(int i=inicio; i<=fim; i++) {
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					primo++;
				}
			}
			if(primo ==2) {
				System.out.println("O numero " +i+ " e primo! ");
			}
			primo = 0;
		}
		System.out.println(); //Quebra de linha 
		System.out.println("FIM");
	}
}