/*
Dado um array unidimensional de inteiros T, tentamos criar um novo array unidimensional com indices de T,
onde iremos pesquisar um numero, se o numero existe no array nos iremos 
guardar o seu indice no array de indices. Por exemplo, com o vector T= {1,6,8,8,8,4,2,1,1,8,4,4}, o valor
procurado e 8, assim o vector de indices sera (2,3,4,9). Faca um programa baseado em metodos, que:
a) Preencha o vector de inteiros.
b) Cria um array unidimensional com os indices dos valores iguais que existam no vector e imprime o tamanho do mesmo.

Autor: Mirchen Miguel D. Maibaze.
Turma: LEIT14.
Compilar: javac ArrayDeIndices.java
Executar: java ArrayDeIndices
*/

//Importando as classes 
import java.util.*;

	//Classe
	public class ArrayDeIndices {
	
		//Classe Scanner estatica 
		public static Scanner lerDado = new Scanner (System.in);

			//Metodo com retorno para prencher o Array 
			public static int []PreencherArray(int n) {
				int []T = new int[n];
					for(int i = 0; i < n; i++){
						System.out.print("T["+i+"]: ");
							T[i] = lerDado.nextInt();
					}				
					return T; //Retorno do Array ja preenchido
			}
		
		
			//Metodo sem retorno para imprimir o array 
			public static void ImprimirArray(int []T) {
				System.out.println("\t------------------------------IMPRESSAO DO ARRAY----------------------------\n"); //Impressao do Array 
				System.out.println(Arrays.toString(T)); //Imprimindo o Array 
				System.out.println("\t--------------------------FIM DA IMPRESSAO DO ARRAY----------------------------\n"); //Fim da impressao do Array 
			}
		
		
		
			//Metodo com retorno para preencher o Array dos indices  
			public static void PreencherArray(int [] T) {
				ArrayList<Integer> L = new ArrayList<>();
					for(int i = 0; i <= T.length-2; i++) {
						if(T[i] == T[i+1] && !L.contains(i)) {
							L.add(i);
								if(i+2 < T.length) {
									if(T[i+1] != T[i+2]) {
										L.add(i+2);
									}
								}
						}	
					}
					
					System.out.println("\t--------------------------IMPRESSAO DE MENSAGENS----------------------------\n"); //Inicio da impressao de mensagens
				
					System.out.println("O Array dos indices e: "+L); //Imprimindo o Array dos indices 
				
					System.out.println("O tamanho do Array dos indices e: "+L.size()); //Imprimindo o tamanho do Array dos indices 
				
					System.out.println("\t----------------------FIM DA IMPRESSAO DE MENSAGENS-----------------------\n"); //Fim da impressao de mensagem 
				
			}
			
		
			//Metodo principal
			public static void main(String [] args) {
				System.out.print("Insira o tamanho do Array: "); //Pedindo ao usuario para inserir o tamanho do Array
			
				int n = lerDado.nextInt(); //Variavel n que vai armazenar o valor inserido pelo usuario que vai definir o tamanho do Array 
			
				int []T = PreencherArray(n); //Chamando o metodo para preencher o Array 
			
				ImprimirArray(T); //Chamando o metodo para imprimir o Array 
			
				PreencherArray(T); //Chamando o metodo para preencher o Array dos indices
				
			}
			
	}
