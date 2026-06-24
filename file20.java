public class file20 {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        System.out.print("After removing duplicates: ");

        for (int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            // Check if arr[i] already appeared before
            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Print only if it's not a duplicate
            if (!isDuplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}