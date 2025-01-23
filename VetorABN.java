/*
Compilar: java
Executar: javac
Autor: Mirchen Miguel D. Maibaze
*/


//importando a classe
import java.util.Scanner;


//declarando a classe 
public class VetorABN {
	//declarando a classe scanner global
	public static Scanner lerDado = new Scanner (System.in);
	
	//metodo com retorno para declaracao, criacao e recepcao de valores no vetor A
	public static int [] vetorA() {
		System.out.println("Insira o numero de elementos do vetor A: "); //pedindo ao usuario para inserir o numero de elementos que farao parte do vetor A
		int n = lerDado.nextInt(); //variavel "n" armazena o numero de elementos inseridos pelo usuario e tais elementos sao lidos pelo comando "lerDado" declarado na classe scanner
		int []a = new int [n]; //inserindo os elementos no vetor 
		for(int i = 0; i < a.length; i++) {
			System.out.print("A["+i+"] = ");
			a[i] = lerDado.nextInt();
		}
		return a; //retornando o vetor A
	}
	
	//metodo com retorno para declaracao, criacao e recepcao de valores no vetor A
	public static int [] vetorB() {
		System.out.println("Insira o numero de elementos do vetor B: "); //pedindo ao usuario para inserir o numero de elementos que farao parte do vetor B
		int n = lerDado.nextInt(); //variavel "n" armazena o numero de elementos inseridos pelo usuario e tais elementos sao lidos pelo comando "lerDado" declarado na classe scanner
		int []b = new int [n]; //inserindo os elementos no vetor
		for(int i = 0; i < b.length; i++) {
			System.out.print("B["+i+"] = ");
			b[i] = lerDado.nextInt();
		}
		return b; //retornando o vetor B
	}
	
	
	//metodo com retorno que vai efectuar o somatorio dos vetores A e B 
	public static int somatorio(int []a, int []b) {
		int somat = 0; //inicializacao da variavel que vai armazenar o somatorio dos vetores A e B
		for(int i = 0; i <a.length; i++) { //acedendo aos valores presentes no vetor A
			for(int j = 0; j < b.length; j++) { //acedendo aos valores presentes no vetor B 
				somat = a[i] + b[(b.length) - 1]; //efectuando o somatorio dos vetores
			}
		}
		return somat;
	}
	
	//metodo principal
	public static void main(String [] args) {
		int [] a = vetorA(); //chamando o vetor A
		int [] b = vetorB(); //chamando o vetor B
		//System.out.println("O somatorio dos vetores A e B e: " +somat(a,b));
		//somatorio (a,b); chamando o metodo que efectuou o somatorio
	}
}