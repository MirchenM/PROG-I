/*
compilar: javac
executar: java
Autor: Mirchen Miguel D.. Maibaze
*/

//classe
public class ContaCorrente {
	//Atributos
	//metodo main
	static void main(String [] args) {
		
	//declaracao de variaveis de entrada
	float saldo;
	float sac;
	float dep;
	float defsi;
		void definasaldoinicial(float defsi) {
			saldo = saldo + defsi;
		}
		
		void depositar(float dep) {
			saldo =saldo + dep;
		}
		
		void sacar(float sac) {
			if(sac>saldo) {
				System.out.println("Pedido recusado");
			}else{
			saldo = saldo - sac;
			}
		}
	}	
}