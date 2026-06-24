
public class file25 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello");
        sb.append(" java");
        System.out.println(sb);
        sb.insert(5," world");
        System.out.println(sb);
        sb.delete(5,11);
        System.out.println(sb);
        sb.replace(6, 10, "python");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(8));
    }
}