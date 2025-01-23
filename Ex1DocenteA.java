/*

Este e um programa que cria um ArrayList e adiciona Strings nela.

Autor: Mirchen Miguel Domingos Maibaze.
Turma: LEIT14.
Compilar: javac Ex1DocenteA.java
Executar: java Ex1DocenteA

*/

//Importando as classes 
import java.util.Scanner;
import java.util.ArrayList;

	//Classe 
	public class Ex1DocenteA {
		
		//Metodo principal
		public static void main(String [] args) {
			Scanner lerNome = new Scanner (System.in); //Classe Scanner 
			ArrayList<String> carros = new ArrayList<String>(); //Criacao de um ArrayList 
			
			//Atributos 
			carros.add("Ford");
			carros.add("Navara");
			carros.add("Mercedes");
			carros.add("BMW");
			carros.add("Toyota");
			carros.add(lerNome.nextLine());
		
			System.out.println(carros.toString()); //Casting 
			
		}
	}
	