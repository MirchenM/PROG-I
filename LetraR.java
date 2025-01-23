/*



*/


	public class LetraR {
		void R() {
			for(int i =1; i<=5; i++) {
				for(int j=1; j<=5; j++) {
					if(i==1 && j<5 || j==1 || i==3 && j<5 || i==2 && j==5 || i==j && i>3) {
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
		
		public static void main(String [] args) {
			LetraR obj = new LetraR();
			obj.R();
		}
	}
	
	