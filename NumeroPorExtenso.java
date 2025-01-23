/*
Autor: Mirchen Miguel Domingos Maibaze
Exercicio 19
Escreva um programa que dado um valor numérico digitado pelo usuário 
(armazenado em uma variável inteira), imprima cada um dos seus dígitos por 
extenso

*/

import java.util.Scanner;
	//classe
	public class NumeroPorExtenso {
		//metodo principal
		public static void main(String [] args) {
			Scanner lerNumero = new Scanner (System.in);
			System.out.println("Insira um numero: ");
			int n = lerNumero.nextInt();
			
			String nn = n+"";
			
			for(int i = 0; i < nn.length(); i++) {
				if(nn.charAt(i)) == (' 0 ') {
					System.out.println("Zero");
				}else if(nn.charAt(i)) == (' 1 ') {
					System.out.println("Um");
				}else if(nn.charAt(i)) == (' 2 ') {
					System.out.println("Dois");
				}else if(nn.charAt(i)) == (' 3 ') {
					System.out.println("Tres");
				}else if(nn.charAt(i)) == (' 4 ') {
					System.out.println("Quatro");
				}else if(nn.charAt(i)) == (' 5 ') {
					System.out.println("Cinco");
				}else if(nn.charAt(i)) == (' 6 ') {
					System.out.println("Seis");
				}else if(nn.charAt(i)) == (' 7 ') {
					System.out.println("Sete");
				}else if(nn.charAt(i)) == (' 8 ') {
					System.out.println("Oito");
				}else if(nn.charAt(i)) == (' 9 ') {
					System.out.println("Nove");
				}
			}
		}
	}
	
			
		
			
			
	
	
			