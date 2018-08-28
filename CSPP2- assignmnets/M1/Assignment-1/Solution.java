/* java program to print name and rool no */
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        System.out.println("Name : Roll Number : ");
        int roll;
        String name;

        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        roll = sc.nextInt();
        System.out.println("Name :" + name + "\tRoll Number : " + roll);
    }
}
