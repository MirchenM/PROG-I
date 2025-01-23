

import java.util.Scanner;

public class Sucessao1{
	
	public static int sucess (int v) {
		
		if(v > 1){
			
			return (-4 * (sucess(v + 1)));
			
			
		}else{
			
			return 3;
		}
	}
	
	public static void main (String [] args){
		
		Scanner dt = new Scanner (System.in);
		
		System.out.println("Insira o valor: ");
		
		int v = dt.nextInt();
		
		//int b = sucess (v);
		System.out.print (sucess(v));
		//System.out.println("Resultado = " +b);
	}
}

		