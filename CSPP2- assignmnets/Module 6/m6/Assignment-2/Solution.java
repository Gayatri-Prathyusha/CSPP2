import java.util.Scanner;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest 100.
 *
 * @author :
 */
final class Solution {
  /**
   * Constructs the object.
  */
  private static final int N_O = 50;
  /**
   * Unused.
  */
  private static final int N_U_M = 100;
  /**
   * This is to remove magic number error.
  */
  private Solution() {
    //not used
  }
  /**
   * Function to round the
   * elements of a matrix to the nearest 100.
   *
   * @param      a     Matrix of which the elements to be rounded
   * @param      rows     Number of rows
   * @param      columns     Number of columns
   *
   * @return     Matrix of the rounded elements
   */
  static int[][] roundHun(final int[][] a, final int rows, final int columns) {
    int[][] c = new int[rows][columns];
    int maxnum = 0;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        if (maxnum < a[i][j]) {
          maxnum = a[i][j];
        }
      }
    }
    // System.out.println(maxnum);
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        int num = 0;
        for (int k = 0; (k <= maxnum + N_O); k = num * N_U_M) {
          if (Math.abs(a[i][j] - k) < N_O) {
            c[i][j] = k;
        }
          num += 1;
        }
      }
    }
    return c;
  }
  /**
   * Main function.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    int m = scan.nextInt();
    int n = scan.nextInt();
    int[][] a = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        a[i][j] = scan.nextInt();
      }
    }
    int[][] b = roundHun(a, m, n);
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n - 1; j++) {
        System.out.print(b[i][j] + " ");
      }
      System.out.println(b[i][n - 1]);
    }
  }
}
