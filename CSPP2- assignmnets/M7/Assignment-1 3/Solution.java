import java.util.*;
class InputValidator
{
	
	String str;
	public InputValidator(String input) {
		this.str = input;

	}
	public static boolean validateData(String input) {
		return input.length() >= 6;
	}

}
public class Solution
{
	public static void main(String args[])
    {
    	Scanner s=new Scanner(System.in);
    	String input=s.next();
    	InputValidator i=new InputValidator(input);    	
    	System.out.println(i.validateData(input));

    }

}
