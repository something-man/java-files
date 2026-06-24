import java.util.Scanner;

public class file03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        System.out.print("Enter a age: ");
        int age = sc.nextInt();

        System.out.print("Enter a percentage: ");
        double percentage = sc.nextDouble();

            System.out.println("The number is ");

            System.out.println("The number is Negative.");

            System.out.println("The number is Zero.");

        sc.close();
    }
}