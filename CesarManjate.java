/*
O presente programa verifica se o ano inserido pelo usuario e ou nao bissexto.

Autor: Mirchen Miguel D. Maibaze
2022
*/
import java.util.Scanner;
public class CesarManjate {
    public static void main(String[] args){
        Scanner lerDado = new Scanner(System.in);
        int ano;
        System.out.println("Digite um ano para saber se e bissexto: ");
        ano = lerDado.nextInt();
        //se o ano for maior que 400
        if(ano % 400 == 0){
            System.out.println(ano + " o ano e bissexto!");
        //se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " o ano e bissexto!");
        } else{
            System.out.println(ano + " nao e um ano bissexto!");
        }
    }
}