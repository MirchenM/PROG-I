/*
compilar: javac
executar: java
Autor: Mirchen Miguel D. Maibaze
turma: I14
2022

O programa em java converte a temperatura inserida pelo usuario para Graus Fahrenheit.
*/
		
//Importando a classe Scanner
import java.util.Scanner;
	//Declaracao da classe
	public class ConversorTemperaturaTPN1 {
		//metodo main
		public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.print("graus=");
		int graus = ler.nextInt();
		int gfahr; // variavel que vai armazenar o valor em graus Fahrenheit
		gfahr = (9 * graus +160)/5;
		System.out.println("A temperatura em graus Fahrenheit e: " +gfahr);
		}
	}
		