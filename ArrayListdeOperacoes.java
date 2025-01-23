/* 
Autor: Mirchen Miguel D. Maibaze
compilar: javac ArrayListdeOperacoes.java
executar: java ArrayListdeOperacoes

*/

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListdeOperacoes {
	
	public static Scanner lerValor = new Scanner(System.in);
	
	//Metodo para preencher ArrayList
	public static ArrayList<Integer> Preencher(int n) {
		ArrayList <Integer> num = new ArrayList<Integer>();
		for (int i=0;i<n;i++){
			System.out.println("Insira o nr"+i+"numero: ");
			num.add(lerValor.nextInt());
		}
		return num;
	}
	//metodo para imprimir o ArrayList
	public static void Imprimir(ArrayList<Integer> al){
		for (int i = 0; i < al.size(); i++){
			System.out.print(al.get(i)+"  ");
		}
		System.out.println();
	}
	//metodo para adicionar os elementos do ArrayList
	public static int Adicionar(ArrayList<Integer> al){
		int soma=0;
		for(int i=0;i<al.size();i++){
			soma=soma+al.get(i);
		}
		return soma;
	}
	//Metodo Para Multiplicar os elementos do ArrayList
	public static int Multiplicar(ArrayList<Integer> al){
		int produto = 1;
		for(int i = 0; i < al.size();i++){
			produto = (produto*al.get(i));
		}
		return produto;
	}
	
	//metodo para determinar a media do ArrayList
	public static double Media(ArrayList<Integer> a,int soma){
		double media = (soma/a.size());
		return media;
	}
	
	//metodo que retorna o menor elemento do ArrayList
	public static int Menor(ArrayList<Integer> al){
		int menor = al.get(0);
		for (int i = 0; i < al.size();i++){
			if (menor > al.get(i)){
				menor = al.get(i);
			}
		}return menor;
	}
	
	//Metodo que retorna o maior elemento do ArrayList
	public static int Maior(ArrayList<Integer> al){
		int maior = 0;
		for(int i = 0; i <al.size(); i++){
			if(maior < al.get(i)) {
				maior = al.get(i);
			}

		}
		return maior;
	}
	//metodo principal
	public static void main(String[]args){
		//inserindo o tamanho do ArrayList 
		int n = lerValor.nextInt();
		ArrayList<Integer> A = Preencher(n);
		//chamando os metodos
		Imprimir(A);
		int soma = Adicionar(A);
		int produto = Multiplicar(A);
		double media = Media(A,soma);
		int menor = Menor(A);
		int maior = Maior(A);
		
		System.out.println("\t-----------------------MENSAGENS--------------------\n");
		System.out.println("A soma= "+soma);
		System.out.println("O produto= "+produto);
		System.out.println("A Media= "+media);
		System.out.println("O menor valor e "+menor+" e o maior e "+maior);
		System.out.println("\t----------------------FIM DA IMPRESSAO DE MENSAGENS-----------------------\n");
		
	}
}
	