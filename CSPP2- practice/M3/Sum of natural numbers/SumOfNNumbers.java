import java.util.Scanner;
class SumOfNNumbers {
	public static void main(String[] args) {
		System.out.print("Enter the n value until which number you need sum: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		for (; i<= n; i++) {
			sum = sum + i;
		}
		System.out.println( " Sum = " + sum);

	}
}