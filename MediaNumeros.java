/*
Faca um programa que permite receber varios numeros digitados pelo teclado e informe a media desses numeros.

Autor: Mirchen Miguel Domingos Maibaze 
Turma: LEIT14.
Compilar: javac MediaNumeros.java
Executar: java MediaNumeros

*/

//Importando a classe
import java.util.Scanner;

	//Classe 
	public class MediaNumeros {
		
		//Classe Scanner Estatica
		public static Scanner lerDado = new Scanner (System.in);
		
			//Metodo para determinar a soma 
			public static int Soma (int n) {
				int soma = 0;
					for (int i = 0; i < = n; i++) {
						if(n > 0) {
							soma = soma + n;
						}
					}
					return soma; //Retorno da soma 
					
		}
			//Metodo para determinar a media 
			public static double Media (int soma, int n) {
				double media = 0;
					for (int i = 0; i < = n; i++) {
						if(soma > 0) {
							media = soma/n;
						}
					}
					return media; //Retorno da media 
			}
			//Metodo princiapl 
			public static void main(String [] args) {
				int n;
				//int i;
				//Scanner lerDado = new Scanner (System.in);
				System.out.println("Insira a quantidade de numeros a digitar: ");
				
				int n = lerDado.nextInt();
				
				Soma(soma);//Chamando o metodo soma 
				
				Media(media);//Chamando o metodo media 
			
		}
		
	}
	