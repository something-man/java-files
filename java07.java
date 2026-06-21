import java.util.Scanner;

public class java07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bottles: ");
        int numBottles = sc.nextInt();

        System.out.print("Enter exchange value: ");
        int numExchange = sc.nextInt();

        int total = 0;
        int empty = 0;

        while (numBottles > 0) {

            total = total + numBottles;
            empty = empty + numBottles;

            numBottles = empty / numExchange;
            empty = empty % numExchange;
        }

        System.out.println("Maximum bottles drank = " + total);

        sc.close();
    }
}