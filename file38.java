interface fathers{
    void studys();
}
interface mothers{
    void cleans();
}
class grandfathers{
    void plays(){
        System.out.println("the son is playing");
    }
}
class son extends grandfathers implements fathers,mothers{
    public void studys(){
        System.out.println("the son is studying");
    }
    public void cleans(){
        System.out.println("the son is cleaning");
    }
}
public class file38{
    public static void main(String[] args) {
        son obj = new son();
        obj.studys();
        obj.cleans();
        obj.plays();
    }
}