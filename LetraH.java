/*



*/


	public class LetraH {
		void H() {
			for(int i =1; i<=5; i++) {
				for(int j=1; j<=5; j++) {
					if(j==1 || i==3 || j==5) {
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
			LetraH obj = new LetraH();
			obj.H();
		}
	}
	
	