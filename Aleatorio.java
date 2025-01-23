/* 

Autor: Mirchen Miguel D. Maibaze 
Turma: LEIT14.
Compilar: javac Aleatorio.java
Executar:java Aleatorio

O presente programa em JAVA gere 6 numeros aleatorios (entre os quais positivos e negativos)

*/

//Importando a classe
import java.util.Random;

	//Classe
	public class Aleatorio {
		
		//Metodo sem retorno 
		public static void Rand(){
			Random rand = new Random();
			int num = 0;
			for(int i = 0; i < 6; i++){
				for(int j = 0; j < 8; j++){
					num = rand.nextInt();
				}
				System.out.println(num);
			}
		}	
	
		//metodo principal
		public static void main (String [] args){
		Rand();
		}
	}