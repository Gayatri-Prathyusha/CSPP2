import java.util.Scanner;
//import Math.*;
public class Solution {
	/*
	Do not modify this main function.
	*/
	public static double areaOfTriangle(int base, int height)
	{
		
		return 0.5*base*height;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		int height = scan.nextInt();
		areaOfTriangle(base, height);
		System.out.println(areaOfTriangle(base,height));
	}
	/*
	Need to fill the areaOfTriangle function and print the output
	of fahrenheit.
	*/
}