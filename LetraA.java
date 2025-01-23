/*
Este e um programa em java que mostra a letra A

*/
	public class LetraA {
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
			public static void main(String [] args) {
				LetraA obj = new LetraA();
				obj.A();
			}
	}