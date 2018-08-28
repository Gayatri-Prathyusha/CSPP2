import java.util.Scanner;
import java.lang.Math.*;
public class Solution {
	public static void rootsOfQuadraticEquation(int a,int b,int c){
        double sq = Math.sqrt((b*b) - (4*a*c));
        double quad1 = ((-b + sq)/(2 * a));
        double quad2 = ((-b - sq)/(2 * a));
        System.out.println(quad1 +" "+ quad2);
        //System.out.println(quad2);

	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
}
