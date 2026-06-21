import java.util.Scanner;

public class java04196 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        int digits = 0;

        // Count the number of digits
        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = n;
        int sum = 0;

        // Calculate sum of digits raised to the power of digits
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}