import java.util.Scanner;

class father{
    void land(){
        System.out.println("land");
    }
}
class daughter extends father{
    String name;
    void house(){
        System.out.println("house:"+name);
    }
}
class son extends father{
    int num;
    void car(){
        System.out.println("car:"+num);
    }
}
public class file34{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter name:");
        String name=sc.nextLine();
        System.out.println("enter num:");
        int num=sc.nextInt();

        daughter c2 = new daughter();
        c2.name=name;
        c2.land();
        c2.house();

        System.out.println("");

        son c1 = new son();
        c1.num=num;
        c1.land();
        c1.car();
    }
}