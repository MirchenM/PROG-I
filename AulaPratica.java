/*
O presente programa em JAVA gera um numero aleatorio que esteja no intervalo de [1-20].

Autor: Mirchen Miguel D. Maibaze
2022
*/
import java.util.Random;
	public class AulaPratica {
		public static void main(String [] args){
			Random random = new Random();
			int numero = random.nextInt(20);
			System.out.println(numero);
		}
	}