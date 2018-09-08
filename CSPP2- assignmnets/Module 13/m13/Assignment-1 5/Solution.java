import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : 
 */
class Set {
    private int[] set;
    private int size;

    public Set() {
        set = new int[20];
        size = 0;

    }

    public void add(int value) {
        int[] copy;
        // for avoiding the duplicates values
        if ( !contains(value) ) {
            if ( size > set.length ) {
                copy = new int[set.length * 2];
                System.arraycopy(set, 0, copy,0,set.length);
                set = copy;
            }
            set[size] = value;
            size++;
        } else {
            System.out.println("value already exists");
        }
    }

    public String toString()
    {
        String result = "{";
        for(int i = 0; i < size; i++) {
            result += "" + set[i];
            if ( i < size - 1 ) {
                result += ",";
            }
        }
        result += "}";
        return result;
    }
    public boolean contains(int value) {
        boolean result = false;
        for(int i = 0; i < size; i++) {
            if ( set[i] == value ) {
                result = true;
            }
        }

        return result;
    }

    public Set intersection(Set other) {
        Set result = new Set();

        for ( int i = 0; i < size; ++i ) {
            if ( other.in(set[i]) ) {
                result.add(set[i]);
            }
        }
        return result;
    }

    public boolean equals(Set other) {
        boolean result = false;

        int count = 0;

        for ( int i = 0; i < size; ++i ) //iterating over this
        {
            if ( other.contains(set[i]) ) {
                count++;
            }

            if ( count == size ) {
                result = true;
            }
        }
        return result;
    }
    public int[][] cartesian (Set other) {
        int [][] a = new int [this.size * other.size][this.size * other.size];
        int k = 0;
        for ( int i = 0; i < this.size; ++i ) {
            for ( int j = 0; j < other.size; ++j ) {
                a[i][j] = set[i];
                a[i][j] = other.add(j);
            }
        }
        return cart;   
    }
}
    /**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        /**
         * private empty constructor.
         */

    }
    public static int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }
        /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                case "cartesianProduct":
                s = new Set();
                t = new Set();
                intArray = intArray(tokens[1]);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}
