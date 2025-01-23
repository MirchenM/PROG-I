/*
O presente programa em JAVA pede que o usuario insira um certo numero de pesas e insira tambem o comprimento de cada uma delas e,
depois diz qual delas e adequada com base no seu comprimento, informando o numero de pecas. 
NB: O comprimento adequado das pecas varia entre 1.20 a 1.30 cm).

Autor: Mirchen Miguel 
2022
*/

import java.util.Scanner ;
public class Fabrica {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int n;
		int adequado;
		double comprimento;
		adequado = 0;
		System.out.println("Insira o numero de pecas:");
		n = input.nextInt();
		for(int i=1; i<=n; i++){
			System.out.println("Insira o comprimento da "+i+"ª peça!");
			comprimento = input.nextDouble();
			if(comprimento >= 1.20 && comprimento <= 1.30){
				adequado += 1; 
			}
		}
		System.out.println("Temos "+adequado+" pecas adequadas!");
	}
}