import java.util.Scanner;
public class BallVolume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the ball: ");
        double r= sc.nextDouble();
        double v=(4/3)* Math.PI* Math.pow(r,3);
        System.out.printf("volume= " +v);
        sc.close();

    }
}


