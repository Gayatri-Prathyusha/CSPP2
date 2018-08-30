import java.util.Scanner;

public class FirstLast6 {
    public static boolean find(int[] arr, int n) {
        
        return arr[0] == 6 || arr[n-1] == 6;
    }
    public static void main (String[] args) {

    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] a = new int[3];
    //int len = a.length-1;
    for (int i = 0; i < n; i++) {
        int b = s.nextInt();
        a[i] = b;
    }
    System.out.println(find (a, n));
    
}
}