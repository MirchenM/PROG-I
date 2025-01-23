/*
O presente programa em JAVA permite ao usuario imprimir a serie de Fibonacci 
*/

import java.util.Scanner;
	public class SerieFibonacciEx20 {
		public static void main (String [] args) {
			Scanner ler = new Scanner (System.in);
			System.out.print("Insira um numero: ");
			int n = ler.nextInt();
			int m = 1, x = 0;
			if(n>=0)
				System.out.println(x+ " ");
			if (n>=1)
				System.out.println(m+ " ");
			for (int i=2; i<= n; i++) {
				int contar = m + x;
				System.out.println(contar+ " ");
				x = m;
				m = contar;
			}
		}
	}
	
		