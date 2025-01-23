import javax.swing.JOptionPane;
public class P1_Q1 {
	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("Digite um numero");
		int num = Integer.parseInt(str);
		for(int i = 1; i <= num; i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
}
