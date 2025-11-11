package Practice;
import java.util.Arrays;
public class SecLargest {
    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(getSecSmall(arr));
    }
    static int getSecSmall(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = n - 2; i >= 0; i--){
            // return the first element which is not equal to the largest element
            if (arr[i] != arr[n - 1])
                return arr[i];
        }
        return -1;
    }
}
