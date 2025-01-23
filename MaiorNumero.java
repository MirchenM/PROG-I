import java.util.Scanner;
	public class MaiorNumero {
	
	//Metodo Principal
		public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int x;
		int y;
		System.out.println("Insira o valor de x: ");
		x = ler.nextInt();
		System.out.println("Insira o valor de y: ");
		y = ler.nextInt();
		System.out.println("O maior entre eles e: " +maior (x, y));
		}
		
		
		//Metodo Comparacao
		public static int maior(int x, int y) {
		if(x > y) {
			return x;
		}else{
			return y;
		}
		}
	}
	
	
		