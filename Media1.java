
import java.util.Scanner;

public class Media1{
	public static void main (String [] args){
		
		Scanner sc = new  Scanner (System.in);
		
		System.out.println("insira a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("insira a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.print("insira a terceira nota: ");
		double nota3 = sc.nextDouble();
		
		double somar = somar(nota1, nota2, nota3);
		double media (somar);
		System.out.print(desempenho(media));
		
		//System.out.print("a media: " +media(mediaf));
		//System.out.println("")
	}
	
	public static double soma (double nota1, double nota2, double nota3){
		
		//double somar = nota1+nota2+nota3;
		//double media = somar/3;
		return nota1+ nota2+ nota3;
	}
		 public static double media (double somar){
		return somar/3;
		
		//return mediaf;
	}
	public static String desempenho(double media) {
		if(media>=18 && media <=20) {
			return "Excelente";
		}
	}
	
}