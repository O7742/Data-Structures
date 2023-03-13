//Q3
   import java.util.Arrays;

    public class Q3 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int[] backupArr = arr.clone();

            System.out.println("Original Array: " + Arrays.toString(arr));
            System.out.println("Backup Array: " + Arrays.toString(backupArr));
        }
    }

