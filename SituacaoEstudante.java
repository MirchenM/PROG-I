/*
O presente programa em JAVA permite ao usuario determinar a sistuacao do estudante.
*/

public class SituacaoEstudante {
	public static void main (String [] args) {
		double media = 1;
		double nota1 = 12.75;
		int nota2 = 14;
		double projecto = 14.25;
		media = (nota1*0.3+nota2*0.3+projecto*0.4);
		System.out.println(media);
			if(media>=14) {
				System.out.println("Dispensado");
				if(media<10) {
					System.out.println("Excluido");
				}else{
					System.out.println("Aprovado");
				}
			}
	}
}
		
	

		
		
		