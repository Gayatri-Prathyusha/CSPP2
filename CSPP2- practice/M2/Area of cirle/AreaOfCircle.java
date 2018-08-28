import java.util.*;
import java.lang.Math.*;
class AreaOfCircle{
	public static double pi(){
		return 3.14;
	}
	public static double area(int x){
        double y = x * x;
        return y;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double rad = area(r);
        double pi = pi();
        double radius = pi *rad;
		System.out.println("Area of the circle: "+ radius);
	}
}
