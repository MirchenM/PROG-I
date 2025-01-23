/*
O programa em JAVA calcula a soma dos impares e calcula o produto dos pares.
*/

public class SomaeProduto {
	//Metodo Principal
	public static void main(String[] args) {
		long produtoPar = 1;
		int somaImp = 0;
		int i;
		for(i = 0; i <= 30; i++) {
			if(i%2==1) {
				somaImp += i;
			}else{
				if(i > 0)
					produtoPar *= i;
			}
		}
		System.out.println("\nSoma dos impares: " + somaImp);
		System.out.println("Produto dos pares: " + produtoPar);
		System.out.println();
		System.out.println("Powered by @Mirchen Miguel");
	}
}

			
			
			