import java.util.*;
class BiggerEqualSmaller{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int var_a = sc.nextInt();
		int var_b = sc.nextInt();
		if (var_a > var_b) 
			System.out.println("Bigger");
		else if (var_a == var_b) 
			System.out.println("Equal");
		else 
			System.out.println("Smaller");
		
	}
}