/*
O programa em java converte os graus inseridos pelo usuario em graus Fahrenheit.

Autor: Mirchen Miguel D. Maibaze
2022
*/
import java.util.Scanner;
	public class ConversorTemperatura {
		public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.print("Graus=");
		int graus = ler.nextInt();
		int gfahr; // Graus Fahrenheit
		gfahr = (9 * graus +160)/5;
		System.out.println();
		System.out.println("A temperatura em graus Fahrenheit e: " +gfahr+ " graus");
		}
	}
		