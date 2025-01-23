/*
O presente programa em JAVA pede que o usuario insira 3 numeros, depois le os numeros e efectua a operacao matamtica.
*/

import java.util.Scanner;
	public class SistemaLeiaNumeros {
		public static void main(String[] args) {
			Scanner ler = new Scanner (System.in);
			System.out.print("a=");
			int a = ler.nextInt();
			System.out.print("b=");
			int b = ler.nextInt();
			System.out.print("c=");
			int c = ler.nextInt();
			int r = 0;
			int s = 0;
			r = a + (b*2);
			s = b + (c*2);
			System.out.println(); //Quebra de linha
			System.out.println(r);
			System.out.println(s);
		
		System.out.println(); //Quebra de linha	
		System.out.println("Powered by @MirchenMiguel");
			
		}
		
	}
			