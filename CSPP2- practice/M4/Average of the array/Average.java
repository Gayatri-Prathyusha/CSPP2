import java.util.Scanner;
public class Average {
	public static double averagesum(int[] arr, int n) {
		int sum = 0;
		double avg = 0.0;
		for(int element :arr) {
			sum = sum + element;

		}
		return sum/n;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int b = s.nextInt();
			a[i] = b;
		}
		System.out.println(averagesum(a, n));

	}
}