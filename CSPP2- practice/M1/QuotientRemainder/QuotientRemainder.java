import java.util.Scanner;
class QuotientRemainder{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int rem = a % b;
		float quot = a / b;
		System.out.println("Quotient: " + quot);
		System.out.println("Remainder: " + rem);
    }
}
