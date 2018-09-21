import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.util.ArrayList;

/**
 * Class for solution.
 */
public class Solution {
  /**
   * { var_description }
   */
  private static final int Hundred = 100;
  /**
   * { function_description }
   *
   * @param      args       The arguments
   *
   * @throws     Exception  { exception_description }
   */
  protected static void main(final String[] args)throws Exception {
    /**
     * { var_description }
     */
    ArrayList<String> input = new ArrayList<>();
    ArrayList<String> inputnames = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    try {
      String string = sc.next();
      File file = new File(string);
      File[] listOfFiles = file.listFiles();
      for (File file1:listOfFiles) {
        try {
          inputnames.add(file1.getName());
          Scanner sc1 = new Scanner(file1);
          String s = "";
          while (sc1.hasNext()) {
            s += sc1.nextLine() + " ";
          }
          input.add(s);
        } catch (FileNotFoundException e) {
          System.out.println(e.getMessage());
        }
      }
      String[] inputarray = new String[inputnames.size()];
      inputarray = inputnames.toArray(inputarray);
      Arrays.sort(inputarray);
      ArrayList<Integer> results = new ArrayList<>();
      double resulttemp = 0.0;
      int max = 0;
      String s5 = "";
      for (int i = 0; i < input.size(); i++) {
        String s1 = input.get(i);
        Bagofwords bag1 = new Bagofwords(s1);
        bag1.cleanWords();
        bag1.calculateFrequency();
        for (int j = 0; j < input.size(); j++) {
          String s2 = input.get(j);
          Bagofwords bag2 = new Bagofwords(s2);
          bag2.cleanWords();
          bag2.calculateFrequency();

          resulttemp = bag1.crossProduct(bag2.getMap()) * Hundred;
          int a = (int) Math.round(resulttemp);
          if (max < a && i != j) {
            max = a;
            s5 = "Maximum similarity is between "
             + inputarray[i] + " and " + inputarray[j];
          }
          results.add(a);
        }
      }
      // System.out.println(results);
      String s3 = "\t\t";
      //System.out.println(inputarray.toString());
      for (String r:inputarray) {
        s3 += r + "\t";
      }
      System.out.println(s3);
      int k = 0;
      for (int i = 0; i < inputarray.length; i++) {
        String s4 = inputarray[i] + "\t";
        if (i != 0) {
          k = i * (inputarray.length - 1) + i;
        }
        for (int j = k; j < results.size(); j++) {
          // System.out.println(j);
          s4 += results.get(j) + "\t\t";
          if ((j + 1) % (inputarray.length) == 0 && j != 0) {
            break;
          }
        }
        System.out.println(s4);
      }
      System.out.println(s5);
    } catch (Exception e) {
      System.out.println("empty directory");
    }
  }
}


