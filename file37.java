interface father{
    void study();
}
interface mother{
    void clean();
}
class son implements father,mother{
    public void study(){
        System.out.println("the son is studying");
    }
    public void clean(){
        System.out.println("the son is cleaning");
    }
}
public class file37{
    public static void main(String[] args) {
        son obj = new son();
        obj.study();
        obj.clean();
    }
}