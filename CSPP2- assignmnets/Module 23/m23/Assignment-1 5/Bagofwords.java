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
