// Q1
     import java.util.Arrays;

    public class Q1 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 5};
            int[] reversedArr = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                reversedArr[i] = arr[arr.length - 1 - i];
            }

            System.out.println("Original Array: " + Arrays.toString(arr));
            System.out.println("Reversed Array: " + Arrays.toString(reversedArr));
        }
    }

