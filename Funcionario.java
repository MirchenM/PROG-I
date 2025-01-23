/*
Autor: Mirchen Miguel D. Maibaze
compilar: 
executar:
*/

//Importando a classe 
import java.util.Scanner;
	
	//Classe 
	public class Funcionario {
		
		//Atributos
		String nome;
		String sobrenome;
		int horasTrabalhadas;
		float valorPorHora;
	
		//Metodos 
		//Metodo principal
		public static void main(String [] args) {
			int horasTrabalhadas = 10; //Inicializacao da variavel 
			float valorPorHora = 25.50f; //Inicializacao da variavel
			
			Scanner ler = new Scanner (System.in); //Classe Scanner 
			
			System.out.println("Insira o nome: "); //Pedindo ao usuario para inserir o nome via teclado
			nome = ler.next(); //Lendo o nome inserido pelo usuario 
			
			System.out.println("Insira o sobrenome: "); //Pedindo ao usuario para inserir o sobrenome via teclado 
			sobrenome = ler.next(); //Lendo o sobrenome inserido pelo usuario
		
			nomeCompleto(nome, sobrenome); //Chamando o metodo que vai concatenar o nome e o sobrenome do funcionario 
			calcularSalario(horasTrabalhadas, valorPorHora); //Chamando o metodo que vai calcular o salario do funcionario
			incrementarHoras(incrementarHoras,valorPorHora); //Chamando o metodo que vai calcular as horas incrementadas
			
		}
		
		//Metodo com retorno para concatenar o nome e o sobrenome do funcionario
		public String nomeCompleto(String nome, String sobrenome) {
			return nome.concat(sobrenome); //Retorno do nome completo do funcionario
		}
	
		//Metodo com retorno para calcular o salario do funcionario
		public float calcularSalario(int horasTrabalhadas, float valorPorHora) {	
			return horasTrabalhadas*valorPorHora; //Retorno do salario do funcionario 
		}
	
		//Metodo com retorno para incrementar as horas 
		public void int incrementarHoras(int incrementarHoras, float valorPorHora) {
			return valorPorHora*incrementarHoras; //Retorno das horas incrementadas 
		}
		
	}