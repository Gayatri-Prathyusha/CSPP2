import java.util.Scanner;
class Student {
    String rollno;
    String name;
    float m1, m2, m3;
    //float gpa;
    public  Student(String name, String rollno, float m1, float m2, float m3) {
        this.name = name;
        this.rollno = rollno;
        //this.gpa = gpa;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;

    }
        public static float mgpa(float m1, float m2, float m3) {
            return (m1+m2+m3)/3;

        }
}
    public class StudentDetails {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String sname = sc.nextLine();
            String rollno = sc.nextLine();
            float m1 = sc.nextFloat();
            float m2 = sc.nextFloat();
            float m3 = sc.nextFloat();
            Student stu = new Student(sname, rollno, m1, m2, m3);
            float num = stu.mgpa(m1, m2, m3); 
            System.out.println(java.lang.Math.floor(num * 10) / 10);
        }

}