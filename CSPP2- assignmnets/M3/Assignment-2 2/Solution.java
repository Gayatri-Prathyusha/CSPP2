
import java.util.Scanner;
/*
	Do not modify this main function.
	*/

public class Solution {
	static int number0f7s(int n) {
    int count = 0;
    while (n > 0) {
        if (n % 10 == 7)
        count++;
 
        n = n / 10;
    }
    return count;
}
 
    // Counts the number of '7' 
    // digits between 0 and n 
    static int numberOf7sinRange(int n) {
     
        // Initialize result
        int count = 0; 
 
        // Count 7's in every number 
        // from 7 to n
        for (int i = 7; i <= n; i++)
        count += number0f7s(i);
 
        return count;
}
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        System.out.println(numberOf7sinRange(n));


        
       
        
    }
}