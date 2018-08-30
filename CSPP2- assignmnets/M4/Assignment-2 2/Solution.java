/**
 * { Program to find the addition of two matrices}
 */
import java.util.Scanner;
/**
 * { item_description }
 */
public final class Solution {
    /**
     * { item_description }
     */
    /* Fill the main function to print resultant of addition of matrices*/
    private Solution() {
        /**
         * { item_description }
         */
    }
    /**
     * { function_description }
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      r1    The r 1
     * @param      c1    The c 1
     * @param      r2    The r 2
     * @param      c2    The c 2
     */
    public static void addmatrix(final int[][] a, final int[][] b, final int r1, final int c1, final int r2, final int c2) {
        /**
         * { var_description }
         */
        
        int[][] c = new int[r1][c2];
        if (r1 == r2 && c1 == c2) {
            for(int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    
                    c[i][j] = a[i][j] + b[i][j]; 

                }
            }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2 - 1; j++) {
                    System.out.print(c[i][j] +" ");
        }
        System.out.println(c[i][c2 - 1]);

            
        }
    
        } else {
            System.out.println("not possible");
        }
    }
    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        /**
         * { var_description }
         */
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();
        int[][] a= new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int x = sc.nextInt();
                a[i][j] = x;
            }
        }
        // Scanner s = new Scanner(System.in);
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();
        sc.nextLine();
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
