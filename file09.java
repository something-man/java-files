import java.util.Scanner;

public class file09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch>='A' && ch<='Z') {
            System.err.println("uppercase");
        }
        else if(ch>='a' && ch<='z'){
            System.err.println("lowercase");
        }
        else if(ch>='0'&& ch<='9'){
            System.err.println("number");
        }
        else{
            System.err.println("symbols");
        }
    }
}