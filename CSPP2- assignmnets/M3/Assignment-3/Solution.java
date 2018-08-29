/**.
 * { Program to find the Greatest common divisor of two numbers }
 */
import java.util.Scanner;
/*
    Do not modify this main function.
    */
    /**.
     * { item_description }
     */
public final class Solution {
    /**.
     * Constructs the object.
     */
    private Solution() {
        /**
         * { item_description }
         */
    }
    /**.
     * { function_description }
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static int gcd(final int a, final int b) {
        /**.
         * { var_description }
         */
        int greatcd = 0;
        for (int i = 1; i <= a && i <= b; ++i) {
            // Checks if i is factor of both integers
            if (a % i == 0 && b % i == 0) {
                greatcd =  i;
            }
        }
        return greatcd;
    }

    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**
         * { var_description }
         */
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();

        System.out.println(gcd(n1, n2));
    }
    /*
    Need to write the gcd function and print the output.
    */
}
