import java.util.*;
class InputValidator {
	String str;
	public InputValidator(final String input) {
		this.str = input;

	}
	public static boolean validateData(final String input) {
		return input.length() >= 6;
	}

}
public class Solution {
	public static void main(final String args[])
    {
    	Scanner s = new Scanner(System.in);
    	String input = s.next();
    	InputValidator i = new InputValidator(input);    	
    	System.out.println(i.validateData(input));

    }

}
