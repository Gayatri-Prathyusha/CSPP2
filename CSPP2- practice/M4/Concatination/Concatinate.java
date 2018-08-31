import java.util.*;
import java.lang.*;
public class Concatinate {
	public static String helloName(String s, String s1) {
		return s.concat(s1)+"!";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = new String("Hello ");
		String str1 =sc.next();
        
		System.out.println(helloName(str, str1));

	}
}