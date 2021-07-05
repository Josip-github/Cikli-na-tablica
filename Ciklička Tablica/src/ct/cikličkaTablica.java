package ct;

import javax.swing.JOptionPane;

public class ciklièkaTablica {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog
				("Koliko redaka želite u tablici?"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog
				("Koliko stupaca želite u tablici?"));
		
		int [][] ct = new int [n1][n2];
		
		int k = 1, c1 = 0, c2 = n2 - 1, r1 = 0, r2 = n1 - 1;
		
		while(k <= n1 * n2) {
			
			for(int i = c2; i >= c1; i--) {
				ct[r2][i] = k++;
			}
			
			for(int j = r2 - 1; j >= r1; j--) {
				ct[j][c1] = k++;
			}
			
			for(int i = c1 + 1 ; i <= c2 ; i++) {
				ct[r1][i] = k++;
			}
			
			for(int j = r1 + 1; j <= r2 - 1; j++) {
				ct[j][c2] = k++;
			}
			
			c2--;
			c1++;
			r2--;
			r1++;
		}
		
		System.out.println("Ciklièka tablica: \n");
		
		for(int i = 0; i < n1; i++) {
			for(int j = 0; j < n2; j++) {
				System.out.print(ct[i][j] + "\t");
			}
			System.out.println();
		}
		
		
	}

}
