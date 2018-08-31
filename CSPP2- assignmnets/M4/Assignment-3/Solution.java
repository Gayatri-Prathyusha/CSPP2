
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
import java.lang.*;
public class Solution
{/*
	Do not modify this main function.
	*/
	public static int binaryToDecimal(String num) {
         int dec = Integer.parseInt(num, 2);
         //System.out.println();
         // int dec = 0;
         // int p = 0;
         // while (num != null) {
         //    dec+=((num % 10) * Math.pow(2,p));
         //    num = num / 10;
         //    p++;
         //    }
            
            return dec;
		}

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0;i<=n;i++){
			String s = sc.nextLine();
			int res = 0;
			if(!s.isEmpty()) {
				res = binaryToDecimal(s);//Write binaryToDecimal function
				System.out.println(res);
			}
		}
	}

}
