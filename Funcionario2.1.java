/*
Autor: Mirchen Miguel D. Maibaze
compilar: 
executar:
*/

import java.util.Scanner;

public class Funcionario2.1 {
	//Atributos
	String nome;
	String sobrenome;
	int horasTrabalhadas;
	float valorPorHora;
	
	//Metodos 
	//Metodo principal
	public static void main(String [] args) {
		int horasTrabalhadas = 10;
		float valorPorHora = 25.50f;
		Scanner ler = new Scanner (System.in);
		System.out.println("Insira o nome: ");
		nome = ler.next();
		SYstem.out.println("Insira o sobrenome: ");
		sobrenome = ler.next();
		
		nomeCompleto(nome, sobrenome); 
		calcularSalario(horasTrabalhadas, valorPorHora);
		incrementarHoras(incrementarHoras,valorPorHora);
	}
	//Metodo Nome Completo
	public String nomeCompleto(String nome, String sobrenome) {
		String nomeC = nome.concat(sobrenome);
		return nomeC;
	}
	
	//Metodo calcular salario
	public float calcularSalario(int hora, float valorPorHora) {	
		float salario = hora*valorPorHora;
		return salario;
	}
	
	//Metodo para incrementar horas
	public void int incrementarHoras(int hora) {
		valorPorHora = valorPorHora+hora;
		return valorPorHora;
	}
}