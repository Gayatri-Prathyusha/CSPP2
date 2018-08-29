/**.
 *{ To get the number of 7's present until n value }
 */
import java.util.Scanner;
/**.
 * Class for solution.
 */

public final class Solution {
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
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static int numberof7s(int n) {
        /**.
         * { Function to return the number of 7's present in one number}
         */
    int count = 0;
    while (n > 0) {
        /**.
         * { item_description }
         */
        if (n % 10 == 7)
        count++;
 
        n = n / 10;
    }
    /**.
     * { Returns the value if the 7 is present or not and how many are present}
     */
    return count;
}
 
    // Counts the number of '7' 
    // digits between 0 and n

    /**.
     * { function_description }
     *
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    static int numberinrange(int n) {
        /**.
         * { Function to retuen the Number of 7's present until n value }
         */
     
        // Initialize result
        int count = 0; 
 
        // Count 7's in every number 
        // from 7 to n
        for (int i = 7; i <= n; i++)
        count += numberof7s(i);
        return count;
}
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        /**.
         * { Main function}
         */
        
        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        System.out.println(numberinrange(n));
 
    }
}
