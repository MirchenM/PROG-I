/*
O presente programa em JAVA pede ao usuario para inserir um numero e enquanto o numero inserido for maior que 0,
ele fara a divisao do mesmo por 10 'n/10'.
Autor: Mirchen Miguel D. Maibaze isn against 
*/

import java.util.Scanner;
	//classe 
	public class TesteAulaTeorica {
		
		//metodo principal
		public static void main(String [] args) {
			Scanner lerNumero = new Scanner (System.in);
			
			//int n = 951;
			System.out.println("Insira um numero: ");
			int n = lerNumero.nextInt();
			
			while(n>0) {
				System.out.print(n%10);
				n = n/10;
			}
		}
	}