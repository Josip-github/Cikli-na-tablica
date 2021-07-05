import java.util.Arrays;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {

		int n = Integer.parseInt(
				JOptionPane.showInputDialog("Unesite broj elemenata."));

		int[][] ct = new int[n][n];

		int k = 1, c1 = 0, c2 = n - 1, r1 = 0, r2 = n - 1;

		while (k <= n * n) {

			for (int i = c1; i <= c2; i++) {
				ct[r1][i] = k++;
			}

			for (int j = r1 + 1; j <= r2; j++) {
				ct[j][c2] = k++;
			}

			for (int i = c2 - 1; i >= c1; i--) {
				ct[r2][i] = k++;
			}

			for (int j = r2 - 1; j >= r1 + 1; j--) {
				ct[j][c1] = k++;
			}

			c1++;
			c2--;
			r1++;
			r2--;

		}
		
			System.out.println("Ciklièka tablica:");

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(ct[i][j] + "\t");
				}
				System.out.println();
			}
		}

	}


