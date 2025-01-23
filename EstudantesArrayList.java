
//Importando a classe
import java.util.*;

	//Classe
	public class EstudantesArrayList {
		
		//Classe Scanner estatica 
		public static Scanner lerNome = new Scanner (System.in);
		
			//Metodo com retorno para preencher ArrayList
			public static ArrayList<String> preencherLista() {
				ArrayList<String> L = new ArrayList();
				System.out.println("Insira o nome :"); //Pedindo do usuario para inserir um nome via teclado 
				String nome = lerNome.nextLine();
					while(!nome.equals("fim")) {
						L.add(nome);
						System.out.println("Insira 'Fim' para terminar"); //Pedindo ao usuario para inserir "FIM" para encerrar o programa 
						System.out.print("Insira nome: ");
						nome = lerNome.nextLine();
					}
					return L;
			}
				
				//Metodo sem retorno para imprimir ArrayList
				public static void imprimirLista1(ArraysList<String>L) {
					System.out.println(L);
				}
				
				//Metodo sem retorno para imprimir ArrayList
				public static void imprimirLista2(ArrayList<String>L) {
					for(int i = 0; i < L.size(); i++) {
						System.out.println(L.get(i));
					}
				}
				
				//Metodo sem retorno para imprimir ArrayList
				public static void imprimirLista3(ArrayList<String>L) {
					for(String nome : L) {
						System.out.println(nome);
					}
				}
				
				//Metodo sem retorno para Pesquisar nome no ArrayList 
				public static void pesquisarNome(ArrayList<String>L) {
					int indice = 1;
					for(int i = 0; i < L.size(); i++) {
						if(nome.equals(L.get(i))) {
							indice = i;
						}
					}
					if(indice == -1) {
						System.out.println("Nao existe!");
					}else {
						System.out.println("Existe na posicao: " +indice);
					}
				}
				public static void main(String [] args) {
					String nome;
					char L;
					imprimirLista1(L);
					imprimirLista2(L);
					imprimirLista3(L);
					
				}
				
	}
			