/*
Este e um programa que dado um objecto faz:
a) adiciona valores ao objecto;
b) remove o valor na posicao 0 do objecto;
c) remove o valor da posicao 1 do objecto;
d) elimina os valores do objecto;
e) imprime os valores do objecto;
f) busca e imprime o valor da posicao 1 ;
g) verifica se  objecto esta vazio;
h) verifica se um valor esta contido no objecto;
i) informa o tamanho do objecto;
j) informa o indice do valor.


compilar: javac Main.java
executar: java Main
autor: Mirchen Miguel D. Maibaze 

*/
import java.util.ArrayList;

	public class Main {
		
		public static void main(String [] args) {
			
			ArrayList<String> clientes = new ArrayList<String>();
			
			clientes.add("Mirchen"); //Adicionando valor ao objecto 
			
			clientes.add("Miguel"); //Adicionando valor ao objecto 
			
			//clientes.remove(0); //Remove o valor que estiver na posicao 0 
			
			//clientes.remove(1); //Elimina o valor que estiver na posicao 1 
			
			//clientes.clear(); //Elimina os valores presentes no objecto 
			
			System.out.println(clientes.toString()); //Imprime os valores presentes no objecto 
			
			System.out.println(clientes.get(1)); //Vai imprimir o valor que estiver na posicao 1
			
			System.out.println(clientes.isEmpty()); //Verifica se o objecto esta vazio
			
			System.out.println(clientes.contains("Mirchen")); //Retorna um valor booleano
			
			System.out.println(clientes.size()); //Informa o tamanho do objecto 
			
			System.out.println(clientes.indexOf("Mirchen")); //Informa o indice do valor 
			
		}
	}
	