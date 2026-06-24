import java.util.Arrays;

public class file23 {
    public static void main(String[] args) {

        int[] arr = {10, 70, 80, 40, 10, 25, 30};

        Arrays.sort(arr);

        System.out.println("Second Largest = " + arr[arr.length - 2]);
    }
}