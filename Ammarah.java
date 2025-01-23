/*

Este e um programa em java criado para escrever o nome de Ammarah Ismael Ilal.

compilar: javac Ammarah.java
executar: java Ammarah
autor: Mirchen Miguel D. Maibaze

*/
		//Classe 
		public class Ammarah {
			
			//Imprimindo a letra A
			class LetraA {
			void A() {
				int n = 5;
				int px = n;
				int py = n;
				for(int i = 1; i <= 5; i++) {
					for(int j = 1; j <= 10; j++) {
						if(j==px || j==py || i==n/2+1 && j==5) {
							System.out.print("*"); 
						}
						else {
							System.out.print(" ");
						}
					}
					px++;
					py--;
					System.out.println();
				}
				System.out.println();
			}
			}
			
			//Imprimindo a letra M
			class LetraM {
			void M() {
				for(int i=1; i<=5; i++) {
					for(int j=1; j<=7; j++) {
						if(j==1 || j==7 || i==j && i<=4 || i==3 && j==5) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						} 
					}
					System.out.println();
				}
				System.out.println();
			}
			}
			
			//Imprimindo a letra M
			class LetraMM {
			void M() {
				for(int i=1; i<=5; i++) {
					for(int j=1; j<=7; j++) {
						if(j==1 || j==7 || i==j && i<=4 || i==3 && j==5) {
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						} 
					}
					System.out.println();
				}
				System.out.println();
			}
			}
			
			//Imprimindo a letra A
			class LetraAA {
			void A() {
				int n = 5;
				int px = n;
				int py = n;
				for(int i = 1; i <= 5; i++) {
					for(int j = 1; j <= 10; j++) {
						if(j==px || j==py || i==n/2+1 && j==5) {
							System.out.print("*"); 
						}
						else {
							System.out.print(" ");
						}
					}
					px++;
					py--;
					System.out.println();
				}
				System.out.println();
			}
			}
			
			//Imprimindo a letra R
			class LetraR {
			void R() {
				for(int i =1; i<=5; i++) {
					for(int j=1; j<=5; j++) {
						if(i==1 && j<5 || j==1 || i==3 && j<5 || i==2 && j==5 || i==j && i>3) {
							System.out.print("@");
						}
						else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				System.out.println();
			}
			}
			
			//Imprimindo a letra A
			class LetraAAA {
			void A() {
				int n = 5;
				int px = n;
				int py = n;
				for(int i = 1; i <= 5; i++) {
					for(int j = 1; j <= 10; j++) {
						if(j==px || j==py || i==n/2+1 && j==5) {
							System.out.print("*"); 
						}
						else {
							System.out.print(" ");
						}
					}
					px++;
					py--;
					System.out.println();
				}
				System.out.println();
			}
			}
			
			//Imprimindo a letra H
			class LetraH {
			void H() {
				for(int i =1; i<=5; i++) {
					for(int j=1; j<=5; j++) {
						if(j==1 || i==3 || j==5) {
							System.out.print("@");
						}
						else {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
				System.out.println();
			}
			}
				
			//Metodo principal
			public static void main(String [] args) {
				LetraA obj = new LetraA();
				obj.A();
				LetraM obj = new LetraM();
				obj.M();
				LetraM obj = new LetraM();
				obj.M();
				LetraAA obj = new LetraAA();
				obj.A();
				LetraR obj = new LetraR();
				obj.R();
				LetraAAA obj = new LetraAAA();
				obj.A();
				LetraH obj = new LetraH();
				obj.H();
			}
			
		}