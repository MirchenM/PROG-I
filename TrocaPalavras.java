/*
compilar: javac
executar: java 
Autor: Mirchen Miguel D. Maibaze

*/

//classe Scanner
import java.util.Scanner;
	//classe
	public class TrocaPalavras {
		//metodo main
		public static void main(String [] args) {
			Scanner lerPalavra = new Scanner (System.in);
			System.out.println("Informe a palavra: ");
			String palavra = lerPalavra.nextLine();
			String pal_maiuscula = palavra.toUpperCase(); 
			
			char character; // a variavel "character" vai armazenar as letras presentes na palavra/frase.
			int pts = 0; // a variavel "pts" vai armazenar o numero de pontos.
			
			for(int j = 0; j < pal_maiuscula.length(); j++) {
				character = pal_maiuscula.charAt(j);
				//vai procurar pelas letras: "Q" e "Z" e se estas estiverem presentes frases, a variavel "pts" vai receber 10 pontos.
				if(character == 'Q' || character == 'Z') {
					pts += 10;
				//vai procurar pelas letras: "J" e "X" e se estas estiverem presentes na frase, a variavel "pts" vai receber 8 pontos.
				}else if(character == 'J' || character == 'X') {
					pts += 8;
				// vai procurar pela letra "K" e se esta estiver presente na frase, a variavel "pts" vai receber 5 pontos.
				}else if(character == 'K') { 
					pts += 5;
				//vai procurar pelas letras: "F", "H", "V", "W" e "Y" e se estas estiverem presentes na frase, a vaiavel "pts" vai receber 4 pontos.
				}else if(character == 'F' || character == 'H' || character == 'V' || character == 'W' || character == 'Y') {
					pts += 4;
				//vai procurar pelas letras: "B","C", "M" e "P" e se estas estiverem presentes na frase, a variavel "pts" vai receber 3 pontos.
				}else if(character == 'B' || character == 'C' || character == 'M' || character == 'P') {
					pts += 3;
				//vai procurar pelas letras: "D" e "G" e se estas estiverem presentes na frase, a variavel "pts" vai receber 2 pontos.
				}else if(character == 'D' || character == 'G') {
					pts += 2;
				//para todas as outras letras, a variavel "pts" vai receber 1 ponto.
				}else{
					pts += 1;
				}
			}
			System.out.println("O numero de pontos e: " +pts);
		}
	}
	