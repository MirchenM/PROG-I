	public class AmmarahIlal {
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