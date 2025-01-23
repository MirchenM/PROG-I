/*
Metodo Random
Casting
Metodo Math
Autor: Mirchen Miguel D. Maibaze

*/

import java.util.Scanner;
import java.util.Random;
public class PIExample{
	public static void main (String [] args){
		Scanner enter = new Scanner (System.in);
		System.out.println ("Informe o raio:");
		float raio = enter.nextFloat();
		float area, circun;
		area = (float) (Math.PI * raio * raio);
		circun = (float) (2 * Math.PI * raio);
		
		System.out.println ("Area = " +area);
		System.out.println ("Circunferencia = " +circun);
		
		
	}
}