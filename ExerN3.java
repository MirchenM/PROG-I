/*
O programa em java mostra quantos segundos se passaram desde as 00:00:00.

Autor: Mirchen Miguel D. Maibaze
2022
*/

public class ExerN3 {
	public static void main(String [] args) {
	
	int hora;// varial hora 
	int min; //variavel minuto
	int seg; // variavel segundo
	int temppassado; //variavel para armazenar o tempo que passou
	
	hora = 24;
	min = 60;
	seg = 60;
	
	temppassado = (hora * 3600) + (min * 60) + seg;
	System.out.println("Passaram-se " + temppassado + " segundos desde as 0h00mins0seg"); //00:00:00
	}
}
