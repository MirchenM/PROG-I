

import java.util.Scanner;

public class Sucessao{
	
	//metodo com retorno que vai buscar o resultado da expressao (Un = { U(n-1) + 2 se n >= 5; 1 se n < 5}) 
	public static int suces (int n){
		
		if (n < 5){
			
			return 1;
			
		}else{
			
			return suces (n - 1) + 2; //(U(n-1) + 2)
		}
	}
	
	//metodo principal
	public static void main (String args []){
		
		Scanner dt = new Scanner (System.in);
		
		System.out.print ("Introduza o valor: "); //pedindo ao usuario para inserir um valor 
		
		int n = dt.nextInt (); //variavel n que vai armazenar o valor introduzido pelo usuario 
		
		int s = suces (n);
		System.out.println ("Resultado = " +s);
		
		System.out.println();
		System.out.println("Powered by @Mirchen Miguel");
	}
}