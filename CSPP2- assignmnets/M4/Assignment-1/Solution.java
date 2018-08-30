/**.
 * { program to find the largest numbers in the given array}
 */
import java.util.Scanner;

/**.
 * Class for solution.
 */
public final class Solution {
    /*
    Fill this main function to print maximum of given array
    */
    /**.
     * Constructs the object.
     */
    private Solution() {
        /**.
         * { item_description }
         */
    }
    /**.
     * { function_description }
     *
     * @param      arr   The arr
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static int largest(final int[] arr, final int n) {
        /**.
         * { var_description }
         */
        int max = arr[0];
        for(int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**.
         * { var_description }
         */
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            a[i] = b;
        }
    System.out.println(largest(a, n));

    }
}
