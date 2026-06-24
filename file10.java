import java.util.Scanner;

public class file10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the p:");
        double p = sc.nextDouble();
        System.out.println("enter the r:");
        double r = sc.nextDouble();
        System.out.println("enter the t:");
        double t = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.println("simple intrest is:"+si);
    }
}