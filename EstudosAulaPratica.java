/*

Este programa gera um numero aleatorio no intervalo de 0-10.
Metodo Random

Autor: Mirchen Miguel Domingos Maibaze.
Turma: LEIT14.
Compilar: javac EstudosAulaPratica.java
Executar: java EstudosAulaPratica

*/

//Importando a classe 
import java.util.Random;

	//Classe
	public class EstudosAulaPratica {
		
		//Metodo principal
		public static void main(String[] args) {
		int numero = (int)(Math.random() * 11); //Gera um numero aleatorio entre 0 e 10
		System.out.println("O numero gerado foi: " +numero); //Imprimindo na tela o numero digitado 
		
		System.exit(0);
		
		}
		
	}