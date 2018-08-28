 import java.util.*;
class DegreesToFahrenheit
	{
		public static void main(String[] args) {
			double  c,f;
			System.out.println("Enter Celsius temperation that you want to convert:");
			Scanner sc = new Scanner(System.in);
			c = sc.nextFloat();
			//f = sc.nextFloat();


			//c = (f-32)*(5/9);
			f = (1.8*c) + 32;
			System.out.println("The fahrenheit temperature is:" + f);
		}
	}