
import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static int largest(int[] arr, int n) {
        int max = arr[0];
		for(int i = 0; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int b = sc.nextInt();
			a[i] = b;
		}
	System.out.println(largest(a, n));

	}
}
