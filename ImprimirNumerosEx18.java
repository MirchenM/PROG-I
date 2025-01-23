import java.util.Scanner;
	public class ImprimirNumerosEx18 {
		public static void main (String [] args) {
			Scanner numero = new Scanner (System.in);
			int inicio = 1;
			int par = 0;
			int imp = 0;
			while(true){
			if(inicio ==31) {
				break;
			}
			if (inicio%2 == 0) {
				par = par*inicio;
			}else{
				imp = imp + inicio;
			}
			inicio++;
			
		}
		System.out.println("A multiplicacao dos numeros pares e:" +par);
		System.out.println("Os numeros impares somados sao:" +imp);
		}
	}
	
			