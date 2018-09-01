import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author :
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * { var_description }
     */
    private static final int FOUR = 4;
  /**
   * This is to remove magic number error.
  */

    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
            for (int i = FOUR; i < n; i++) {
      if (i % 2 != 0) {
        int count = 0;
        for (int i1 = 1; i1 <= (i / 2 + 1); i1++) {
          if (i % i1 == 0) {
            count += 1;
          }
        }
        if (count >= 2) {
          System.out.println(i);
        }
      }
    }
  }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}

