/*

Autor: Mirchen Miguel Domingos Maibaze.
Turma: LEIT14.
Compilar: javac CriarArray.java
Executar: java CriarArray

*/

//Classe
public class DescontoEx19 {

	//Metodo principal 
	public static void main (String [] args) {
		char resp = 'S'; //Declara
		while (resp!= 'n') {
			System.out.println("Insira o carro");
			int ano = teclado.nextInt();
				if (ano<= 2000) {
					desconto = valor * 0.12;
				}else{
					desconto = valor * 0.07;
				}
				
				System.out.println("O desconto sera: " +desconto);
				System.out.println("Deseja continuar?, S: SIM e N: Nao");
				resp = teclado.nextcharAt(0);
		}
	}
	
}
	
				