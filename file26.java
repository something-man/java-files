public class file26 {
    public static void main(String[] args) {

        int length = 1000;
        int width = 500;
        int height = 500;

        long volume = (long) length * width * height;

        if (volume >= 1000000000)
            System.out.println("Big Box");
        else
            System.out.println("Small Box");
    }
}

public class file26 {
    public static void main(String[] args) {

        String s = "0101";
        int ones = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                ones++;
        }

        String result = "";

        for (int i = 0; i < ones - 1; i++)
            result += "1";

        for (int i = 0; i < s.length() - ones; i++)
            result += "0";

        result += "1";

        System.out.println(result);
    }
}

public class file26 {
    public static void main(String[] args) {

        String s1 = "a1";
        String s2 = "c3";

        int color1 = (s1.charAt(0) + s1.charAt(1)) % 2;
        int color2 = (s2.charAt(0) + s2.charAt(1)) % 2;

        if (color1 == color2)
            System.out.println("Same Color");
        else
            System.out.println("Different Color");
    }
}