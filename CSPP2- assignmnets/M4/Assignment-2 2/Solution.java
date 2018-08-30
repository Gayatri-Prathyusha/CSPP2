import java.util.*;
public class Solution {
	/* Fill the main function to print resultant of addition of matrices*/
	public static void addmatrix(int[][] a, int[][] b, int r1, int c1, int r2, int c2) {
		
		int[][] c = new int[r1][c2];
		if (r1 == r2 && c1 == c2) {
			for(int i = 0; i < r1; i++) {
				for (int j = 0; j < c2; j++) {
					
					c[i][j] = a[i][j] + b[i][j]; 

				}
			}
			for (int i = 0; i < r1; i++) {
			    for (int j = 0; j < c2; j++) {
				    System.out.println(c[i][j]);
		}

			
		}
    
        }
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int[][] a= new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int x = sc.nextInt();
				a[i][j] = x;
			}
		}
		Scanner s = new Scanner(System.in);
		int rows2 = s.nextInt();
		int cols2 = s.nextInt();
		int[][] b = new int[rows2][cols2];
		for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < cols2; j++) {
				int y = sc.nextInt();
				b[i][j] = y;
			}
		}
		addmatrix(a, b, rows, cols, rows2, cols2);

	}
}