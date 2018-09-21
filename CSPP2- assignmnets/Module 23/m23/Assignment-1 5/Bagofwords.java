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
      string[i] = string[i].replaceAll("[^a-zA-Z0-9_]", " ").trim();
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
    // public static int longestSubstring(String str1, String str2) {
    //     char[] ch1 = str1.toCharArray();
    //     char[] ch2 = str1.toCharArray();
    //     int a = str1.length();
    //     int b = str2.length();
    //     int maxres = 0;
    //     float sum = a + b;
    //     System.out.println(sum);

    //     str1 = str1.replaceAll("[ ]", "");
    //     str2 = str2.replaceAll("[ ]", "");

    //     // int lcs = longestSubstring(line.toCharArray(), line1.toCharArray());
    //     // System.out.println(lcs)
    //     // int lenofstrings = ch1.length + ch2.length;

    //     int[][] dp = new int[a + 1][b + 1];

    //     for(int i = 0; i <= a; i++) {
    //         for(int j = 0 ; j <= b; j++) {
    //             if(i == 0 || j == 0) {
    //                 dp[i][j]= 0;
    //             } else if (ch1[i - 1] == ch2[j - 1]) {
    //                 dp[i][j] = dp[i-1][j-1]+1;
    //                 maxres = Math.max(maxres, dp[i][j]);
    //             } else {
    //                 dp[i][j] = 0;
    //                 }
    //             }
    //         }
    //     float match = ((maxres * 2)/ sum) * 100;
    //     //System.out.println(match);
    //     int matchvalue = (int) match;
    //     //System.out.println(matchvalue + "%");

    //     return matchvalue;
    // }



}
