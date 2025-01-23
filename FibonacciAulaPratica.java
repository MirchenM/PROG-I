/*
Metodo Math.pow
Metodo.sqrt
Autor: Mirchen Miguel D. Maibaze

*/

import java.util.Scanner;
public class FibonacciAulaPratica {
	public static void main(String [] args) {
		Scanner lerDado = new Scanner (System.in);
		System.out.println("Insira um valor: ");
		int x = lerDado.nextInt();
		double i = Math.sqrt(5);
		double j = ((1+i)/2);
		double k = ((1-i)/2);
		double l = Math.pow(j,x);
		double h = Math.pow(k,x);
		//Operacao
		double  z = l - h;
		double Fi = z/i;
		//Impressao
		System.out.println("O resultado e: " +Fi);
	}
}

	