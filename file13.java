import java.util.Scanner;

public class file13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int password = 1234;
        int entered;
        int count = 1;

        do {
            System.out.print("Enter Password: ");
            entered = sc.nextInt();

            if (entered == password) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Wrong Password");
            }

            count++;

        } while (count <= 3);

        if (count > 3 && entered != password) {
            System.out.println("Card Blocked");
        }

        sc.close();
    }
}