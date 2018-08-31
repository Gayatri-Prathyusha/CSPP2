import java.util.*;
import java.lang.*;
public class Concatinate {
	public static String helloName(String s1) {
		String str = new String("Hello ");
		return str.concat(s1)+"!";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 =sc.next();
        
		System.out.println(helloName(str1));

	}
}