import java.util.Scanner;

public class Sucessao2{
	
	public static int sucess (int n) {
		
		if(n == 1){
			
			return 1;
			
			
		}else{
			
			if(n == 2){
				
				return 2;
				
			}else{
				if (n > 2){
					return 2 / (sucess (n + 1));
				}else{
					
					return 0;
				}
				
			}
		}
	}
	
	public static void main (String [] args){
		
		Scanner dt = new Scanner (System.in);
		
		System.out.println("Insira o valor: ");
		
		int n = dt.nextInt();
		
		int b = sucess (n);
		System.out.println("Resultado = " +b);
	}
}
