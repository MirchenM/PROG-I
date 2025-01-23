import java.util.Scanner;
	public class OrdemDecrescente {
		//Metodo Principal
		public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		System.out.println("Insira um numero: ");
		int n = ler.nextInt();
	
		System.out.println(decres (n));
	
		}	
	
		//Metodo Ordem Decrescente
		public static int decres(int n) {
		for(int i=1; i <= n; n--) {
			System.out.println(n);
		}return n;
	}
}
