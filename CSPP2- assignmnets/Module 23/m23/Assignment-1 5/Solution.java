import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
import java.util.ArrayList;


class Bagofwords {

  private String[] string;
  private Map <String, Integer> bagOfWords;

  Bagofwords(final String string1) {
    string = string1.split(" ");
    bagOfWords = new HashMap<>();
  }

  public void cleanWords() {
    for (int i = 0; i < string.length; i++) {
      string[i] = string[i].replaceAll("[^a-zA-Z0-9_]", "").toLowerCase().trim();
    }
  }
  public String getString() {
    return Arrays.toString(string);
  }
  public Map getMap() {
    return bagOfWords;
  }
  
  public void calculateFrequency() {
    // System.out.println("reached1");
    for (String s1:string) {
      bagOfWords.putIfAbsent(s1, 0);
      bagOfWords.put(s1, bagOfWords.get(s1) + 1);  
    }
  }

  public double calculateNorm(Map<String, Integer> bag) {
    // System.out.println("reached2");
    int s = 0;
    for (String s1:bag.keySet()) {
      s += Math.pow(bag.get(s1), 2);
    }
    // System.out.println(s);
    return Math.sqrt(s);
  }

  public double crossProduct(Map<String, Integer> bag) {
    int s = 0;
    for (String s1:bagOfWords.keySet()) {
      if (bag.containsKey(s1)) {
        s += (bag.get(s1) * bagOfWords.get(s1));
      }
    }
    double d = s/(calculateNorm(bag) * calculateNorm(bagOfWords));
    // System.out.println(s);
    return d;
  }
}

public class Solution {
  public static void main(String[] args) {
    ArrayList<String> input = new ArrayList<>();
    ArrayList<String> inputnames = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
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
        // System.out.println(s);
        input.add(s);
      } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
      }
    }
    // System.out.println(input);
    ArrayList<Integer> results = new ArrayList<>();
    double resulttemp = 0.0;
    int max = 0;
    String s5 = "";
    for (int i = 0; i < input.size(); i++) {
      // System.out.println(inputnames.get(i));
      String s1 = input.get(i);
      Bagofwords bag1 = new Bagofwords(s1);
      // if (i == 0) {
      //   System.out.println(bag1.getMap());
      // }
      // System.out.println(bag1.getString());
      bag1.cleanWords();
      bag1.calculateFrequency();
      for (int j = 0; j < input.size(); j++) {
        // System.out.println(s1);
        // System.out.println(inputnames.get(j));
        String s2 = input.get(j);
        // System.out.println(s2);
        Bagofwords bag2 = new Bagofwords(s2);
        // System.out.println(bag2.getString());
        bag2.cleanWords();
        bag2.calculateFrequency();
        // if (i == 1) {
        //   System.out.println(bag2.getMap());
        // }
        // System.out.println(bag1.getMap());
        // System.out.println(bag2.getMap());
        // System.out.println(bag1.crossProduct(bag2.getMap()));
        resulttemp = bag1.crossProduct(bag2.getMap()) * 100;
        int a = (int) Math.round(resulttemp);
        if (max < a && i != j) {
          max = a;
          s5 = "Maximum similarity is between " + inputnames.get(i) + " and " + inputnames.get(j);
        }
        results.add(a);
      }
    }
    // System.out.println(results.size());
    String s3 = "      \t";
    for (String r:inputnames) {
      s3 += r + "\t";
    }
    System.out.println(s3);
    int i1 = 0;
    for (int i = 0; i < inputnames.size(); i++) {
      String s4 = inputnames.get(i) + "\t";
      if (i != 0) {
        i1 = i * 4 + i;
        // System.out.println(i1);
      }
      for (int j = i1; j < results.size(); j++) {
        // System.out.println(j);
        s4 += results.get(j) + "\t\t";
        if ((j + 1)%5 == 0 && j != 0) {
          break;
        }
      }
      System.out.println(s4);
    }
    System.out.println(s5);
  }
}


