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
class grandmothers{
    void eats(){
        System.out.println("the daughter is eating");
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
class daughter extends grandmothers{
    public void dancing(){
        System.out.println("the daughter is dancing");
    }
}
public class file40{
    public static void main(String[] args) {
        son obj = new son();
        obj.studys();
        obj.cleans();
        obj.plays();
        System.out.println("");
        daughter obj01 = new daughter();
        obj01.dancing();
        obj01.eats();
    }
}