import java.util.Scanner;

	//Classe
	public class LerValores {
		//Metodo principal
		public static void main(String [] args) {
			int a, b, c;
			Scanner lerValor = new Scanner (System.in);
			System.out.println("Informe o valor de B: ");
			b = lerValor.nextInt();
			System.out.println("Informe o valor de C: ");
			c = lerValor.nextInt();
			
			a = (c*b+b*b);
			System.out.println("O valor de A e: " +a);
		}
	}
	
		
		