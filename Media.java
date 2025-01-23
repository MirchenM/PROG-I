
import java.util.Scanner;

public class Media{
	public static void main (String [] args){
		
		Scanner sc = new  Scanner (System.in);
		
		System.out.println("insira a primeira nota: ");
		int nota1 = sc.nextInt();
		
		System.out.println("insira a segunda nota: ");
		int nota2 = sc.nextInt();
		
		System.out.print("insira a terceira nota: ");
		int nota3 = sc.nextInt();
		
		//System.out.print("a media" +media (mediaf));
		//System.out.println("")
	}
	
	public static double soma (int nota1, int nota2, int nota3, double somar){
		
		somar = nota1+nota2+nota3;
		//double media = somar/3;
		return somar;
		
	} public static double media (double somar){
		//double mediaf = somar/3;
		return media (soma)/3;
	}
}