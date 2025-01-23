/*
Autor: Mirchen Miguel D. Maibaze
compilar: 
executar:
*/

import java.util.Scanner;

public class ContaCorrente1 {
	//Atributos
	float saldo;
	
	//Metodos
	//Metodo principal
	public static void main() {
	Scanner lerDados = new Scanner (System.in);
	System.out.println("Insira o saldo inicial: ");
	float saldoinicial = lerDados.nextFloat();
	
	System.out.println("Insira o valor do deposito: ");
	float dep = lerDados.nextFloat();
	
	System.out.println("Insira o valor a sacar: ");
	float sacar = lerDados.nextFloat();
	
		definifSaldoInicial(defSI);
		depositar(dep);
		sacar(sac);
		
	}
	
	//Metodo definir saldo inicial da conta corrente
	void definirSaldoInicial(float defSI){
		saldo = saldo + defSI;
	}
	
	//Metodo depositar valor conta corrente
	void depositar(float dep){
		saldo = saldo + dep;
	}
	
	//Metodo sacar valor da conta conta
	void sacar(float sacar){
		if(sacar > saldo) {
			System.out.println("Impossivel sacar!");
		}else{
		sacar = sacar - defSI;
	}
}
}