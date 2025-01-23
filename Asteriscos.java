/*
O programa em JAVA cria um rectangulo usando '*' com base no numero que o usuario inseriu.

Autor: Mirchen Miguel D. Maibaze

*/


//classe Scanner
import java.util.Scanner;
	//classe
	public class Asteriscos {
		//metodo main
		public static void main(String [] args) {
			Scanner lerDado = new Scanner (System.in);
			System.out.println("Informe o numero: ");
			int numero = lerDado.nextInt();
			
			for(int i = 0; i < numero; i++) { 
				System.out.print("*");
			}
					System.out.println("");
					
					for(int k = 0; k < numero - 2; k++) {
						System.out.print("*");
					
							for(int j = 0; j < numero - 2; j++) {
								System.out.print(" ");
							}
								System.out.println("*"); 
					}
									for(int z = 0; z < numero; z++) {
										System.out.print("*");
									}
										System.out.println("");
		}
	}
	
			