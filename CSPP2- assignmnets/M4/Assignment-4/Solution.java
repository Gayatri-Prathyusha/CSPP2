
// Given an String, Write a java method that returns the decimal value for the given binary string.


import java.util.Scanner;
import java.lang.*;
public class Solution
{/*
	Do not modify the main function 
	*/
	public static String reverseString(String str) {
		String str1 = "";
		for (int i = 0; i < str.length(); i++) {
			str1 = str.charAt(i) + str1;
		}
		return str1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String reverse = reverseString(s);	
		System.out.println(reverse);
		
	}
	//Write reverseString function

}
