import java.util.Arrays;
//Equal
public class Q4{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {4, 5, 6};

        boolean isEqual1 = Arrays.equals(arr1, arr2);
        boolean isEqual2;
        if (Arrays.equals(arr1, arr3)) isEqual2 = true;
        else isEqual2 = false;
    }