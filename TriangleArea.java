import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and height of the triangle: ");
        double b= sc.nextDouble();
        double h=sc.nextDouble();
        double area=0.5*b*h;
        System.out.printf("area= %.2f" ,area);
        sc.close();

    }
}

