import java.util.Scanner;

public class file08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int val1 = sc.nextInt();
        System.out.println("enter the second number:");
        int val2 = sc.nextInt();
        System.out.println("enter the third number:");
        int val3= sc.nextInt();
        if (val1>val2 && val1>val3) {
            System.err.println("val1 is greater");
        }
        else if(val2>val1 && val2>val3){
            System.err.println("val2 is greater");
        }
        else{
            System.err.println("val3 is greater");
        }
    }
}