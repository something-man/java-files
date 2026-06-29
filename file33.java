class father{
    void land(){
        System.out.println("land");
    }
}
class daughter extends father{
    void house(){
        System.out.println("house");
    }
}
class son extends father{
    void car(){
        System.out.println("car");
    }
}
public class file33{
    public static void main(String[] args) {
        son c1 = new son();
        c1.land();
        c1.car();
        System.out.println("");
        daughter c2 = new daughter();
        c2.land();
        c2.house();
    }
}