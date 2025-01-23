/*

Este e um programa em JAVA que cria um Array de 10 elementos.

Autor: Mirchen Miguel Domingos Maibaze.
Turma: LEIT14.
Compilar: javac CriarArray.java
Executar: java CriarArray

2022
*/


//Importando a classe
import java.util.Arrays;

	//Classe
	public class CriarArray {
	
		//Metodo sem retorno para criar Array 
		public static void criarArray() {
	
			int [] lista; // Declaracao de Array
			lista = new int [10]; //Criacao de novo Array
	
		//Atribuicao de valores
		for(int cont=0; cont<lista.length; cont++) {
		
			lista[cont] = cont;
		
		}
		
			for(int cont=0; cont < lista.length; cont ++) {
		
				System.out.println(lista[cont]);
			}
			
		}
		
		//Metodo principal 
		public static void main(String [] args) {
		criarArray(); //Chamando o metodo para criar Array 
		}
	}