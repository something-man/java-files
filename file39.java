interface camera{
    void clickphoto();
}
interface musicplayer{
    void playmusic();
}
class smartphone implements camera,musicplayer{
    public void clickphoto(){
        System.out.println("photo is clicking");
    }
    public void playmusic(){
        System.out.println("music is playing");
    }
}
public class file39{
    public static void main(String[] args) {
        smartphone obj = new smartphone();
        obj.clickphoto();
        obj.playmusic();
    }
}