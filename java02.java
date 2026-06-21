import java.util.Scanner;

public class java0212 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("false");
            return;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        while (n % 5 == 0) {
            n = n / 5;
        }

        if (n == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}