/**
 * Program to find whether the given input string  has minimum of 6 characters
 */
import java.util.Scanner;
/**
 * Class for input validator.
 */
class InputValidator {
    /**.
     * { var_description }
     */
    private String str;
    /**.
     * Constructs the object.
     *
     * @param      input  The input
     */
    protected InputValidator(final String input) {
        /**.
         * { item_description }
         */
        this.str = input;
    }
    /**.
     * making the value 6 to a variable to remove magic number
     */
    public static final int N_U_M = 6;
    /**.
     * { function_description }
     *
     * @param      input  The input
     *
     * @return     { description_of_the_return_value }
     */
    public static boolean validateData(final String input) {
        /**.
         * { item_description }
         */
        return input.length() >= N_U_M;
    }

}
/**.
 * Class for solution.
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
     * { item_description }
     */

    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        /**.
         * { var_description }
         */
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData(input));

    }

}
