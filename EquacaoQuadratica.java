
import java.util.Scanner;

public class EquacaoQuadratica {
	
	public static void validar (int a, int b, int c) {
		if(a!=0){
			delta(a,b,c) ;
		}else {
			System.out.print("Nao eh equacao quadratica");
		}
		
	}public static void delta (int a, int b, int c){
		int delta = Math.pow(b,2) - 4*a*c;
		if (delta>= 0){
			raizes (a,b,delta);
		}else {
			System.out.print("nao tem solucoes reais");
		}
	} public static void raizes (int a, int b, int delta) {
		System.out.print("x1="+(-b+Math.sqrt(delta))/(2*a));
	}
	
	
	public static void main(String [] args) {
		
		System.out.println(">>>>>>>>> this code was made by, Mirchen and Greece ");
		System.out.println(">>>>>>>>> doing this was so fuckn frustrating, but however, we had to do this");
		System.out.println(">>>>>>>>> give me a feedback after, not the movie, haha");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("insira o valor da a: ");
		int a = sc.nextInt();
		
		System.out.print("insira o valor de b: ");
		int b = sc.nextInt();
		
		System.out.print("insira o valor de c: ");
		int c = sc.nextInt();
		
		
		
	}
}