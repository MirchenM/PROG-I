
import java.util.Scanner;
	public class PositivoNegativo {
		public static void main (String [] args){
			
			Scanner sc = new Scanner (System.in);
			
			System.out.print("Insira um nr: ");
			int nr = sc.nextInt();
			System.out.print(nr);
			
		}
		
		public static boolean retorno (int nr){
			
			if (nr>0){
			return true; 
			} else {
			 return false;
			}
		}
	}