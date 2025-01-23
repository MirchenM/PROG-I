import java.util.Scanner;
import java.util.Arrays;

public class Exercicio1Array {
	
	static Scanner ler = new Scanner (System.in);
	
	public static int [] lerDados() {
		int [] A = new int [10];
		
		for(int i=0; i<10; i++) {
			System.out.print("Digite um valor: ");
			A[i] = ler.nextInt();
		}
		return A;
	}
	
	
	public static void qtPares(int [] V) {
		int quantidade = 0;
		for(int i=0; i<V.length; i++) {
			if(V[i]%2 ==0) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	public static void main(String [] args) {
		lerDados(A);
		System.out.println("Quantidade: " +qtdPares(V));
	}
}

	
	
		