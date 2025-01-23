/*



*/


	public class LetraM {
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
		
		public static void main (String [] args) {
			LetraM obj = new LetraM();
			obj.M();
		}
	}
	