import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static double calculateFromDegreesToFarenheit(double degreesCelsius)
	{
		// double Fahrenheit;
		// Fahrenheit = (degreesCelsius*1.8)+(32);
		return degreesCelsius*1.8+32;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double degreesCelsius = scan.nextDouble();
		
		calculateFromDegreesToFarenheit(degreesCelsius);
		
		System.out.println(calculateFromDegreesToFarenheit(degreesCelsius));
	}
	/*
	Need to fill the calculateFromDegreesToFarenheit function and print the output
	of fahrenheit.
	*/
}