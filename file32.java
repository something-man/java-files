class grandfather{
    void land(){
        System.out.println("land");
    }
}
class father extends grandfather{
    void house(){
        System.out.println("house");
    }
}
class son extends father{
    void car(){
        System.out.println("car");
    }
}
public class file32{
    public static void main(String[] args) {
        son c1 = new son();
        c1.land();
        c1.house();
        c1.car();
    }
}