public class SomaeProduto {
	public static void main(String[] args) {
		long produtoPar = 1;
		int somaImp = 0;
		int num;
		for(num = 0; num <= 30; num++) {
			if(num%2==1) {
				somaImp += num;
			}else{
				if(num > 0)
					produtoPar *= num;
			}
		}
		System.out.println("\nSoma dos impares: " + somaImp);
		System.out.println("Produto dos pares: " + produtoPar);
	}
}

			
			
			