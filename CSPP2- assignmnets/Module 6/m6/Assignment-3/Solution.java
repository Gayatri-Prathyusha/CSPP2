import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a java program to replace each element
 *  of the given char array that matches the given
 *  character with the given replacement.
 */
final class Solution {
  /**
   * Default Constructor.
  */
  private Solution() {
    /**
     * Unused.
    */
  }
  /**
   * Replace all function.
   *
   * @param      charArray  The character array
   * @param      oldChar    The old character
   * @param      newChar    The new character
   *
   * @return     { description_of_the_return_value }
   */
  static char[] replaceAll(final char[] charArray,
                           final char oldChar, final char newChar) {
    int i = 0;
    for (char element : charArray) {
      if (element == oldChar) {
        charArray[i] = newChar;
      }
      i += 1;
    }
    return charArray;
  }
  /**
   * Main function.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    char[] charArray = new char[n];
    for (int i = 0; i < n; i++) {
      charArray[i] = scan.next().charAt(0);
    }
    char oldChar = scan.next().charAt(0);
    char newChar = scan.next().charAt(0);
    char[] newCharArray = replaceAll(charArray, oldChar, newChar);
    System.out.println(Arrays.toString(newCharArray));
  }
}
