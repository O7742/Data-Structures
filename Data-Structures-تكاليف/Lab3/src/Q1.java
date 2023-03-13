import java.util.Arrays;
//arr
public class Q1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1.clone();

        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Cloned array: " + Arrays.toString(arr2));
    }
}