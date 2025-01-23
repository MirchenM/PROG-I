/*
O programa em java gera numeros divisiveis por 3 cujo o resto seja 0 que estejam no intervalo de 1-100.

Autor: Mirchen Miguel D. Maibaze
2022
*/

public class Ex14 {
	public static void main(String[]args){
		for(int i=1; i<=100; i++){
			if(i % 3 ==0){
				System.out.println(i);
			}
		}
	}
}